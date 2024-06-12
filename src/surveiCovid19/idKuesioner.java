/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package surveiCovid19;

/**
 */
public class idKuesioner {
    private String provinsi;
    private String kab_kot;
    private String periode;

    public idKuesioner() {
    }
    
    public idKuesioner(String Provinsi, String kab_kot, String periode){
        this.provinsi = provinsi;
        this.kab_kot = kab_kot;
        this.periode = periode;
    }
    
    public void setProvinsi(String provinsi){
        this.provinsi = provinsi;
    }
    
    public String getProvinsi(){
        return provinsi;
    }
    
    public void setKab_kot(String kab_kot){
        this.kab_kot = kab_kot;
    }
    
    public String getKab_kot(){
        return kab_kot;
    }
    
    public void setPeriode(String periode){
        this.periode = periode;
    }
    
    public String getPeriode(){
        return periode;
    }
}
