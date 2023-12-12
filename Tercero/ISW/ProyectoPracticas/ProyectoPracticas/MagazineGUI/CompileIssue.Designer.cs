namespace MagazineGUI
{
    partial class CompileIssue
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
            this.Lista1 = new System.Windows.Forms.ListBox();
            this.Lista2 = new System.Windows.Forms.ListBox();
            this.label1 = new System.Windows.Forms.Label();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.comboBox1 = new System.Windows.Forms.ComboBox();
            this.SuspendLayout();
            // 
            // Lista1
            // 
            this.Lista1.FormattingEnabled = true;
            this.Lista1.ItemHeight = 16;
            this.Lista1.Location = new System.Drawing.Point(539, 190);
            this.Lista1.Name = "Lista1";
            this.Lista1.Size = new System.Drawing.Size(209, 260);
            this.Lista1.TabIndex = 0;
            this.Lista1.SelectedIndexChanged += new System.EventHandler(this.listBox1_SelectedIndexChanged);
            // 
            // Lista2
            // 
            this.Lista2.FormattingEnabled = true;
            this.Lista2.ItemHeight = 16;
            this.Lista2.Location = new System.Drawing.Point(745, 190);
            this.Lista2.Name = "Lista2";
            this.Lista2.Size = new System.Drawing.Size(210, 260);
            this.Lista2.TabIndex = 1;
            this.Lista2.SelectedIndexChanged += new System.EventHandler(this.listBox2_SelectedIndexChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(101, 72);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(125, 16);
            this.label1.TabIndex = 2;
            this.label1.Text = "Nº Revista en curso";
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(104, 105);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(122, 22);
            this.textBox1.TabIndex = 3;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(101, 275);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(123, 16);
            this.label2.TabIndex = 4;
            this.label2.Text = "Seleccione el área;";
            // 
            // comboBox1
            // 
            this.comboBox1.FormattingEnabled = true;
            this.comboBox1.Location = new System.Drawing.Point(104, 318);
            this.comboBox1.Name = "comboBox1";
            this.comboBox1.Size = new System.Drawing.Size(122, 24);
            this.comboBox1.TabIndex = 5;
            // 
            // CompileIssue
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1003, 513);
            this.Controls.Add(this.comboBox1);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.Lista2);
            this.Controls.Add(this.Lista1);
            this.Name = "CompileIssue";
            this.Text = "CompileIssue";
            this.Load += new System.EventHandler(this.CompileIssue_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListBox Lista1;
        private System.Windows.Forms.ListBox Lista2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ComboBox comboBox1;
    }
}