package surveiCovid19.component;

import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import surveiCovid19.Database;
import surveiCovid19.MainFrame;
import surveiCovid19.kondisiFinansial;
import javax.swing.JScrollPane;

public class entryDataBlokC extends javax.swing.JPanel {
    
    /**
     * Creates new form entryPanel
     */
    CardLayout cardLayout;
    public entryDataBlokC() {
        initComponents();
        clearForm(); 
    }
    
    
    private void clearForm(){ 
        Kondisi.setSelectedIndex(-1);
        Penurunan.setSelectedIndex(-1);
        PenurunanLanjutan.setText("");
        Peningkatan.setSelectedIndex(-1);
        PeningkatanLanjutan.setText("");
        Upaya.setSelectedIndex(-1);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTanamanPangan = new javax.swing.ButtonGroup();
        buttonGroupHortikultura = new javax.swing.ButtonGroup();
        buttonGroupPeternakan = new javax.swing.ButtonGroup();
        buttonGroupKehutanan = new javax.swing.ButtonGroup();
        buttonGroupPerikanan = new javax.swing.ButtonGroup();
        buttonGroupKunjungan = new javax.swing.ButtonGroup();
        contentScrollPanel = new javax.swing.JScrollPane();
        pnlEntry = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PenurunanLanjutan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        kirimButton = new javax.swing.JButton();
        inputDataLabel = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Kondisi = new javax.swing.JComboBox<>();
        Penurunan = new javax.swing.JComboBox<>();
        Peningkatan = new javax.swing.JComboBox<>();
        PeningkatanLanjutan = new javax.swing.JTextField();
        Upaya = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(206, 214, 224));

        contentScrollPanel.setBorder(null);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("BLOK IV. DAFTAR KELUARGA/PENDUDUK DI WILAYAH KHUSUS");

        jLabel1.setText("Kondisi Pendapatan Usaha Dibanding Sebelum Covid-19");

        jLabel2.setText("Penurunan Pendapatan Usaha Akibat Covid-19");

        jLabel3.setText("Besaran Spesifik Penurunan Pendapatan Usaha Akibat Covid-19");

        jLabel5.setText("Besaran Spesifik Peningkatan Pendapatan Usaha Covid-19");

        jLabel6.setText("Upaya Meningkatkan Pendapatan Usaha");

        jLabel7.setText("Peningkatan Pendapatan Usaha Akibat Covid-19");

        kirimButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kirimButton.setText("KIRIM");
        kirimButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kirimButtonActionPerformed(evt);
            }
        });

        inputDataLabel.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        inputDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inputDataLabel.setText("INPUT DATA");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("BLOK C. DAMPAK TERHADAP KINERJA FINANSIAL");

        Kondisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menurun", "Tetap", "Meningkat" }));

        Penurunan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<= 20%", "21 - 40%", "41 - 60%", "61 - 80%", "81 - 100%" }));

        Peningkatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<= 20%", "21 - 40%", "41 - 60%", "61 - 80%", "81 - 100%", "> 100%" }));

        Upaya.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Penambahan modal kerja", "Penambahan tenaga kerja", "Peningkatan teknologi", "Kapasitas produksi meningkat" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(492, 492, 492)
                        .addComponent(kirimButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Kondisi, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Peningkatan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Penurunan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PenurunanLanjutan)
                                        .addComponent(PeningkatanLanjutan)
                                        .addComponent(Upaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(inputDataLabel)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(inputDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Kondisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Penurunan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PenurunanLanjutan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Peningkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PeningkatanLanjutan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Upaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(kirimButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("DAFTAR ANGGOTA KELUARGA");

        javax.swing.GroupLayout pnlEntryLayout = new javax.swing.GroupLayout(pnlEntry);
        pnlEntry.setLayout(pnlEntryLayout);
        pnlEntryLayout.setHorizontalGroup(
            pnlEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntryLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        pnlEntryLayout.setVerticalGroup(
            pnlEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        contentScrollPanel.setViewportView(pnlEntry);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentScrollPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void kirimButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kirimButtonActionPerformed
        // TODO add your handling code here:
        kondisiFinansial finansial = new kondisiFinansial();
        finansial.setIncomeSblmCovid((String)Kondisi.getSelectedItem());
        finansial.setPenurunan((String) Penurunan.getSelectedItem());
        finansial.setPenurunanLain(PenurunanLanjutan.getText());
        finansial.setPeningkatan((String) Peningkatan.getSelectedItem());
        finansial.setPeningkatanLain(PeningkatanLanjutan.getText());
        finansial.setUpayaPeningkatan((String) Upaya.getSelectedItem());

        try {
            Database.getInstance().insertKondisiFinansial(finansial);
            clearForm();
            JOptionPane.showMessageDialog(this, "Data Berhasil Tersimpan");
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Lengkapi Semua Data", "Data Gagal Tersimpan", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_kirimButtonActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Kondisi;
    private javax.swing.JComboBox<String> Peningkatan;
    private javax.swing.JTextField PeningkatanLanjutan;
    private javax.swing.JComboBox<String> Penurunan;
    private javax.swing.JTextField PenurunanLanjutan;
    private javax.swing.JComboBox<String> Upaya;
    private javax.swing.ButtonGroup buttonGroupHortikultura;
    private javax.swing.ButtonGroup buttonGroupKehutanan;
    private javax.swing.ButtonGroup buttonGroupKunjungan;
    private javax.swing.ButtonGroup buttonGroupPerikanan;
    private javax.swing.ButtonGroup buttonGroupPeternakan;
    private javax.swing.ButtonGroup buttonGroupTanamanPangan;
    private javax.swing.JScrollPane contentScrollPanel;
    private javax.swing.JLabel inputDataLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton kirimButton;
    private javax.swing.JPanel pnlEntry;
    // End of variables declaration//GEN-END:variables
}
