package surveiCovid19;

import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import surveiCovid19.blokC;
import surveiCovid19.user;



/*
*@author Kelompok6
 */


public class Database implements Serializable{
    public static Database instance;
    
    private final String DB_TYPE = "mysql";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_NAME = "kelompok6";
    private final String DB_USER = "root";
    private final String DB_PASS = "";
    
    public Database(){   
    }
    
    public static synchronized Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }
    
        
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:"+DB_TYPE+"://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME, DB_USER,DB_PASS);
        
    }
    
    
    public void insertBlokA(blokA blokA)throws SQLException{
        Connection conn = getConnection();
        try{
            String sql = "INSERT INTO bloka (id_perusahaan,jabatan, jenis_kelamin, umur, nama_usaha,provinsi,kota, produk,produk_lain,kat_usaha,omset,jml_pegawai_Sblm,jml_pegawai_Skrg,operasi) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

//          idPer = kode unik dari setpuiap rumahtangga yang ada (gabungan dari beberapa kode yang ada pada KIP [refer ke kelas idRumahTangga])
            pstmt.setInt(1, blokA.getIdPerusahaan());
            pstmt.setString(2, blokA.getJabatan());
            pstmt.setString(3, blokA.getJenisKelamin());
            pstmt.setInt(4, blokA.getUmur());
            pstmt.setString(5, blokA.getNamaUsaha());
            pstmt.setString(6, blokA.getProvinsi());
            pstmt.setString(7, blokA.getKota());
            pstmt.setString(8, blokA.getProduk());
            pstmt.setString(9, blokA.getProdukLain());
            pstmt.setString(10, blokA.getKatUsaha());
            pstmt.setString(11, blokA.getOmset());
            pstmt.setInt(12, blokA.getJmlPegawaiSblm());
            pstmt.setInt(13, blokA.getJmlPegawaiSkrg());
            pstmt.setString(14, blokA.getOperasi());
            
            pstmt.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public void deleteBlokA(int idPerusahaan) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "DELETE FROM bloka WHERE id_perusahaan = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, idPerusahaan);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    
    public void insertBlokC(blokC blokC)throws SQLException{
        Connection conn = getConnection();
        try{
            String sql = "INSERT INTO blokc (id_perusahaan, income_Sblm_Covid, penurunan, penurunan_lain, peningkatan, peningkatan_lain, upaya_peningkatan) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, blokC.getIdPerusahaan());
            pstmt.setString(2, blokC.getIncomeSblmCovid());
            pstmt.setString(3, blokC.getPenurunan());
            pstmt.setString(4, blokC.getPenurunanLain());
            pstmt.setString(5, blokC.getPeningkatan());
            pstmt.setString(6, blokC.getPeningkatanLain());
            pstmt.setString(7, blokC.getUpayaPeningkatan());
            
            pstmt.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public void updateBlokA(blokA blokA) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "UPDATE bloka SET jabatan = ?, jenis_kelamin = ?, umur = ?, nama_usaha = ?, provinsi = ?, kota = ?, produk = ?, produk_lain = ?, kat_usaha = ?, omset = ?, jml_pegawai_Sblm = ?, jml_pegawai_Skrg = ?, operasi = ? WHERE id_perusahaan = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, blokA.getJabatan());
            pstmt.setString(2, blokA.getJenisKelamin());
            pstmt.setInt(3, blokA.getUmur());
            pstmt.setString(4, blokA.getNamaUsaha());
            pstmt.setString(5, blokA.getProvinsi());
            pstmt.setString(6, blokA.getKota());
            pstmt.setString(7, blokA.getProduk());
            pstmt.setString(8, blokA.getProdukLain());
            pstmt.setString(9, blokA.getKatUsaha());
            pstmt.setString(10, blokA.getOmset());
            pstmt.setInt(11, blokA.getJmlPegawaiSblm());
            pstmt.setInt(12, blokA.getJmlPegawaiSkrg());
            pstmt.setString(13, blokA.getOperasi());
            pstmt.setInt(14, blokA.getIdPerusahaan());

            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
    
    public void updateBlokC(blokC blokC) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "UPDATE blokc SET income_Sblm_Covid = ?, penurunan = ?, penurunan_lain = ?, peningkatan = ?, peningkatan_lain = ?, upaya_peningkatan = ? WHERE id_perusahaan = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, blokC.getIncomeSblmCovid());
            pstmt.setString(2, blokC.getPenurunan());
            pstmt.setString(3, blokC.getPenurunanLain());
            pstmt.setString(4, blokC.getPeningkatan());
            pstmt.setString(5, blokC.getPeningkatanLain());
            pstmt.setString(6, blokC.getUpayaPeningkatan());
            pstmt.setInt(7, blokC.getIdPerusahaan());

            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    public void deleteBlokC(int idPerusahaan) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "DELETE FROM blokc WHERE id_perusahaan = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, idPerusahaan);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    
    public List<blokA>  selectBlokA() throws SQLException{
        List<blokA> blokAlist = new ArrayList<>();
       
        Connection conn = getConnection();
        
        try{
            String sql = "SELECT * FROM bloka";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
//              dibutuhkan constructor kosong pada kelas anggotaKeluarga
                blokA blokA = new blokA();
                blokA.setIdPerusahaan(rs.getInt("id_Perusahaan"));
                blokA.setJabatan(rs.getString("jabatan"));
                blokA.setJenisKelamin(rs.getString("jenis_kelamin"));
                blokA.setUmur(rs.getInt("umur"));
                blokA.setNamaUsaha(rs.getString("nama_usaha"));
                blokA.setProvinsi(rs.getString("provinsi"));
                blokA.setKota(rs.getString("kota"));
                blokA.setProduk(rs.getString("produk"));
                blokA.setProdukLain(rs.getString("produk_lain"));
                blokA.setKatUsaha(rs.getString("kat_usaha"));
                blokA.setOmset(rs.getString("omset"));
                blokA.setJmlPegawaiSblm(rs.getInt("jml_Pegawai_Sblm"));
                blokA.setJmlPegawaiSkrg(rs.getInt("jml_Pegawai_Skrg"));
                blokA.setOperasi(rs.getString("operasi"));
              
                blokAlist.add(blokA);
            }// end of checking while if rs.next available
        } // end of try
        catch(SQLException ex){
            throw ex;
        }
        return blokAlist;
    }
    
    public List<blokC> selectBlokC() throws SQLException{ 
        List<blokC> blokClist = new ArrayList<>();
       
        Connection conn = getConnection();
        
        try{
            String sql = "SELECT * FROM blokc";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
//              dibutuhkan constructor kosong pada kelas finansial
                blokC blokC = new blokC();
                blokC.setIdPerusahaan(rs.getInt("id_Perusahaan"));
                blokC.setIncomeSblmCovid(rs.getString("income_Sblm_Covid"));
                blokC.setPenurunan(rs.getString("penurunan"));
                blokC.setPenurunanLain(rs.getString("penurunan_lain"));
                blokC.setPeningkatan(rs.getString("peningkatan"));// nanti (semua var) dipastikan lagi mengenai penamaan variabel di databasenya
                blokC.setPeningkatanLain(rs.getString("peningkatan_lain"));
                blokC.setUpayaPeningkatan(rs.getString("upaya_peningkatan"));
               
                // menambahkan satu baris finansial beserta keseluruhan var nya ke dalam satu row pada List anggotakeluarga
                // nanti bisa ditampilkan di tabel, pakai ini 
                blokClist.add(blokC);
            }// end of checking while if rs.next available
        } // end of try // end of try
        catch(SQLException ex){
            throw ex;
        }
        return blokClist;
    }
     
    public user getUser(String username)throws SQLException{
        user user = new user();
        Connection conn = getConnection();
        try{
            String sql = "SELECT * FROM `user` WHERE `username` = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
        } catch (SQLException ex){
            throw ex;
        } finally{
            if ((conn != null)) {
                conn.close();
            }
        }
        return user;
    }
    
    public void insertNewUser(user usr)throws SQLException{
        Connection conn = getConnection();
        try{
            String sql = "INSERT INTO user VALUES(?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, usr.getEmail());
            pstmt.setString(2, usr.getUsername());
            pstmt.setString(3, usr.getPassword());
            
            pstmt.executeUpdate();
        } catch (SQLException ex){
            throw ex;
        } finally{
            if ((conn != null)) {
                conn.close();
            }
        }
    }

    public ArrayList<blokC> searchBlokC(String searchText) throws SQLException {
    ArrayList<blokC> searchResults = new ArrayList<>();
    String query = "SELECT * FROM blokc WHERE id_Perusahaan = ? OR income_sblm_covid LIKE ? OR penurunan LIKE ? OR penurunan_lain LIKE ? OR peningkatan LIKE ? OR peningkatan_lain LIKE ? OR upaya_peningkatan LIKE ?";
    
    try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
        String searchPattern = "%" + searchText + "%";
        for (int i = 1; i <= 7; i++) {
            stmt.setString(i, searchPattern);
        }
        
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                blokC blokC = new blokC();
                blokC.setIdPerusahaan(rs.getInt("id_Perusahaan"));
                blokC.setIncomeSblmCovid(rs.getString("income_sblm_covid"));
                blokC.setPenurunan(rs.getString("penurunan"));
                blokC.setPenurunanLain(rs.getString("penurunan_lain"));
                blokC.setPeningkatan(rs.getString("peningkatan"));
                blokC.setPeningkatanLain(rs.getString("peningkatan_lain"));
                blokC.setUpayaPeningkatan(rs.getString("upaya_peningkatan"));
                searchResults.add(blokC);
            }
        }
    }
        return searchResults;
    }
    
    public ArrayList<blokA> searchBlokA(String searchText) throws SQLException {
        ArrayList<blokA> searchResults = new ArrayList<>();
        String query = "SELECT * FROM bloka WHERE id_Perusahaan = ? OR jabatan LIKE ? OR jenis_kelamin LIKE ? OR umur LIKE ? OR nama_usaha LIKE ? OR provinsi LIKE ? OR kota LIKE ? OR produk LIKE ? OR produk_lain LIKE ? OR kat_usaha LIKE ? OR omset LIKE ? OR jml_pegawai_Sblm LIKE ? OR jml_pegawai_Skrg LIKE ? OR operasi LIKE ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            String searchPattern = "%" + searchText + "%";
            stmt.setString(1, searchText);
            for (int i = 2; i <= 14; i++) {
                stmt.setString(i, searchPattern);
            }
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    blokA blokA = new blokA();
                    blokA.setIdPerusahaan(rs.getInt("id_Perusahaan"));
                    blokA.setJabatan(rs.getString("jabatan"));
                    blokA.setJenisKelamin(rs.getString("jenis_kelamin"));
                    blokA.setUmur(rs.getInt("umur"));
                    blokA.setNamaUsaha(rs.getString("nama_usaha"));
                    blokA.setProvinsi(rs.getString("provinsi"));
                    blokA.setKota(rs.getString("kota"));
                    blokA.setProduk(rs.getString("produk"));
                    blokA.setProdukLain(rs.getString("produk_lain"));
                    blokA.setKatUsaha(rs.getString("kat_usaha"));
                    blokA.setOmset(rs.getString("omset"));
                    blokA.setJmlPegawaiSblm(rs.getInt("jml_Pegawai_Sblm"));
                    blokA.setJmlPegawaiSkrg(rs.getInt("jml_Pegawai_Skrg"));
                    blokA.setOperasi(rs.getString("operasi"));
                    searchResults.add(blokA);
                }
            }
        }
        return searchResults;
    }
    
}// end of class
