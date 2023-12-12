using Magazine.Entities;
using Magazine.Persistence;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net.Mail;
using System.Runtime.InteropServices;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace Magazine.Services
{
    public class MagazineService : IMagazineService
    {
        private readonly IDAL dal;
        private User user;

        public MagazineService(IDAL dal)
        {
            this.dal = dal;
        }

        public MagazineService()
        {
        }

        public void RemoveAllData()
        {
            dal.RemoveAllData();
        }

        public void Commit()
        {
            dal.Commit();
        }

        public void DBInitialization()
        {
            RemoveAllData();

            User u1 = new User("1234", "Pepe", "TheBoss", false, "ninguna", "ptheboss@gmail.com", "theboss", "1234");
            AddUser(u1);

            Magazine.Entities.Magazine m = new Magazine.Entities.Magazine("Revista Universitaria", u1);
            AddMagazine(m);

            User u2 = new User("2345", "Javier", "Garcia", false, "la mia", "jgarcia@gmail.com", "jgarcia", "1234");
            AddUser(u2);
            Area a1 = new Area("Area 1", u2, m);
            AddArea(a1);

            User u3 = new User("3456", "Mª Carmen", "Jimenez", false, "la mia por supuesto", "mcjimenez@gmail.com", "mcjimenez", "1234");
            AddUser(u3);
            Area a2 = new Area("Area 2", u3, m);
            AddArea(a2);

            // De regalo
            User u4 = new User("4567", "Juan", "Campeador", false, "la mejor", "jcampeador@gmail.com", "jcampeador", "1234");
            AddUser(u4);
        }

        public void AddPerson(Person person)
        {
            // Restricción: No puede haber dos personas con el mismo DNI
            if (dal.GetById<Person>(person.Id) == null)
            {
                dal.Insert<Person>(person);
                dal.Commit();
            }
            else throw new ServiceException("Person with Id " + person.Id + " already exists.");
        }

        public void AddMagazine(Magazine.Entities.Magazine magazine)
        {
            // Restricción: No puede haber dos revistas con el mismo nombre
            if (!dal.GetWhere<Magazine.Entities.Magazine>(x => x.Name == magazine.Name).Any())
            {
                dal.Insert<Magazine.Entities.Magazine>(magazine);
                dal.Commit();
            }
            else throw new ServiceException("Magazine with name " + magazine.Name + " already exists.");
        }

        public void AddArea(Area area)
        {
            // Restricción: No puede haber dos areas con el mismo nombre
            if (!dal.GetWhere<Area>(x => x.Name == area.Name).Any())
            {
                dal.Insert<Area>(area);
                dal.Commit();
            }
            else throw new ServiceException("Area with name " + area.Name + " already exists.");
        }

        // A partid de aquí escribid vuestras implementaciones
        public void AddUser(User u)
        {
            if (dal.Exists<User>(u.Id) == false)
            {
                dal.Insert<User>(u);
                dal.Commit();
            }
            else throw new ServiceException("Usario ya existente");
            
         }


        public void AddPaper(Paper p)
        {
            if (!dal.GetWhere<Paper>(x => x.Title == p.Title).Any())
            {
                dal.Insert<Paper>(p);
                dal.Commit();
            }
            else throw new ServiceException("Artículo ya existente");
        }

        public void RemovePaper(Paper p)
        {
            if (dal.GetWhere<Paper>(x => x.Title == p.Title).Any())
            {
                dal.Delete<Paper>(p);
                dal.Commit();
            }
            else throw new ServiceException("Artículo no existente");
        }

        public void Login(String login, String password)
        {
            user = dal.GetWhere<User>(x => x.Login == login).First();
            if (user != null)
            {
                if (user.Password != password)
                {
                    throw new ServiceException("Password incorrecto");
                }
                else Console.Out.WriteLine("Contraseña encontrada");
            }
            else throw new ServiceException("Login with login " + login + " already exists.");
        }

        public User UserLogged() { return user; }

        public void Logout() { user = null; }

        public void SendPaper(Paper pp)
        {
            if (UserLogged() == null)
                throw new ServiceException("User not logged in");
            
            dal.Insert<Paper>(pp);
            dal.Commit();
        }

        public Area FindAreaByName(String name)
        {
            Area a = dal.GetWhere<Area>(x => x.Name == name).First();

            if (a != null)
                return a;
            else 
                throw new ServiceException("Area with Name: " + name + " does not exist.");
        }

        public Person FindPersonById(String id)
        {
            return dal.GetById<Person>(id);
        }

        public Paper FindPaperById(String id)
        {
            Paper pp = dal.GetWhere<Paper>(x => x.Title == id).First();
            return pp;
        }


        public IList<Magazine.Entities.Magazine> GetAllMagazines()
        {
            return new List<Magazine.Entities.Magazine>(dal.GetAll<Magazine.Entities.Magazine>());
        }

        public IList<Magazine.Entities.Paper> GetAllPapers()
        {
            return new List<Magazine.Entities.Paper>(dal.GetAll<Magazine.Entities.Paper>());
        }
    }
}