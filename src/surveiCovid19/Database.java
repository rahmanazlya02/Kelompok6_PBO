package surveiCovid19;

import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import surveiCovid19.kondisiFinansial;
import surveiCovid19.user;



/*
*@author Kelompok6
 */


public class Database implements Serializable{
    public static Database instance;
    
    private final String DB_TYPE = "mysql";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_NAME = "kelompok6_2";
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
    
    public void insertResponden(responden responden)throws SQLException{
        Connection conn = getConnection();
        try{
            String sql = "INSERT INTO responden (jabatan, jenis_kelamin, umur) VALUES (?,?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);


//          idPer = kode unik dari setpuiap rumahtangga yang ada (gabungan dari beberapa kode yang ada pada KIP [refer ke kelas idRumahTangga])
            pstmt.setString(1, responden.getJabatan());
            pstmt.setString(2, responden.getJenisKelamin());
            pstmt.setInt(3, responden.getUmur());
            
            pstmt.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public void insertPerusahaan(perusahaan perusahaan)throws SQLException{
        Connection conn = getConnection();
        try{
            String sql = "INSERT INTO perusahaan (nama_usaha,provinsi,kota, produk,produk_lain,kat_usaha,omset,jml_pegawai_Sblm,jml_pegawai_Skrg,operasi) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

//          idPer = kode unik dari setpuiap rumahtangga yang ada (gabungan dari beberapa kode yang ada pada KIP [refer ke kelas idRumahTangga])
            pstmt.setString(1, perusahaan.getNamaUsaha());
            pstmt.setString(2, perusahaan.getProvinsi());
            pstmt.setString(3, perusahaan.getKota());
            pstmt.setString(4, perusahaan.getProduk());
            pstmt.setString(5, perusahaan.getProdukLain());
            pstmt.setString(6, perusahaan.getKatUsaha());
            pstmt.setString(7, perusahaan.getOmset());
            pstmt.setInt(8, perusahaan.getJmlPegawaiSblm());
            pstmt.setInt(9, perusahaan.getJmlPegawaiSkrg());
            pstmt.setString(10, perusahaan.getOperasi());
            
            pstmt.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public void insertKondisiFinansial(kondisiFinansial finansial)throws SQLException{
        Connection conn = getConnection();
        try{
            String sql = "INSERT INTO kondisi_finansial (income_Sblm_Covid, penurunan, penurunan_lain, peningkatan, peningkatan_lain, upaya_peningkatan) VALUES(?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, finansial.getIncomeSblmCovid());
            pstmt.setString(2, finansial.getPenurunan());
            pstmt.setString(3, finansial.getPenurunanLain());
            pstmt.setString(4, finansial.getPeningkatan());
            pstmt.setString(5, finansial.getPeningkatanLain());
            pstmt.setString(6, finansial.getUpayaPeningkatan());
            
            pstmt.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public List<responden> selectResponden() throws SQLException{
//      create a List of RumahTangga 
        List<responden> respondens = new ArrayList<>();
       
        Connection conn = getConnection();
        
        try{
            String sql = "SELECT * FROM responden";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
//              dibutuhkan constructor kosong pada kelas responden
                responden responden = new responden();
                responden.setJabatan(rs.getString("jabatan"));
                responden.setJenisKelamin(rs.getString("jenis_kelamin"));
                responden.setUmur(rs.getInt("umur")); 
                respondens.add(responden);
            }// end of checking while if rs.next available
        } // end of try
        catch(SQLException ex){
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return respondens;
    }
    
    public List<perusahaan>  selectPerusahaan() throws SQLException{
        List<perusahaan> perusahaanList = new ArrayList<>();
       
        Connection conn = getConnection();
        
        try{
            String sql = "SELECT * FROM perusahaan";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
//              dibutuhkan constructor kosong pada kelas anggotaKeluarga
                perusahaan perusahaan = new perusahaan();
                perusahaan.setNamaUsaha(rs.getString("nama_usaha"));
                perusahaan.setProvinsi(rs.getString("provinsi"));
                perusahaan.setKota(rs.getString("kota"));
                perusahaan.setProduk(rs.getString("produk"));
                perusahaan.setProdukLain(rs.getString("produk_lain"));
                perusahaan.setKatUsaha(rs.getString("kat_usaha"));
                perusahaan.setOmset(rs.getString("omset"));
                perusahaan.setJmlPegawaiSblm(rs.getInt("jml_Pegawai_Sblm"));
                perusahaan.setJmlPegawaiSkrg(rs.getInt("jml_Pegawai_Skrg"));
                perusahaan.setOperasi(rs.getString("operasi"));
              
                perusahaanList.add(perusahaan);
            }// end of checking while if rs.next available
        } // end of try
        catch(SQLException ex){
            throw ex;
        }
        return perusahaanList;
    }
    
    public List<kondisiFinansial> selectkondisiFinansial() throws SQLException{ 
        List<kondisiFinansial> finansialList = new ArrayList<>();
       
        Connection conn = getConnection();
        
        try{
            String sql = "SELECT * FROM kondisi_finansial";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
//              dibutuhkan constructor kosong pada kelas finansial
                kondisiFinansial finansial = new kondisiFinansial();
                finansial.setIncomeSblmCovid(rs.getString("income_Sblm_Covid"));
                finansial.setPenurunan(rs.getString("penurunan"));
                finansial.setPenurunanLain(rs.getString("penurunan_lain"));
                finansial.setPeningkatan(rs.getString("peningkatan"));// nanti (semua var) dipastikan lagi mengenai penamaan variabel di databasenya
                finansial.setPeningkatanLain(rs.getString("peningkatan_lain"));
                finansial.setUpayaPeningkatan(rs.getString("upaya_peningkatan"));
               
                // menambahkan satu baris finansial beserta keseluruhan var nya ke dalam satu row pada List anggotakeluarga
                // nanti bisa ditampilkan di tabel, pakai ini 
                finansialList.add(finansial);
            }// end of checking while if rs.next available
        } // end of try
        catch(SQLException ex){
            throw ex;
        }
        return finansialList;
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
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:"+DB_TYPE+"://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME, DB_USER,DB_PASS);
        
    }
    
    public ArrayList<kondisiFinansial> searchKondisiFinansial(String searchText) throws SQLException {
    ArrayList<kondisiFinansial> searchResults = new ArrayList<>();
    String query = "SELECT * FROM kondisi_finansial WHERE income_sblm_covid LIKE ? OR penurunan LIKE ? OR penurunan_lain LIKE ? OR peningkatan LIKE ? OR peningkatan_lain LIKE ? OR upaya_peningkatan LIKE ?";
    
    try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
        String searchPattern = "%" + searchText + "%";
        for (int i = 1; i <= 6; i++) {
            stmt.setString(i, searchPattern);
        }
        
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                kondisiFinansial finansial = new kondisiFinansial();
                finansial.setIncomeSblmCovid(rs.getString("income_sblm_covid"));
                finansial.setPenurunan(rs.getString("penurunan"));
                finansial.setPenurunanLain(rs.getString("penurunan_lain"));
                finansial.setPeningkatan(rs.getString("peningkatan"));
                finansial.setPeningkatanLain(rs.getString("peningkatan_lain"));
                finansial.setUpayaPeningkatan(rs.getString("upaya_peningkatan"));
                searchResults.add(finansial);
            }
        }
    }
    
    return searchResults;
}
    
    
}// end of class
