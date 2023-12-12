using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Magazine.Entities
{
    public partial class Person
    {
        public string Id { get; set; }

        public string Name { get; set; }

        public string Surname { get; set; }

        public virtual ICollection<Paper> CoAuthoredPapers { get; set; }       
    }
}