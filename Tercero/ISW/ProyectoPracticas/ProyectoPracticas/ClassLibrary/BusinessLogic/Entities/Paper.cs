using Magazine.Services;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Magazine.Entities
{
    public partial class Paper
    {
        public Paper(string title, DateTime uploaddate, Area belongingArea, User responsible)
        {
            this.Title = title;
            this.UploadDate = uploaddate;
            this.Responsible = responsible;
            this.BelongingArea = belongingArea;

            this.CoAuthors = new List<Person>();
            this.CoAuthors.Add(responsible);
        }

        public Paper()
        {
            this.CoAuthors = new List<Person>();
        }

        public void addCoAuthor(Person p)
        {
            if (!this.CoAuthors.ToList().Contains(p))
            {
                if (this.CoAuthors.ToList().Count() < 4)
                    this.CoAuthors.Add(p);
                else throw new ServiceException("There are already 4 coauthors in this paper");

            }
            else throw new ServiceException("This is already a coauthor");
        }
    }
}
