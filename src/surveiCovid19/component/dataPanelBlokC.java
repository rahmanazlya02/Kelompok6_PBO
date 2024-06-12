/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package surveiCovid19.component;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import surveiCovid19.Database;
import surveiCovid19.anggotaKeluarga;
import surveiCovid19.kondisiFinansial;
import surveiCovid19.umurLebihLima;


/**
 *
 * @author Imalia Rosyida
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
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Data Kuesioner Blok C");

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchButton.setText("Cari");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        dataTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kondisi Pendapatan Usaha", "Penurunan Pendapatan Usaha", "Besaran Spesifik Penurunan", "Peningkatan Pendapatan Usaha", "Besaran Spesifik Peningkatan", "Upaya Meningkatkan Pendapatan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dataTable);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(searchTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchTextField)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
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
    DefaultTableModel dtm = (DefaultTableModel) dataTable.getModel();
    
    // Clear the table before updating it with search results
    while (dtm.getRowCount() > 0) {
        dtm.removeRow(0);
    }
    
    try {
        // Perform the search query
        ArrayList<kondisiFinansial> searchResults = Database.getInstance().searchKondisiFinansial(searchText);
        
        // Update the table with search results
        for (kondisiFinansial finansial : searchResults) {
            dtm.addRow(new Object[]{
                finansial.getIncomeSblmCovid(),
                finansial.getPenurunan(),
                finansial.getPenurunanLain(),
                finansial.getPeningkatan(),
                finansial.getPeningkatanLain(),
                finansial.getUpayaPeningkatan()
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

    private void loadTableData(){ 
       DefaultTableModel dtm = (DefaultTableModel) dataTable.getModel();
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
            for(kondisiFinansial finansial: Database.getInstance().selectkondisiFinansial()){
                dtm.addRow(new Object[]{finansial.getIncomeSblmCovid(),finansial.getPenurunan(),finansial.getPenurunanLain(),finansial.getPeningkatan(),finansial.getPeningkatanLain(),finansial.getUpayaPeningkatan()}); 
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
    private javax.swing.JTable dataTable;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
