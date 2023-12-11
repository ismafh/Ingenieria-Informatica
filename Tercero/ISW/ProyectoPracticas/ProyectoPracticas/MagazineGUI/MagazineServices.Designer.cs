namespace MagazineGUI
{
    partial class MagazineServices
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
            this.logoutbtn = new System.Windows.Forms.Button();
            this.sendpaperbtn = new System.Windows.Forms.Button();
            this.evaluatebtn = new System.Windows.Forms.Button();
            this.compileissuebtn = new System.Windows.Forms.Button();
            this.viewerbtn = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // logoutbtn
            // 
            this.logoutbtn.Location = new System.Drawing.Point(707, 398);
            this.logoutbtn.Name = "logoutbtn";
            this.logoutbtn.Size = new System.Drawing.Size(75, 23);
            this.logoutbtn.TabIndex = 0;
            this.logoutbtn.Text = "logout";
            this.logoutbtn.UseVisualStyleBackColor = true;
            this.logoutbtn.Click += new System.EventHandler(this.logoutbtn_Click);
            // 
            // sendpaperbtn
            // 
            this.sendpaperbtn.Location = new System.Drawing.Point(338, 74);
            this.sendpaperbtn.Name = "sendpaperbtn";
            this.sendpaperbtn.Size = new System.Drawing.Size(138, 23);
            this.sendpaperbtn.TabIndex = 1;
            this.sendpaperbtn.Text = "Submit paper";
            this.sendpaperbtn.UseVisualStyleBackColor = true;
            this.sendpaperbtn.Click += new System.EventHandler(this.sendpaperbtn_Click);
            // 
            // evaluatebtn
            // 
            this.evaluatebtn.Location = new System.Drawing.Point(338, 177);
            this.evaluatebtn.Name = "evaluatebtn";
            this.evaluatebtn.Size = new System.Drawing.Size(138, 23);
            this.evaluatebtn.TabIndex = 2;
            this.evaluatebtn.Text = "Evaluate paper";
            this.evaluatebtn.UseVisualStyleBackColor = true;
            // 
            // compileissuebtn
            // 
            this.compileissuebtn.Location = new System.Drawing.Point(338, 265);
            this.compileissuebtn.Name = "compileissuebtn";
            this.compileissuebtn.Size = new System.Drawing.Size(138, 23);
            this.compileissuebtn.TabIndex = 3;
            this.compileissuebtn.Text = "Compile issue";
            this.compileissuebtn.UseVisualStyleBackColor = true;
            // 
            // viewerbtn
            // 
            this.viewerbtn.Location = new System.Drawing.Point(338, 350);
            this.viewerbtn.Name = "viewerbtn";
            this.viewerbtn.Size = new System.Drawing.Size(138, 23);
            this.viewerbtn.TabIndex = 4;
            this.viewerbtn.Text = "See All Articles";
            this.viewerbtn.UseVisualStyleBackColor = true;
            // 
            // MagazineServices
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.viewerbtn);
            this.Controls.Add(this.compileissuebtn);
            this.Controls.Add(this.evaluatebtn);
            this.Controls.Add(this.sendpaperbtn);
            this.Controls.Add(this.logoutbtn);
            this.Name = "MagazineServices";
            this.Text = "MagazineServices";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button logoutbtn;
        private System.Windows.Forms.Button sendpaperbtn;
        private System.Windows.Forms.Button evaluatebtn;
        private System.Windows.Forms.Button compileissuebtn;
        private System.Windows.Forms.Button viewerbtn;
    }
}