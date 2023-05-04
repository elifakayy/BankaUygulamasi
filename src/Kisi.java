public class Kisi {
    private Integer tcKimlikNo;
    private String ad;
    private String soyad;
    private String email;
    private Integer telefonNumarasi;

    public Kisi() {
        this.tcKimlikNo = null;
        this.telefonNumarasi=null;
        this.ad=null;
        this.soyad=null;
        this.email=null;
    }

    public Kisi(int tcKimlikNo, String ad, String soyad, String email, int telefonNumarasi) {
        this.tcKimlikNo= tcKimlikNo;
        this.ad=ad;
        this.soyad=soyad;
        this.email=email;
        this.telefonNumarasi=telefonNumarasi;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "tcKimlikNo=" + tcKimlikNo +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", email='" + email + '\'' +
                ", telefonNumarasi=" + telefonNumarasi +
                '}';
    }

    public int getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(int tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(int telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }
}
