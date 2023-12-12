using System;
using System.Data.Entity.Validation;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Magazine.Entities;
using Magazine.Persistence;


namespace DBTest
{
    class Program
    {
        static void Main(string[] args)
        {

            try
            {
                new Program();
            }
            catch (Exception e)
            {
                printError(e);
            }
            Console.WriteLine("\nPulse una tecla para salir");
            Console.ReadLine();
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


        Program()
        {
            IDAL dal = new EntityFrameworkDAL(new MagazineDbContext());

            CreateSampleDB(dal);
        }

        private void CreateSampleDB(IDAL dal)
        {
            dal.RemoveAllData();
            Console.WriteLine("Creando los datos y almacenándolos en la BD");
            Console.WriteLine("===========================================");

            Console.WriteLine("\n// CREACIÓN DE UNA REVISTA Y SU EDITOR EN JEFE");
            User u1 = new User("1234", "Pepe", "TheBoss", false, "ninguna", "pgarcia@gmail.com", "theboss", "1234");
            dal.Insert<User>(u1);
            dal.Commit();

            Magazine.Entities.Magazine m = new Magazine.Entities.Magazine("Revista Universitaria", u1);
            u1.Magazine = m;

            dal.Insert<Magazine.Entities.Magazine>(m);
            dal.Commit();

            Console.WriteLine("Nombre de la revista: " + m.Name);
            Console.WriteLine("  Editor de la revista: " + m.ChiefEditor.Name + " " + m.ChiefEditor.Surname);

            Console.ReadKey();

            // Populate here the rest of the database with data

            User u2 = new User("1235", "José Luís", "Kechouane", false, "ninguna", "joker@gmail.com", "josolo777", "ketchupkechouane");
            dal.Insert<User>(u2);
            dal.Commit();

            Area a1 = new Area("Area1", u2, m);
            dal.Insert<Area>(a1);
            dal.Commit();

            Issue i1 = new Issue(7755, m);
            dal.Insert<Issue>(i1);
            dal.Commit();

            User u3 = new User("1236", "Ismael", "Pulga", false, "ninguna", "lapulga@gmail.com", "leomessi", "lionelandresmessicuccini");
            dal.Insert<User>(u3);
            dal.Commit();

            DateTime dt = new DateTime(2002, 05, 27);

            Paper p1 = new Paper("La gran victoria de la EPSA", dt, a1, u3);
            dal.Insert<Paper>(p1);
            dal.Commit();

            Paper p2 = new Paper();
            dal.Insert<Paper>(p2);
            dal.Commit();

            a1.EvaluationPending.Add(p1);
            dal.Insert<Area>(a1);
            dal.Commit();

            p1.EvaluationPendingArea = a1;
            dal.Insert<Paper>(p1);
            dal.Commit();

        }
    }
}