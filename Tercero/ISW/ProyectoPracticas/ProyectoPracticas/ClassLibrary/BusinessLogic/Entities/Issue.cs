using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Magazine.Entities
{
    public partial class Issue
    {
        public Issue(int number, Magazine magazine)
        {
            this.Number = number;
            this.Magazine = magazine;

            this.PublishedPapers = new List<Paper>();
        }

        public Issue()
        {
            this.PublishedPapers = new List<Paper>();
        }
    }
}
