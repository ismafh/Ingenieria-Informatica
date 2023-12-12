using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Magazine.Entities;


namespace Magazine.Services
{
    public interface IMagazineService
    {
        void RemoveAllData();
        void Commit();

        // Necesario para la inicialización de la BD
        void DBInitialization();
        void AddPerson(Person p);
        void AddMagazine(Magazine.Entities.Magazine m);
        void AddArea(Area a);

        // A partir de aquí cread los vuestros
        void AddUser(User u);
        void Login(string username, string password);
        User UserLogged();
        void Logout();
        void SendPaper(Paper pp);
        Area FindAreaByName(String name);
        Person FindPersonById(String id);
        Paper FindPaperById(String id);
        IList<Magazine.Entities.Magazine> GetAllMagazines();

        IList<Magazine.Entities.Paper> GetAllPapers();
    }
}
