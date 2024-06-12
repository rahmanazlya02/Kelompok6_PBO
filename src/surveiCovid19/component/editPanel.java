/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package surveiCovid19.component;


import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JScrollPane;
import surveiCovid19.Database;
import surveiCovid19.component.dataPanelBlockA;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import surveiCovid19.Database;
import surveiCovid19.idRumahTangga;
import surveiCovid19.idRumahTangga;

/**
 *
 * 
 */
public class editPanel extends javax.swing.JPanel {
    private final JScrollPane contentScrollPane;
    private String idRuta;
    /**
     * Creates new form editPanel
     */
//    public editPanel() {
//        
//    }
    
    public editPanel(JScrollPane contentScrollPane, String idRuta) throws SQLException {
//        initComponents();
        this.contentScrollPane = contentScrollPane;
        this.idRuta = idRuta;
        initComponents();
        viewData(idRuta);
        //validator.setVisible(false);
    }

    public void viewData(String idRuta) throws SQLException{
//        lemparan.setText(idPer);
      
        Connection conn = Database.getInstance().getConnection();
        try{
            String sql = "SELECT * FROM `rumahtangga` WHERE id_rumahtangga = " + idRuta;

            PreparedStatement pst = conn.prepareStatement(sql);

            ResultSet rs = pst.executeQuery(sql);
            
            while(rs.next()){
                idRumahTangga.setText(rs.getString("id_rumahtangga"));
                kodeProv.setText(rs.getString("kodeProv"));
                kodeKabKota.setText(rs.getString("kodeKabKota"));
                kodeKec.setText(rs.getString("kodeKec"));
                kodeDesa.setText(rs.getString("kodeDesa"));
                kodeSLS.setText(rs.getString("kodeSLS"));
                namaSLS.setText(rs.getString("namaSLS"));
                lokasiPendataan.setText(rs.getString("lokasiPendataan"));
                kelompokKeluarga.setText(rs.getString("kelompokKeluarga"));
                noUrutBangunan.setText(rs.getString("noUrutBangunan"));
                noUrutKeluarga.setText(rs.getString("noUrutKeluarga"));
                idLandmark.setText(rs.getString("idLandmark"));
                
                  
                  // Identitas Perusahaan 
                  
                  // Provinsi 
                  int prov = Integer.parseInt(rs.getString("kode_prov"));
                  String sql3 = "SELECT * FROM `provinsi` WHERE kode_prov = '" + prov + "'";
                  PreparedStatement pst3 = conn.prepareStatement(sql3);
                  ResultSet rs3 = pst3.executeQuery();
                  while(rs3.next()){
                      kodeProv.setText(rs3.getString("nama_prov").toString().substring(4));
                  }
                  
                  // Kabupaten/Kota
                  int kab_kot = Integer.parseInt(String.valueOf(prov) + rs.getString("kode_kab"));
                  String sql4 = "SELECT * FROM `kab_kota` WHERE kode_kab_kota = '" + kab_kot + "'";
                  PreparedStatement pst4 = conn.prepareStatement(sql4);
                  ResultSet rs4 = pst4.executeQuery();
                  while(rs4.next()){
                      kodeKabKota.setText(rs4.getString("nama_kab_kota").toString().substring(6));
                  }
                  
                  // Kecamatan 
                  int kec = Integer.parseInt( String.valueOf(kab_kot) + rs.getString("kode_kec"));
                  String sql5 = "SELECT * FROM `kecamatan` WHERE kode_kec = '" +kec + "'";
                  PreparedStatement pst5 = conn.prepareStatement(sql5);
                  ResultSet rs5 = pst5.executeQuery();
                  while(rs5.next()){
                      idLandmark.setText(rs5.getString("nama_kec").toString().substring(8));
                  }
          
         
            }
        }catch(SQLException e){
            throw e;
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    private void clearForm(){ 
        idRumahTangga.setText("");
        kodeProv.setText("");
        kodeKabKota.setText("");
        kodeKec.setText("");
        kodeDesa.setText("");
        kodeSLS.setText("");
        namaSLS.setText("");
        lokasiPendataan.setText("");
        kelompokKeluarga.setText("");
        noUrutBangunan.setText("");
        noUrutKeluarga.setText("");
        idLandmark.setText("");
        
        
        
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kunjunganButtonGroup = new javax.swing.ButtonGroup();
        tanamanPanganButtonGroup = new javax.swing.ButtonGroup();
        hortikulturaButtonGroup = new javax.swing.ButtonGroup();
        perternakanButtonGroup = new javax.swing.ButtonGroup();
        kehutananButtonGroup = new javax.swing.ButtonGroup();
        perikananButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        idLandmark = new javax.swing.JLabel();
        kodeKabKota = new javax.swing.JLabel();
        kodeProv = new javax.swing.JLabel();
        idRumahTangga = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        kodeKec = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        kodeDesa = new javax.swing.JLabel();
        kodeSLS = new javax.swing.JLabel();
        namaSLS = new javax.swing.JLabel();
        lokasiPendataan = new javax.swing.JLabel();
        kelompokKeluarga = new javax.swing.JLabel();
        noUrutBangunan = new javax.swing.JLabel();
        noUrutKeluarga = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1150, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Id Rumah Tangga");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 97, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Provinsi ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 106, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Kabupaten/Kota");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 103, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("ID Landmark ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 103, 20));

        jLabel25.setText(":");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 20, -1));

        jLabel27.setText(":");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 20, -1));

        jLabel28.setText(":");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 20, -1));

        jLabel29.setText(":");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 20, -1));

        idLandmark.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idLandmark.setText("ID Landmark");
        jPanel1.add(idLandmark, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        kodeKabKota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kodeKabKota.setText("Kab/Kota");
        jPanel1.add(kodeKabKota, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        kodeProv.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kodeProv.setText("Provinsi");
        jPanel1.add(kodeProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        idRumahTangga.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idRumahTangga.setText("id Rumah Tangga");
        jPanel1.add(idRumahTangga, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("IDENTITAS RUMAH TANGGA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 280, -1));

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("EDIT DATA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Kecamatan");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 103, -1));

        jLabel30.setText(":");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 20, -1));

        kodeKec.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kodeKec.setText("Kecamatan");
        jPanel1.add(kodeKec, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Kode Desa");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 103, -1));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Kode SLS/Non SLS");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 103, -1));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Nama SLS/Non SLS");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 103, -1));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Lokasi Pendataan");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 103, -1));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("Kelompok Keluarga");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 103, -1));

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("No Urut Bangunan");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 103, 20));

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel43.setText("No Urut Keluarga");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 103, 20));

        jLabel44.setText(":");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 20, -1));

        jLabel45.setText(":");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 20, -1));

        jLabel46.setText(":");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 20, -1));

        jLabel47.setText(":");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 20, -1));

        jLabel57.setText(":");
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 20, -1));

        jLabel58.setText(":");
        jPanel1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 20, -1));

        jLabel59.setText(":");
        jPanel1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 20, -1));

        kodeDesa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kodeDesa.setText("Kode Desa");
        jPanel1.add(kodeDesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        kodeSLS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kodeSLS.setText("Kode SLS/Non SLS");
        jPanel1.add(kodeSLS, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        namaSLS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaSLS.setText("Nama SLS/Non SLS");
        jPanel1.add(namaSLS, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        lokasiPendataan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lokasiPendataan.setText("Lokasi Pendataan");
        jPanel1.add(lokasiPendataan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        kelompokKeluarga.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kelompokKeluarga.setText("Kelompok Keluarga");
        jPanel1.add(kelompokKeluarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        noUrutBangunan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        noUrutBangunan.setText("No Urut Bangunan");
        jPanel1.add(noUrutBangunan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        noUrutKeluarga.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        noUrutKeluarga.setText("No Urut Keluarga");
        jPanel1.add(noUrutKeluarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1077, 470));

        saveButton.setText("Save");
        saveButton.setPreferredSize(new java.awt.Dimension(75, 30));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, -1));

        backButton.setText("Back");
        backButton.setPreferredSize(new java.awt.Dimension(75, 30));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        if(idRumahTangga.getText().equals("")){
            try {
                contentScrollPane.setViewportView(new viewPanel(contentScrollPane, idRuta));
            } catch (SQLException ex) {
                Logger.getLogger(editPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{
             getToolkit().beep();
            int save = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin untuk kembali?", "",JOptionPane.YES_NO_OPTION);
            
            if(save == JOptionPane.YES_OPTION){
                 try {
                     contentScrollPane.setViewportView(new viewPanel(contentScrollPane, idRuta));
                 } catch (SQLException ex) {
                     Logger.getLogger(editPanel.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
        }
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        idRumahTangga rt = new idRumahTangga();
        rt.setIdRuta(idRuta);
        rt.setKodeProv(kodeProv.getText());
        rt.setKodeKabKota(kodeKabKota.getText());
        rt.setKodeKec(kodeKec.getText());
        rt.setKodeDesa(kodeDesa.getText());
        rt.setKodeSLS(kodeSLS.getText());
        rt.setNamaSLS(namaSLS.getText());
        rt.setLokasiPendataan(lokasiPendataan.getText());
        rt.setKelompokKeluarga(kelompokKeluarga.getText());
        rt.setNoUrutBangunan(noUrutBangunan.getText());
        rt.setNoUrutKeluarga(noUrutKeluarga.getText());
        rt.setIdLandmark(idLandmark.getText());
        
        
//             rt.setNoFaks(nomorFaksimili.getText());
//             for(int i = 0; i < 10 ; i++){
//                 if(badanHukum.getSelectedIndex() == i){
//                     int a = i+1;
//                     String aa = Integer.toString(a);
//                     rt.setBentuk(aa);
//                 }
//             }
//             if(sudahKunjunganRadioButton.isSelected()){
//                 company.setInfoCacah("1");
//             }
//             if(belumKunjunganRadioButton.isSelected()){
//                 company.setInfoCacah("0");
//             }
//             
//             for(int i = 0; i < 9 ; i++){
//                 if(statusPerusahaanComboBox.getSelectedIndex() == i){
//                     int a = i+1;
//                     String aa = Integer.toString(a);
//                     company.setKetCacah(aa);
//                 }
//             }
//             
//             // jenis kegiatan utama
//             int idxKegUtama = jenisUsahaUtamaComboBox.getSelectedIndex();
//             String sql1 = "SELECT * FROM `deskripsi` WHERE indeks ='"+idxKegUtama+"'";
//             Connection conn = Database.getInstance().getConnection();
//             try {
//                 
//                 PreparedStatement pst = conn.prepareStatement(sql1);
//                 ResultSet rs = pst.executeQuery(sql1);
//                 
//                 while(rs.next()){
//                     company.setKegUsaha();
//                     company.getKegUsaha().setJenisUsahaUtama(rs.getString("kode_jenis_usaha_utama"));
//                 }
//                 
//             } catch (SQLException ex) {
//                 Logger.getLogger(editPanel.class.getName()).log(Level.SEVERE, null, ex);
//             }
//             
//             if(adaTanPanganRadioButton.isSelected()){
//                 company.getKegUsaha().setTanamanPangan("1");
//             }
//             if(tidakAdaTPRadioButton.isSelected()){
//                 company.getKegUsaha().setTanamanPangan("0");
//             }
//             if(adaHortikulturaRadioButton.isSelected()){
//                 company.getKegUsaha().setHortikultura("1");
//             }
//             if(tidakAdaHortikulturaRadioButton.isSelected()){
//                 company.getKegUsaha().setHortikultura("0");
//             }
//             
//             // perkebunan
//             int idxPerkebunan = perkebunanComboBox.getSelectedIndex();
//             String sql2 = "SELECT * FROM `deskripsi` WHERE indeks ='"+idxPerkebunan+"'";
//             PreparedStatement pst1 = conn.prepareStatement(sql2);
//             ResultSet rs2 = pst1.executeQuery(sql2);
//             
//             while(rs2.next()){
//                 company.getKegUsaha().setPerkebunan(rs2.getString("kode_perkebunan"));
//             }
//             
//             if(adaPeternakanRadioButton.isSelected()){
//            company.getKegUsaha().setPeternakan("1");
//            }
//            if(tidakAdaPeternakanRadioButton.isSelected()){
//                company.getKegUsaha().setPeternakan("0");
//            }
//            if(adaKehutananRadioButton.isSelected()){
//                company.getKegUsaha().setKehutanan("1");
//            }
//            if(tidakAdaKehutananRadioButton.isSelected()){
//                company.getKegUsaha().setKehutanan("0");
//            }
//            if(adaPerikananRadioButton.isSelected()){
//                company.getKegUsaha().setPerikanan("1");
//            }
//            if(tidakAdaPerikananRadioButton.isSelected()){
//                company.getKegUsaha().setPerikanan("0");
//            }


// update in database
//            try{
//                if(idRumahTangga.getNama().equals("")){
//                    getToolkit().beep();
//                    JOptionPane.showMessageDialog(this,  "Lengkapi Semua Data!","Data Gagal Tersimpan",  JOptionPane.ERROR_MESSAGE);
//                }else{
//                    int save = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin untuk menyimpannya?", "",JOptionPane.YES_NO_OPTION);
//                
//                    if(save == JOptionPane.YES_OPTION){
//                    Database.getInstance().editRumahTangga(idRumahTangga, this.idRumahTangga);
//                    JOptionPane.showMessageDialog(this, "Data berhasil di update");
//                    clearForm();
//                    contentScrollPane.setViewportView(new viewPanel(contentScrollPane,idRumahTangga));
//                }
//                }
//
//                
//            }catch(SQLException e){
//                getToolkit().beep();
//                System.err.println(e);
//                JOptionPane.showMessageDialog(this,  "Lengkapi Semua Data","Data Gagal Tersimpan",  JOptionPane.ERROR_MESSAGE);
//            }
//        
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup hortikulturaButtonGroup;
    private javax.swing.JLabel idLandmark;
    private javax.swing.JLabel idRumahTangga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup kehutananButtonGroup;
    private javax.swing.JLabel kelompokKeluarga;
    private javax.swing.JLabel kodeDesa;
    private javax.swing.JLabel kodeKabKota;
    private javax.swing.JLabel kodeKec;
    private javax.swing.JLabel kodeProv;
    private javax.swing.JLabel kodeSLS;
    private javax.swing.ButtonGroup kunjunganButtonGroup;
    private javax.swing.JLabel lokasiPendataan;
    private javax.swing.JLabel namaSLS;
    private javax.swing.JLabel noUrutBangunan;
    private javax.swing.JLabel noUrutKeluarga;
    private javax.swing.ButtonGroup perikananButtonGroup;
    private javax.swing.ButtonGroup perternakanButtonGroup;
    private javax.swing.JButton saveButton;
    private javax.swing.ButtonGroup tanamanPanganButtonGroup;
    // End of variables declaration//GEN-END:variables
}