import java.util.Date;

public class VadeliHesap extends BankaHesap{

    String hesapTuru;
    Integer vadeliBakiye;
    Float faizOrani;

    public VadeliHesap(int tcKimlikNo, String ad, String soyad, String email, int telefonNumarasi, int musteriNumarasi, long iban, Date hesapAcilisTarih, double toplamBakiye, String hesapBilgisi, double islemMiktar, String hesapTuru, String hesapTuru1, int vadeliBakiye, float faizOrani) {
        super(tcKimlikNo, ad, soyad, email, telefonNumarasi, musteriNumarasi, iban, hesapAcilisTarih, toplamBakiye, hesapBilgisi, islemMiktar, hesapTuru);
        this.hesapTuru = hesapTuru1;
        this.vadeliBakiye = vadeliBakiye;
        this.faizOrani = faizOrani;
    }
    public VadeliHesap(){
        super();
        this.hesapTuru=null;
        this.vadeliBakiye=null;
        this.faizOrani=null;
    }
    @Override
    public String getHesapTuru() {
        return hesapTuru;
    }

    @Override
    public void setHesapTuru(String hesapTuru) {
        this.hesapTuru = hesapTuru;
    }

    public int getVadeliBakiye() {
        return vadeliBakiye;
    }

    public void setVadeliBakiye(int vadeliBakiye) {
        this.vadeliBakiye = vadeliBakiye;
    }

    public float getFaizOrani() {
        return faizOrani;
    }

    public void setFaizOrani(float faizOrani) {
        this.faizOrani = faizOrani;
    }

    @Override
    public String toString() {
        return "VadeliHesap{" +
                "hesapTuru='" + hesapTuru + '\'' +
                ", vadeliBakiye=" + vadeliBakiye +
                ", faizOrani=" + faizOrani +
                '}';
    }
}
