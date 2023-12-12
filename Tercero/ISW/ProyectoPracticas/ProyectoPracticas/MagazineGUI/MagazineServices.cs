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
    public partial class MagazineServices : Form
    {
        public MagazineServices()
        {
            InitializeComponent();
        }

        private void logoutbtn_Click(object sender, EventArgs e)
        {
            //logout
            this.Close();
        }

        private void sendpaperbtn_Click(object sender, EventArgs e)
        {
            Form sendPaper = new SendPaper();
            sendPaper.Show();
            this.Close();
        }
    }
}
