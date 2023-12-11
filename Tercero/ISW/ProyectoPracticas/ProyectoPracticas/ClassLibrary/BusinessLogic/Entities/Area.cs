using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Magazine.Entities
{
    public partial class Area
    {
        public Area (string name, User editor, Magazine magazine)
        {
            this.Name = name;
            this.Magazine = magazine;
            this.Editor = editor;

            this.Papers = new List<Paper>();
            this.EvaluationPending = new List<Paper>();
            this.PublicationPending = new List<Paper>();
        }

        public Area ()
        {
            this.Papers = new List<Paper>();
            this.EvaluationPending = new List<Paper>();
            this.PublicationPending = new List<Paper>();
        }
    }
}
