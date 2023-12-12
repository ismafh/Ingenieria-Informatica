namespace MagazineGUI
{
    partial class SendPaper
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.selectorlabel = new System.Windows.Forms.Label();
            this.namebox = new System.Windows.Forms.TextBox();
            this.namelabel = new System.Windows.Forms.Label();
            this.errorlabel = new System.Windows.Forms.Label();
            this.subbtn = new System.Windows.Forms.Button();
            this.areabox = new System.Windows.Forms.TextBox();
            this.cancelbtn = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // selectorlabel
            // 
            this.selectorlabel.AutoSize = true;
            this.selectorlabel.Location = new System.Drawing.Point(271, 109);
            this.selectorlabel.Name = "selectorlabel";
            this.selectorlabel.Size = new System.Drawing.Size(98, 13);
            this.selectorlabel.TabIndex = 0;
            this.selectorlabel.Text = "Seleccone un Área";
            // 
            // namebox
            // 
            this.namebox.BackColor = System.Drawing.Color.Gray;
            this.namebox.Enabled = false;
            this.namebox.Location = new System.Drawing.Point(412, 190);
            this.namebox.Name = "namebox";
            this.namebox.Size = new System.Drawing.Size(121, 20);
            this.namebox.TabIndex = 2;
            // 
            // namelabel
            // 
            this.namelabel.AutoSize = true;
            this.namelabel.Location = new System.Drawing.Point(274, 190);
            this.namelabel.Name = "namelabel";
            this.namelabel.Size = new System.Drawing.Size(101, 13);
            this.namelabel.TabIndex = 3;
            this.namelabel.Text = "Nombre del Artículo";
            // 
            // errorlabel
            // 
            this.errorlabel.AutoSize = true;
            this.errorlabel.ForeColor = System.Drawing.Color.Red;
            this.errorlabel.Location = new System.Drawing.Point(277, 154);
            this.errorlabel.Name = "errorlabel";
            this.errorlabel.Size = new System.Drawing.Size(0, 13);
            this.errorlabel.TabIndex = 4;
            // 
            // subbtn
            // 
            this.subbtn.Location = new System.Drawing.Point(280, 287);
            this.subbtn.Name = "subbtn";
            this.subbtn.Size = new System.Drawing.Size(75, 23);
            this.subbtn.TabIndex = 5;
            this.subbtn.Text = "Enviar";
            this.subbtn.UseVisualStyleBackColor = true;
            this.subbtn.Click += new System.EventHandler(this.subbtn_Click);
            // 
            // areabox
            // 
            this.areabox.Location = new System.Drawing.Point(412, 106);
            this.areabox.Name = "areabox";
            this.areabox.Size = new System.Drawing.Size(121, 20);
            this.areabox.TabIndex = 6;
            this.areabox.Validating += new System.ComponentModel.CancelEventHandler(this.areabox_Validating);
            // 
            // cancelbtn
            // 
            this.cancelbtn.Location = new System.Drawing.Point(455, 287);
            this.cancelbtn.Name = "cancelbtn";
            this.cancelbtn.Size = new System.Drawing.Size(75, 23);
            this.cancelbtn.TabIndex = 7;
            this.cancelbtn.Text = "Cancelar";
            this.cancelbtn.UseVisualStyleBackColor = true;
            this.cancelbtn.Click += new System.EventHandler(this.cancelbutton_Click);
            // 
            // SendPaper
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.cancelbtn);
            this.Controls.Add(this.areabox);
            this.Controls.Add(this.subbtn);
            this.Controls.Add(this.errorlabel);
            this.Controls.Add(this.namelabel);
            this.Controls.Add(this.namebox);
            this.Controls.Add(this.selectorlabel);
            this.Name = "SendPaper";
            this.Text = "SendPaper";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label selectorlabel;
        private System.Windows.Forms.TextBox namebox;
        private System.Windows.Forms.Label namelabel;
        private System.Windows.Forms.Label errorlabel;
        private System.Windows.Forms.Button subbtn;
        private System.Windows.Forms.TextBox areabox;
        private System.Windows.Forms.Button cancelbtn;
    }
}