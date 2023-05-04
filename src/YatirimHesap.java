import java.util.Date;

public class YatirimHesap extends BankaHesap{
    String hesapTuru;
    Integer yatirimBakiye;
    String  yatirimTuru;
    Float kur;

    public YatirimHesap(int tcKimlikNo, String ad, String soyad, String email, int telefonNumarasi, int musteriNumarasi, long iban, Date hesapAcilisTarih, double toplamBakiye, String hesapBilgisi, double islemMiktar, String hesapTuru, String hesapTuru1, int yatirimBakiye, String yatirimTuru, float kur) {
        super(tcKimlikNo, ad, soyad, email, telefonNumarasi, musteriNumarasi, iban, hesapAcilisTarih, toplamBakiye, hesapBilgisi, islemMiktar, hesapTuru);
        this.hesapTuru = hesapTuru1;
        this.yatirimBakiye = yatirimBakiye;
        this.yatirimTuru = yatirimTuru;
        this.kur = kur;
    }
    public YatirimHesap(){
        super();
        this.hesapTuru=null;
        this.yatirimBakiye=null;
        this.yatirimTuru=null;
        this.kur=null;
    }

    // girilen kur miktarı ile yatırılan miktarı çarparak hesaplayıp
    //yatirimBakiye hesabının üzerine ekleyecektir
    double paraEkleme(int yatirimBakiye, String  yatirimTuru, float kur)
    {
        return 0 ;

    }

    //benzer şekilde yatirimBakiye miktarından düşecektir
    double paraBoz(int yatirimBakiye,String yatirimTuru,float kur)
    {
        return 0;

    }

    @Override
    public String toString() {
        return "YatirimHesap{" +
                "hesapTuru='" + hesapTuru + '\'' +
                ", yatirimBakiye=" + yatirimBakiye +
                ", yatirimTuru='" + yatirimTuru + '\'' +
                ", kur=" + kur +
                '}';
    }
}

