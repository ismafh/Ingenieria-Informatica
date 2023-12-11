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
    public partial class MagazineApp : Form
    {
        private IMagazineService service;
        public MagazineApp(IMagazineService service)
        {
            InitializeComponent();
            this.service = service;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form signup = new MagazineAppSignup();
            signup.Show();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form login = new MagazineAppLogin();
            login.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
