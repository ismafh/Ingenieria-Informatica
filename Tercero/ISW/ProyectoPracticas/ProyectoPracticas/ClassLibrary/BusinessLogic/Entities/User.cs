using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//primera entrega
namespace Magazine.Entities
{
    public partial class User : Person
    {
        public User(string id, string name, string surname,
                    bool alerted, string areasOfInterest, string email, string login, string password) : base (id, name, surname)
        {
            this.Alerted = alerted;
            this.AreasOfInterest = areasOfInterest;
            this.Email = email;
            this.Login = login;
            this.Password = password;

            this.MainAuthoredPapers = new List<Paper>();
        }

        public User()
        {
            this.MainAuthoredPapers = new List<Paper>();
        }
    }
}
