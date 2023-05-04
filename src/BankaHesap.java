import java.util.Date;

public class BankaHesap extends Musteri{
    long iban;

    //BankaHesap açılış tarihi 1 Ocak’tan sonra açılan tüm hesapların toplamBakiye’lerini
    //ekrana yazdırın.
    Date hesapAcilisTarih;
    static Double toplamBakiye;

    //BankaHesap sınıfının içindeki hesapBilgisi hesap türü bilgilerini tutacaktır. Bu hesap
    //türleri maaş hesabı ve normal hesap olacaktır. 1 maaş hesabını temsil ederken, 2 normal
    //hesabı temsil edecektir
    String hesapBilgisi;
    Double islemMiktar;
    public static String hesapTuru;

    public long getIban() {
        return iban;
    }

    public void setIban(long iban) {
        this.iban = iban;
    }

    public Date getHesapAcilisTarih() {
        return hesapAcilisTarih;
    }

    public void setHesapAcilisTarih(Date hesapAcilisTarih) {
        this.hesapAcilisTarih = hesapAcilisTarih;
    }

    public double getToplamBakiye() {
        return toplamBakiye;
    }

    public void setToplamBakiye(double toplamBakiye) {
        this.toplamBakiye = toplamBakiye;
    }

    public String getHesapBilgisi() {
        return hesapBilgisi;
    }

    public void setHesapBilgisi(String hesapBilgisi) {
        this.hesapBilgisi = hesapBilgisi;
    }

    public double getIslemMiktar() {
        return islemMiktar;
    }

    public void setIslemMiktar(double islemMiktar) {
        this.islemMiktar = islemMiktar;
    }

    public String getHesapTuru() {
        return hesapTuru;
    }

    public void setHesapTuru(String hesapTuru) {
        this.hesapTuru = hesapTuru;
    }

    //Hesapbilgisi verileri kullanılarak maaş hesabı seçildiyse vadeli hesap içinde yer alan
    //faiz oranı %20 işletilecek, vadesiz hesap altında yer alan para transferi kısmında ise 0
    //TL kesinti olacak. Eğer normal hesap seçildiyse o zaman vadeli hesap altında faiz oranı
    //%10 işlenecek, vadesiz hesap altında yer alan para transferi metodunda ise 8 TL kesinti
    //olacaktır. (Göndericinin iban bilgisi BankaHesap sınıfından elde edilecektir.)


    public BankaHesap(int tcKimlikNo, String ad, String soyad, String email, int telefonNumarasi, int musteriNumarasi, long iban, Date hesapAcilisTarih, double toplamBakiye, String hesapBilgisi, double islemMiktar, String hesapTuru) {
        super(tcKimlikNo, ad, soyad, email, telefonNumarasi, musteriNumarasi);
        this.iban = iban;
        this.hesapAcilisTarih = hesapAcilisTarih;
        this.toplamBakiye = toplamBakiye;
        this.hesapBilgisi = hesapBilgisi;
        this.islemMiktar = islemMiktar;
        this.hesapTuru = hesapTuru;
    }
    public BankaHesap(){
        super();
        this.iban = iban;
        this.hesapAcilisTarih = null;
        this.toplamBakiye = null;
        this.hesapBilgisi = null;
        this.islemMiktar = null;
        this.hesapTuru = null;
    }

    public void hesapGoruntuleme(int musteriNumarasi, String ad, String soyad, long iban, double toplamBakiye, String hesapBilgisi)
    {

    }

    @Override
    public String toString() {
        return "BankaHesap{" +
                "iban=" + iban +
                ", hesapAcilisTarih=" + hesapAcilisTarih +
                ", toplamBakiye=" + toplamBakiye +
                ", hesapBilgisi='" + hesapBilgisi + '\'' +
                ", islemMiktar=" + islemMiktar +
                ", hesapTuru='" + hesapTuru + '\'' +
                '}';
    }



}
