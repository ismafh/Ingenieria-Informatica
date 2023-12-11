using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Magazine.Entities
{
    public partial class Magazine
    {
        public Magazine (string name, User chiefEditor)
        {
            this.Name = name;
            this.ChiefEditor = chiefEditor;

            this.Areas = new List<Area>();
            this.Issues = new List<Issue>();
        }

        public Magazine()
        {
            this.Areas = new List<Area>();
            this.Issues = new List<Issue>();
        }

        public Issue LastIssueNotPublished()
        {
            foreach(Issue i in Issues)
            {
                if (i.PublicationDate == null)
                    return i;
            }

            Issue iempty = new Issue();
            return iempty;
        }
    }
}
