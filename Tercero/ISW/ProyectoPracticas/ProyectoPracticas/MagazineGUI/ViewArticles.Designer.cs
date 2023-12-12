
namespace MagazineGUI
{
    partial class ViewArticles
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
            this.components = new System.ComponentModel.Container();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.paperBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.ejemplarComboBox = new System.Windows.Forms.ComboBox();
            this.label1 = new System.Windows.Forms.Label();
            this.belongingAreaDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.titleDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.responsibleDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.coAuthorsDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.evaluationDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.evaluationPendingAreaDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.publicationPendingAreaDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.paperBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridView1
            // 
            this.dataGridView1.AutoGenerateColumns = false;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.belongingAreaDataGridViewTextBoxColumn,
            this.titleDataGridViewTextBoxColumn,
            this.responsibleDataGridViewTextBoxColumn,
            this.coAuthorsDataGridViewTextBoxColumn,
            this.evaluationDataGridViewTextBoxColumn,
            this.evaluationPendingAreaDataGridViewTextBoxColumn,
            this.publicationPendingAreaDataGridViewTextBoxColumn});
            this.dataGridView1.DataSource = this.paperBindingSource;
            this.dataGridView1.Location = new System.Drawing.Point(41, 109);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowHeadersWidth = 51;
            this.dataGridView1.RowTemplate.Height = 24;
            this.dataGridView1.Size = new System.Drawing.Size(928, 334);
            this.dataGridView1.TabIndex = 0;
            // 
            // paperBindingSource
            // 
            this.paperBindingSource.DataSource = typeof(Magazine.Entities.Paper);
            // 
            // ejemplarComboBox
            // 
            this.ejemplarComboBox.FormattingEnabled = true;
            this.ejemplarComboBox.Location = new System.Drawing.Point(188, 28);
            this.ejemplarComboBox.Name = "ejemplarComboBox";
            this.ejemplarComboBox.Size = new System.Drawing.Size(121, 24);
            this.ejemplarComboBox.TabIndex = 1;
            this.ejemplarComboBox.SelectedIndexChanged += new System.EventHandler(this.ejemplarComboBox_SelectedIndexChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(78, 31);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(79, 16);
            this.label1.TabIndex = 2;
            this.label1.Text = "Nº Ejemplar";
            // 
            // belongingAreaDataGridViewTextBoxColumn
            // 
            this.belongingAreaDataGridViewTextBoxColumn.DataPropertyName = "ds_BelongingArea";
            this.belongingAreaDataGridViewTextBoxColumn.HeaderText = "BelongingArea";
            this.belongingAreaDataGridViewTextBoxColumn.MinimumWidth = 6;
            this.belongingAreaDataGridViewTextBoxColumn.Name = "belongingAreaDataGridViewTextBoxColumn";
            this.belongingAreaDataGridViewTextBoxColumn.Width = 125;
            // 
            // titleDataGridViewTextBoxColumn
            // 
            this.titleDataGridViewTextBoxColumn.DataPropertyName = "ds_Title";
            this.titleDataGridViewTextBoxColumn.HeaderText = "Title";
            this.titleDataGridViewTextBoxColumn.MinimumWidth = 6;
            this.titleDataGridViewTextBoxColumn.Name = "titleDataGridViewTextBoxColumn";
            this.titleDataGridViewTextBoxColumn.Width = 125;
            // 
            // responsibleDataGridViewTextBoxColumn
            // 
            this.responsibleDataGridViewTextBoxColumn.DataPropertyName = "ds_Responsible";
            this.responsibleDataGridViewTextBoxColumn.HeaderText = "Responsible";
            this.responsibleDataGridViewTextBoxColumn.MinimumWidth = 6;
            this.responsibleDataGridViewTextBoxColumn.Name = "responsibleDataGridViewTextBoxColumn";
            this.responsibleDataGridViewTextBoxColumn.Width = 125;
            // 
            // coAuthorsDataGridViewTextBoxColumn
            // 
            this.coAuthorsDataGridViewTextBoxColumn.DataPropertyName = "ds_CoAuthors";
            this.coAuthorsDataGridViewTextBoxColumn.HeaderText = "CoAuthors";
            this.coAuthorsDataGridViewTextBoxColumn.MinimumWidth = 6;
            this.coAuthorsDataGridViewTextBoxColumn.Name = "coAuthorsDataGridViewTextBoxColumn";
            this.coAuthorsDataGridViewTextBoxColumn.Width = 125;
            // 
            // evaluationDataGridViewTextBoxColumn
            // 
            this.evaluationDataGridViewTextBoxColumn.DataPropertyName = "ds_Evaluation";
            this.evaluationDataGridViewTextBoxColumn.HeaderText = "Evaluation";
            this.evaluationDataGridViewTextBoxColumn.MinimumWidth = 6;
            this.evaluationDataGridViewTextBoxColumn.Name = "evaluationDataGridViewTextBoxColumn";
            this.evaluationDataGridViewTextBoxColumn.Width = 125;
            // 
            // evaluationPendingAreaDataGridViewTextBoxColumn
            // 
            this.evaluationPendingAreaDataGridViewTextBoxColumn.DataPropertyName = "ds_EvaluationPendingArea";
            this.evaluationPendingAreaDataGridViewTextBoxColumn.HeaderText = "EvaluationPendingArea";
            this.evaluationPendingAreaDataGridViewTextBoxColumn.MinimumWidth = 6;
            this.evaluationPendingAreaDataGridViewTextBoxColumn.Name = "evaluationPendingAreaDataGridViewTextBoxColumn";
            this.evaluationPendingAreaDataGridViewTextBoxColumn.Width = 125;
            // 
            // publicationPendingAreaDataGridViewTextBoxColumn
            // 
            this.publicationPendingAreaDataGridViewTextBoxColumn.DataPropertyName = "ds_PublicationPendingArea";
            this.publicationPendingAreaDataGridViewTextBoxColumn.HeaderText = "PublicationPendingArea";
            this.publicationPendingAreaDataGridViewTextBoxColumn.MinimumWidth = 6;
            this.publicationPendingAreaDataGridViewTextBoxColumn.Name = "publicationPendingAreaDataGridViewTextBoxColumn";
            this.publicationPendingAreaDataGridViewTextBoxColumn.Width = 125;
            // 
            // ViewArticles
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1067, 554);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.ejemplarComboBox);
            this.Controls.Add(this.dataGridView1);
            this.Margin = new System.Windows.Forms.Padding(4);
            this.Name = "ViewArticles";
            this.Text = "ViewArticles";
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.paperBindingSource)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.ComboBox ejemplarComboBox;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.BindingSource paperBindingSource;
        private System.Windows.Forms.DataGridViewTextBoxColumn belongingAreaDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn titleDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn responsibleDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn coAuthorsDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn evaluationDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn evaluationPendingAreaDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn publicationPendingAreaDataGridViewTextBoxColumn;
    }
}