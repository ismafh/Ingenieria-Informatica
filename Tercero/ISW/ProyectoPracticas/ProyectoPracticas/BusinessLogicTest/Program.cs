using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using System.Data.Entity.Validation;
using System.IO.Ports;

using Magazine.Entities;
using Magazine.Persistence;
using Magazine.Services;
using System.Runtime.Remoting.Channels;

namespace BusinessLogicTest
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                // Crea el objeto de servicio
                IMagazineService service = new MagazineService(new EntityFrameworkDAL(new MagazineDbContext()));

                // Lo pasa a Program para que lo utilice
                new Program(service);
            }
            catch (Exception e)
            {
                printError(e);
                Console.WriteLine("Press any key.");
                Console.ReadLine();
            }
        }

        static void printError(Exception e)
        {
            while (e != null)
            {
                if (e is DbEntityValidationException)
                {
                    DbEntityValidationException dbe = (DbEntityValidationException)e;

                    foreach (var eve in dbe.EntityValidationErrors)
                    {
                        Console.WriteLine("Entity of type \"{0}\" in state \"{1}\" has the following validation errors:",
                            eve.Entry.Entity.GetType().Name, eve.Entry.State);
                        foreach (var ve in eve.ValidationErrors)
                        {
                            Console.WriteLine("- Property: \"{0}\", Value: \"{1}\", Error: \"{2}\"",
                                ve.PropertyName,
                                eve.Entry.CurrentValues.GetValue<object>(ve.PropertyName),
                                ve.ErrorMessage);
                        }
                    }
                }
                else
                {
                    Console.WriteLine("ERROR: " + e.Message);
                }
                e = e.InnerException;
            }
        }


        private IMagazineService service;

        Program(IMagazineService service)
        {
            this.service = service;

            DBInitialization();

            LoginTest();
            Console.WriteLine("Press any key to continue...");
            Console.ReadKey();

            // A partir de aquí vuestras pruebas
            PaperTest();
            Console.WriteLine("Press any key to continue...");
            Console.ReadKey();

            EvaluatePaper("Area 1");
            Console.WriteLine("Press any key to continue...");
            Console.ReadKey();
            Console.Out.WriteLine("Prueba confeccionar ejemplar");
            ConfEjem();
        }

        void DBInitialization()
        {
            try
            {
                Console.WriteLine("INITIALIZATING DB...");

                service.DBInitialization();
            }
            catch (Exception e)
            {
                printError(e);
            }
            Console.WriteLine("DATA CREATED.");
        }

        void LoginTest()
        {
            Console.WriteLine();
            Console.WriteLine("\nTesting login...");

            try
            {
                service.Login("theboss", "1234");
                if (service.UserLogged().Login != "theboss")
                    Console.Out.WriteLine("Error con el usuario identificado.");
                else
                    Console.Out.WriteLine("WELCOME " + service.UserLogged().Name + " " + service.UserLogged().Surname);
                service.Logout();
                if (service.UserLogged() != null)
                    Console.Out.WriteLine("Sigue alguien identificado.");
            }
            catch (Exception e)
            {
                printError(e);
            }
        }

        // A partir de aquí vuestras pruebas

        void PaperTest()
        {
            Console.WriteLine("\nTesting Papers...");

            Person p = service.FindPersonById("2345");
            User u = (User)p;
            service.Login(u.Login, u.Password);
            Console.Out.WriteLine("Usuario " + u.Login + " loggeado");

            Magazine.Entities.Magazine m = new Magazine.Entities.Magazine("Revista1",u);
            service.AddMagazine(m);
            Console.Out.WriteLine("Magazine " + m.Name + " creada");

            Area a = service.FindAreaByName("Area 1");
            Paper pp = new Paper("Paper1",DateTime.Now,a,u);

            try
            {
                if (service.UserLogged() != null)
                {
                    service.SendPaper(pp);
                    Console.Out.WriteLine("El papel " + pp.Title + " ha sido enviado correctamente");
                }
                else
                    Console.Out.WriteLine("El usuario " + u.Login + " no esta conectado");
            }
            catch (Exception e)
            {
                printError(e);
            }
        }
        public void EvaluatePaper(string n)
        {
            Area a = service.FindAreaByName(n);
            Person pe = service.FindPersonById("2345");
            User u = (User)pe;
            service.Login(u.Login, u.Password);
            Console.Out.WriteLine("\nUsuario " + u.Login + " loggeado");


            if (service.UserLogged() != a.Editor)
                throw new ServiceException("User with login " + service.UserLogged().Login + " does not exist.");
            else
            {
                if (a.EvaluationPending.Count == 0)
                    Console.Out.WriteLine("Evaluationpending list of area " + a.Name + " is empty");
                else
                {
                    int i = 0;

                    foreach (Paper p in a.EvaluationPending)
                        Console.Out.WriteLine("Paper pending number " + ++i + ". Paper title: " + p.Title + "; Paper upload date: "
                                              + p.UploadDate + "; Paper responsible: " + p.Responsible);

                    Console.WriteLine("Type the title of the paper you want to be evaluated: ");
                    String desiredName = Console.ReadLine();

                    Paper pp = service.FindPaperById(desiredName);

                    Console.Out.WriteLine("\n ------------------------------------ ");
                    Console.Out.WriteLine("Paper title: " + pp.Title + "\nPaper upload date: "
                                          + pp.UploadDate + "\nPaper responsible: " + pp.Responsible + "\nPaper belonging area: " + pp.BelongingArea);

                    foreach (Person coauthor in pp.CoAuthors)
                        Console.Out.WriteLine(coauthor);

                    Console.Out.WriteLine("Starting paper evaluation\n");
                    Console.Out.WriteLine("Paper accepted? ( 1 = yes, 2 = no )");
                    int z = int.Parse(Console.ReadLine());

                    if (z == 1)
                        pp.Evaluation.Accepted = true;
                    else if (z == 2)
                        pp.Evaluation.Accepted = false;
                    else
                        throw new ServiceException("Not a valid answer");

                    Console.Out.WriteLine("Add a comment: \n");
                    String comment = Console.ReadLine();

                    pp.Evaluation.Comments = comment;
                    service.SendPaper(pp);
                }
            }
        }

        public void ConfEjem()
        {
            User u = service.UserLogged();
            Console.Out.WriteLine(u.Magazine.Name);
            Magazine.Entities.Magazine m = service.GetAllMagazines().First();
            m.ChiefEditor = u;
            Console.Out.WriteLine(m.Name);
            Issue i = m.LastIssueNotPublished();

            if (u == m.ChiefEditor)
            {
                Console.Out.WriteLine("Magazine id: " + m.Id + " Chief Editor: " + u);
                Console.Out.WriteLine("Would you like to edit the date? ( 1 = yes, 2 = no )");
                int z = int.Parse(Console.ReadLine());

                if (z == 1)
                {
                    Console.Out.WriteLine("Introduce day: ");
                    int day = int.Parse(Console.ReadLine());
                    Console.Out.WriteLine("Introduce month: ");
                    int month = int.Parse(Console.ReadLine());
                    Console.Out.WriteLine("Introduce year: ");
                    int year = int.Parse(Console.ReadLine());

                    DateTime date = new DateTime();
                    date=date.AddDays(day-1);
                    date=date.AddMonths(month-1);
                    date=date.AddYears(year-1);
                    Console.Out.WriteLine(date);

                    i.PublicationDate = date;
                    Console.Out.WriteLine("Fecha : " + i.PublicationDate);

                    Console.Out.Write("Area name: ");
                    String name = Console.ReadLine();
                    Area a = service.FindAreaByName(name);

                }
                else if (z == 2)
                {
                    Console.Out.Write("The date will not be modified");
                }
                else throw new ServiceException("Not a valid answer");

            }
            else throw new ServiceException("The user is not the chief editor");
        }
    }
}
