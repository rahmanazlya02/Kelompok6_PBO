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
import surveiCovid19.perusahaan;
import surveiCovid19.responden;

/**
 *
 * @author Kelompok6
 */
public class dataPanelBlockA extends javax.swing.JPanel {
    private final JScrollPane contentScrollPane;

    /**
     * Creates new form dataPanel
     */
    public dataPanelBlockA(JScrollPane contentScrollPane) {
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        perusahaanTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        respondenTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(245, 245, 245));

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Data Kuesioner Blok A");

        perusahaanTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        perusahaanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Perusahaan", "Provinsi", "Kabupaten/Kota", "Produk Utama", "Produk Lainnya", "Sektor Usaha", "Omset", "Jumlah Pegawai Sebelum Covid", "Jumlah Pegawai Saat Ini", "Kondisi Usaha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(perusahaanTable);

        respondenTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kedudukan", "Jenis Kelamin", "Umur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(respondenTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(464, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadTableData() {
        DefaultTableModel respondenTableModel = (DefaultTableModel) respondenTable.getModel();
        DefaultTableModel perusahaanTableModel = (DefaultTableModel) perusahaanTable.getModel();

        // Refresh tabel
        while (respondenTableModel.getRowCount() > 0) {
            respondenTableModel.removeRow(0);
        }
        
        while (perusahaanTableModel.getRowCount() > 0) {
            perusahaanTableModel.removeRow(0);
        }

        try {
            // Isi tabel responden
            for (responden res : Database.getInstance().selectResponden()) {
                respondenTableModel.addRow(new Object[] {
                    res.getJabatan(), 
                    res.getJenisKelamin(), 
                    res.getUmur()
                });
            }
            
            // Isi tabel perusahaan
            for (perusahaan pers : Database.getInstance().selectPerusahaan()) {
                perusahaanTableModel.addRow(new Object[] {
                    pers.getNamaUsaha(),
                    pers.getProvinsi(),
                    pers.getKota(),
                    pers.getProduk(),
                    pers.getProdukLain(),
                    pers.getKatUsaha(),
                    pers.getOmset(),
                    pers.getJmlPegawaiSblm(),
                    pers.getJmlPegawaiSkrg(),
                    pers.getOperasi()
                });
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(dataPanelBlockA.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Gagal menampilkan data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable perusahaanTable;
    private javax.swing.JTable respondenTable;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
