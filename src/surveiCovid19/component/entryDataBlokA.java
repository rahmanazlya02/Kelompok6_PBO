package surveiCovid19.component;
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
import surveiCovid19.blokA;

public class entryDataBlokA extends javax.swing.JPanel {

    /**
     * Creates new form entryPanel
     */
    String np;
    int awal = 1;
    public entryDataBlokA() {
        initComponents();
    }

    private void clearForm(){ 
        kodeKabKota.setText("");
        kodeProv.setText("");
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEntry = new javax.swing.JPanel();
        inputDataLabel = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kodeProv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kodeKabKota = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        produkUtama = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sektorUsaha = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        omsetUsaha = new javax.swing.JTextField();
        usiaResponden = new javax.swing.JTextField();
        namaUsaha = new javax.swing.JTextField();
        pegawaiSebelum = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jabatanResponden = new javax.swing.JComboBox<>();
        jenisKelaminResponden = new javax.swing.JComboBox<>();
        produkLainnya = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pegawaiSekarang = new javax.swing.JTextField();
        kondisiUsaha = new javax.swing.JComboBox<>();
        kirimButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        idPerusahaan = new javax.swing.JTextField();

        inputDataLabel.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        inputDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inputDataLabel.setText("INPUT DATA");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel27.setText("BLOK A. KARAKTERISTIK PELAKU USAHA");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nama Perusahaan");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Kedudukan Pelaku Usaha");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Usia Pelaku Usaha");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Kode Provinsi");

        kodeProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kodeProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeProvActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Kode Kabupaten");

        kodeKabKota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kodeKabKota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeKabKotaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Produk Utama");

        produkUtama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        produkUtama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkUtamaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Produk Lainnya");

        sektorUsaha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sektorUsaha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pertanian; Peternakan; Perkebunan; Kehutanan dan Perikanan", "Pertambangan dan Penggalian", "Industri Pengolahan", "Pengadaan Listrik dan Gas", "Pengadaan Air; Pengelolaan Sampah; Limbah; dan Daur Ulang", "Konstruksi", "Perdagangan Besar dan Eceran; Reparasi Mobil dan Sepeda Motor", "Transportasi dan Pergudangan", "Penyediaan Akomodasi dan Makan Minum", "Informasi dan Komunikasi", "Jasa Keuangan dan Asuransi", "Real Estate", "Jasa Perusahaan", "Jasa Pendidikan", "Jasa Kesehatan dan Kegiatan Sosial", "Jasa Lainnya" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Sektor Usaha");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Omset");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Kondisi Usaha");

        omsetUsaha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        omsetUsaha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omsetUsahaActionPerformed(evt);
            }
        });

        usiaResponden.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        namaUsaha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pegawaiSebelum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pegawaiSebelum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegawaiSebelumActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Jumlah Pegawai Sebelum Covid 19");

        jabatanResponden.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jabatanResponden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pemilik", "Bukan Pemilik" }));

        jenisKelaminResponden.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jenisKelaminResponden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));

        produkLainnya.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Jumlah Pegawai Saat Ini");

        pegawaiSekarang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pegawaiSekarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegawaiSekarangActionPerformed(evt);
            }
        });

        kondisiUsaha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kondisiUsaha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masih beroperasi seperti biasa", "Beroperasi dengan penerapan WFH (remote atau teleworking ) untuk SEBAGIAN pegawai", "Beroperasi dengan penerapan WFH (remote atau teleworking ) untuk SELURUH pegawai", "Beroperasi dengan pengurangan kapasitas (jam kerja, mesin dan tenaga kerja)", "Beroperasi; bahkan melebihi kapasitas sebelum Covid-19", "Berhenti beroperasi" }));

        kirimButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kirimButton.setText("KIRIM");
        kirimButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kirimButtonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("ID Perusahaan");

        idPerusahaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPerusahaanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kirimButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(namaUsaha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jabatanResponden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usiaResponden, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jenisKelaminResponden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kodeProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kodeKabKota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(produkUtama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(produkLainnya, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sektorUsaha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(omsetUsaha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pegawaiSebelum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pegawaiSekarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kondisiUsaha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(idPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(227, 227, 227)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namaUsaha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jabatanResponden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usiaResponden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jenisKelaminResponden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kodeProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(kodeKabKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produkUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(produkLainnya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sektorUsaha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(omsetUsaha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pegawaiSebelum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(pegawaiSekarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(kondisiUsaha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(kirimButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlEntryLayout = new javax.swing.GroupLayout(pnlEntry);
        pnlEntry.setLayout(pnlEntryLayout);
        pnlEntryLayout.setHorizontalGroup(
            pnlEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntryLayout.createSequentialGroup()
                .addGroup(pnlEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEntryLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addGroup(pnlEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlEntryLayout.createSequentialGroup()
                        .addGap(512, 512, 512)
                        .addComponent(inputDataLabel)))
                .addGap(0, 291, Short.MAX_VALUE))
        );
        pnlEntryLayout.setVerticalGroup(
            pnlEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntryLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(inputDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pnlEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void kirimButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kirimButtonActionPerformed
        // TODO add your handling code here:

        blokA blokA = new blokA();
        blokA.setIdPerusahaan(Integer.parseInt(idPerusahaan.getText()));
        blokA.setJabatan((String) jabatanResponden.getSelectedItem());
        blokA.setJenisKelamin((String) jenisKelaminResponden.getSelectedItem());
        blokA.setUmur(Integer.parseInt(usiaResponden.getText()));
        blokA.setNamaUsaha(namaUsaha.getText());
        blokA.setProvinsi(kodeProv.getText());
        blokA.setKota(kodeKabKota.getText());
        blokA.setProduk(produkUtama.getText());
        blokA.setProdukLain(produkLainnya.getText());
        blokA.setKatUsaha((String) sektorUsaha.getSelectedItem());
        blokA.setOmset(omsetUsaha.getText());
        blokA.setJmlPegawaiSblm(Integer.parseInt(pegawaiSekarang.getText()));
        blokA.setJmlPegawaiSkrg(Integer.parseInt(pegawaiSekarang.getText()));
        blokA.setOperasi((String) kondisiUsaha.getSelectedItem());

        try {
            Database.getInstance().insertBlokA(blokA);
            clearForm();
            JOptionPane.showMessageDialog(this, "Data Berhasil Tersimpan");
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Lengkapi Semua Data", "Data Gagal Tersimpan", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_kirimButtonActionPerformed

    private void kodeKabKotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeKabKotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeKabKotaActionPerformed

    private void kodeProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeProvActionPerformed

    private void omsetUsahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omsetUsahaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_omsetUsahaActionPerformed

    private void produkUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkUtamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produkUtamaActionPerformed

    private void pegawaiSebelumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegawaiSebelumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pegawaiSebelumActionPerformed

    private void pegawaiSekarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegawaiSekarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pegawaiSekarangActionPerformed

    private void idPerusahaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPerusahaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPerusahaanActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idPerusahaan;
    private javax.swing.JLabel inputDataLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jabatanResponden;
    private javax.swing.JComboBox<String> jenisKelaminResponden;
    private javax.swing.JButton kirimButton;
    private javax.swing.JTextField kodeKabKota;
    private javax.swing.JTextField kodeProv;
    private javax.swing.JComboBox<String> kondisiUsaha;
    private javax.swing.JTextField namaUsaha;
    private javax.swing.JTextField omsetUsaha;
    private javax.swing.JTextField pegawaiSebelum;
    private javax.swing.JTextField pegawaiSekarang;
    private javax.swing.JPanel pnlEntry;
    private javax.swing.JTextField produkLainnya;
    private javax.swing.JTextField produkUtama;
    private javax.swing.JComboBox<String> sektorUsaha;
    private javax.swing.JTextField usiaResponden;
    // End of variables declaration//GEN-END:variables
}
