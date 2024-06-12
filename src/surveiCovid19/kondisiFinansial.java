package surveiCovid19;

import java.sql.SQLException;

public class kondisiFinansial {
    private String incomeSblmCovid;
    private String penurunan;
    private String penurunanLain;
    private String peningkatan;
    private String peningkatanLain;
    private String upayaPeningkatan;

    public String getIncomeSblmCovid() {
        return incomeSblmCovid;
    }

    public void setIncomeSblmCovid(String incomeSblmCovid) {
        this.incomeSblmCovid = incomeSblmCovid;
    }

    public String getPenurunan() {
        return penurunan;
    }

    public void setPenurunan(String penurunan) {
        this.penurunan = penurunan;
    }

    public String getPenurunanLain() {
        return penurunanLain;
    }

    public void setPenurunanLain(String penurunanLain) {
        this.penurunanLain = penurunanLain;
    }

    public String getPeningkatan() {
        return peningkatan;
    }

    public void setPeningkatan(String peningkatan) {
        this.peningkatan = peningkatan;
    }

    public String getPeningkatanLain() {
        return peningkatanLain;
    }

    public void setPeningkatanLain(String peningkatanLain) {
        this.peningkatanLain = peningkatanLain;
    }

    public String getUpayaPeningkatan() {
        return upayaPeningkatan;
    }

    public void setUpayaPeningkatan(String upayaPeningkatan) {
        this.upayaPeningkatan = upayaPeningkatan;

    }
}

