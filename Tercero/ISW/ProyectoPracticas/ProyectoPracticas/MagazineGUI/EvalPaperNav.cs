using Magazine.Entities;
using Magazine.Services;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MagazineGUI
{
    public partial class EvalPaperNav : Form
    {
        private IMagazineService service;
        public EvalPaperNav(IMagazineService service)
        {
            InitializeComponent();
            this.service = service;
            LoadData();
        }

        public void LoadData()
        {
            IList<Paper> papers = service.GetAllPapers();
            selectAreaComboBox.Items.Clear();
            if (papers != null)
                foreach (Paper p in papers)
                    selectAreaComboBox.Items.Add(p.BelongingArea);
            selectAreaComboBox.SelectedIndex = -1;
            selectAreaComboBox.ResetText();
            areaBindingSource.DataSource = null;

        }

        private void selectAreaComboBox_SelectedIndexChanged(object sender, EventArgs e)
        {
            string name = (string)selectAreaComboBox.SelectedItem;
            ICollection<Area> areas = (ICollection<Area>)service.FindAreaByName(name);


            BindingList<object> bindingList = new BindingList<object>();
            foreach (Area a in areas)
                bindingList.Add(new
                {
                    ds_EvaluationPending = a.EvaluationPending

                });
        }

    }
}
