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
    public partial class MagazineAppSignup : Form
    {
        public MagazineAppSignup()
        {
            InitializeComponent();
        }

        private void cancelbtn_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void nextbtn_Click(object sender, EventArgs e)
        {
            //aqui iria adduser
            Form services = new MagazineServices();
            services.Show();
            this.Close();
        }
    }
}
