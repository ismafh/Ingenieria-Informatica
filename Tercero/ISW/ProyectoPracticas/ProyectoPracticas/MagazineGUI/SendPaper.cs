using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Magazine.Entities;
using Magazine.Services;

namespace MagazineGUI
{
    public partial class SendPaper : Form
    {
        public SendPaper()
        {
            InitializeComponent();
        }

        private void namebox_TextChanged(object sender, EventArgs e)
        {
            //estaria apagado hasta que no se seleccione el area
        }

        private void subbtn_Click(object sender, EventArgs e)
        {

            var ServiceInstance = new MagazineService();
            Paper p = new Paper
            {
                Title = namebox.Text,
                UploadDate = DateTime.Now,
                BelongingArea = ServiceInstance.FindAreaByName(areabox.Text),
                Responsible = ServiceInstance.UserLogged(),
            };

            ServiceInstance.AddPaper(p);
        }

        private void areabox_Validating(object sender, CancelEventArgs e)
        {
            var ServiceInstance = new MagazineService();
            try
            {
                ServiceInstance.FindAreaByName(areabox.Text);
                namebox.Enabled = true;
                namebox.BackColor = Color.White;
            }
            catch (ServiceException)
            {
                errorlabel.Text = "Error: area doesn't exist";
            }
        }

        private void cancelbutton_Click(object sender, EventArgs e)
        {
            Form back = new MagazineServices();
            back.Show();
            this.Close();
        }

        private void SendPaper_Load(object sender, EventArgs e)
        {

        }
    }
}
