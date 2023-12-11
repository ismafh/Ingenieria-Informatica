
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
    public partial class ViewArticles : Form
    {
        private IMagazineService service;
        public ViewArticles(IMagazineService service)
        {
            InitializeComponent();
            this.service = service;
            LoadData();
        }


        public void LoadData()
        {
            IList<Paper> papers = service.GetAllPapers();
            ejemplarComboBox.Items.Clear();
            if (papers != null)
                foreach (Paper p in papers)
                    ejemplarComboBox.Items.Add(p.BelongingArea);
            ejemplarComboBox.SelectedIndex = -1;
            ejemplarComboBox.ResetText();
            paperBindingSource.DataSource = null;
        }

        private void ejemplarComboBox_SelectedIndexChanged(object sender, EventArgs e)
        {
            string Id = (string)ejemplarComboBox.SelectedItem;
            IList<Paper> papers = (IList<Paper>)service.FindPaperById(Id);
            if (papers == null)
            {
                MessageBox.Show("Número de ejemplar no existente");
                return;
            }

            BindingList<object> bindingList = new BindingList<object>();
            foreach (Paper p in papers)
                bindingList.Add(new
                {
                    ds_Title = p.Title,
                    ds_BelongingArea = p.BelongingArea,
                    ds_Responsible = p.Responsible,
                    ds_Coauthors = p.CoAuthors,
                    ds_Evaluation = p.Evaluation,
                    ds_EvaluationPendingArea = p.EvaluationPendingArea,
                    ds_PublicationPendingArea = p.PublicationPendingArea

                });
        }

    }
}