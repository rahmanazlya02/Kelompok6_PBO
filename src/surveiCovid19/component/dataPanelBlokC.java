/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package surveiCovid19.component;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import surveiCovid19.Database;
import surveiCovid19.blokC;


/**
 *
 * @author Kelompok6
 */
public class dataPanelBlokC extends javax.swing.JPanel {
    private final JScrollPane contentScrollPane;
    /**
     * Creates new form dataPanel
     * @param contentScrollPane
     */
    public dataPanelBlokC(JScrollPane contentScrollPane) {
        this.contentScrollPane = contentScrollPane;
        initComponents();
        loadTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        eksportButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        blokCtable = new javax.swing.JTable();
        editButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        viewButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Data Kuesioner Blok C");
        add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 590, 69));

        searchTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 920, 30));

        searchButton.setBackground(new java.awt.Color(81, 137, 198));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Cari");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 130, 100, 30));

        eksportButton.setBackground(new java.awt.Color(81, 137, 198));
        eksportButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        eksportButton.setForeground(new java.awt.Color(255, 255, 255));
        eksportButton.setText("Export To Csv");
        eksportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eksportButtonActionPerformed(evt);
            }
        });
        add(eksportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, -1, 34));

        blokCtable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        blokCtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Perusahaan", "Kondisi Pendapatan Usaha", "Penurunan Pendapatan Usaha", "Besaran Spesifik Penurunan", "Peningkatan Pendapatan Usaha", "Besaran Spesifik Peningkatan", "Upaya Meningkatkan Pendapatan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        blokCtable.setRowHeight(30);
        jScrollPane1.setViewportView(blokCtable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 1150, 460));

        editButton.setBackground(new java.awt.Color(81, 137, 198));
        editButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Edit Data");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 680, 130, 34));

        refreshButton.setBackground(new java.awt.Color(81, 137, 198));
        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 130, 100, 30));

        viewButton1.setBackground(new java.awt.Color(81, 137, 198));
        viewButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        viewButton1.setForeground(new java.awt.Color(255, 255, 255));
        viewButton1.setText("View Data");
        viewButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButton1ActionPerformed(evt);
            }
        });
        add(viewButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 680, 130, 34));
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        // Get the search text from the searchTextField
        String searchText = searchTextField.getText().trim();
    
        // Check if the search text is empty
        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan kata kunci pencarian.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
        }
        // Perform the search and update the table
        searchAndUpdateTable(searchText);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchAndUpdateTable(String searchText) {
    DefaultTableModel dtm = (DefaultTableModel) blokCtable.getModel();
    
    // Clear the table before updating it with search results
    while (dtm.getRowCount() > 0) {
        dtm.removeRow(0);
    }
    
    try {
        // Perform the search query
        ArrayList<blokC> searchResults = Database.getInstance().searchBlokC(searchText);
        
        // Update the table with search results
        for (blokC blokC : searchResults) {
            dtm.addRow(new Object[]{
                blokC.getIdPerusahaan(),
                blokC.getIncomeSblmCovid(),
                blokC.getIncomeSblmCovid(),
                blokC.getPenurunan(),
                blokC.getPenurunanLain(),
                blokC.getPeningkatan(),
                blokC.getPeningkatanLain(),
                blokC.getUpayaPeningkatan()
            });
        }
        
        // Show a message if no results found
        if (searchResults.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tidak ada data yang ditemukan.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException ex) {
        Logger.getLogger(dataPanelBlokC.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat melakukan pencarian: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void eksportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eksportButtonActionPerformed
        // TODO add your handling code here:
         // Show file chooser dialog
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");    
        
        int userSelection = fileChooser.showSaveDialog(this);
        
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            try (FileWriter fileWriter = new FileWriter(fileChooser.getSelectedFile() + ".csv")) {
                DefaultTableModel finansialTableModel = (DefaultTableModel) blokCtable.getModel();
                
                // Write Perusahaan Table Header
                for (int i = 0; i < finansialTableModel.getColumnCount(); i++) {
                    fileWriter.write(finansialTableModel.getColumnName(i) + ",");
                }
                fileWriter.write("\n");
                
                // Write Perusahaan Table Data
                for (int i = 0; i < finansialTableModel.getRowCount(); i++) {
                    for (int j = 0; j < finansialTableModel.getColumnCount(); j++) {
                        fileWriter.write(finansialTableModel.getValueAt(i, j).toString() + ",");
                    }
                    fileWriter.write("\n");
                }
           
                JOptionPane.showMessageDialog(this, "Data successfully exported.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(dataPanelBlokA.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error writing to file.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_eksportButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
             // Get the selected row index
    int selectedRowIndex = blokCtable.getSelectedRow();
    
    // Check if a row is selected
    if (selectedRowIndex != -1) {
        // Get the ID of the selected perusahaan
        int idPerusahaan = (int) blokCtable.getValueAt(selectedRowIndex, 0);
        
     try {
            // Create the viewPanel with the necessary parameters and set it to the contentScrollPane
            contentScrollPane.setViewportView(new editDataBlokA(idPerusahaan,contentScrollPane));
        } catch (SQLException ex) {
            Logger.getLogger(dataPanelBlokA.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        // Show a message if no row is selected
        JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dilihat.", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_editButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        loadTableData();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void viewButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButton1ActionPerformed
        // TODO add your handling code here:
             // Get the selected row index
    int selectedRowIndex = blokCtable.getSelectedRow();
    
    // Check if a row is selected
    if (selectedRowIndex != -1) {
        // Get the ID of the selected perusahaan
        int idPerusahaan = (int) blokCtable.getValueAt(selectedRowIndex, 0);
        
     try {
            // Create the viewPanel with the necessary parameters and set it to the contentScrollPane
            contentScrollPane.setViewportView(new viewPanel(contentScrollPane, idPerusahaan));
        } catch (SQLException ex) {
            Logger.getLogger(dataPanelBlokA.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        // Show a message if no row is selected
        JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dilihat.", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_viewButton1ActionPerformed

    private void loadTableData(){ 
       DefaultTableModel dtm = (DefaultTableModel) blokCtable.getModel();
       //DefaultTableModel dtm1 = (DefaultTableModel) dataUmurLebihLima.getModel();
        //refresh tabel 
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        /*while(dtm1.getRowCount()>0){
            dtm1.removeRow(0);
        }*/
        
        try{
            //isi tabel 
            for(blokC blokC: Database.getInstance().selectBlokC()){
                dtm.addRow(new Object[]{
                    
                    blokC.getIdPerusahaan(),
                    blokC.getIncomeSblmCovid(),
                    blokC.getPenurunan(),
                    blokC.getPenurunanLain(),
                    blokC.getPeningkatan(),
                    blokC.getPeningkatanLain(),
                    blokC.getUpayaPeningkatan()}); 
            }
            /*for(umurLebihLima artUmurLebihLima: Database.getInstance().selectumurLebihLima()){
                dtm1.addRow(new Object[]{artUmurLebihLima.getGangguan(),artUmurLebihLima.getJenisGangguan(),artUmurLebihLima.getIjazah(),artUmurLebihLima.getStatusKerja(),artUmurLebihLima.getLapUsaha(),artUmurLebihLima.getStatusKedudukan(),artUmurLebihLima.getKepemilikanUsaha(),artUmurLebihLima.getJumlahUsaha(), artUmurLebihLima.getLapUsahaUtama()}); 
            }*/
        } catch (SQLException ex) { 
            System.err.println(ex); 
            JOptionPane.showMessageDialog(this, "Gagal menampilkan data", "Gagal", JOptionPane.ERROR_MESSAGE); 
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable blokCtable;
    private javax.swing.JButton editButton;
    private javax.swing.JButton eksportButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewButton1;
    // End of variables declaration//GEN-END:variables
}
