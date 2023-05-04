import java.util.Date;

public class VadesizHesap extends BankaHesap{
    String hesapTuru;
    Double vadesizBakiye;


    public VadesizHesap(int tcKimlikNo, String ad, String soyad, String email, int telefonNumarasi, int musteriNumarasi, long iban, Date hesapAcilisTarih, double toplamBakiye, String hesapBilgisi, double islemMiktar, String hesapTuru, String hesapTuru1, double vadesizBakiye) {
        super(tcKimlikNo, ad, soyad, email, telefonNumarasi, musteriNumarasi, iban, hesapAcilisTarih, toplamBakiye, hesapBilgisi, islemMiktar, hesapTuru);
        this.hesapTuru = hesapTuru1;
        this.vadesizBakiye = vadesizBakiye;
    }
    public VadesizHesap(){
        super();
        this.hesapTuru=null;
        this.vadesizBakiye=null;

    }

    public double paraTransfer(String hesapTuru, long iban, double vadesizBakiye, int islemMiktar)
    {
        return 0;
    }

    // hesabın bakiyesinden bu miktar düşülmeli, kredi
    //kartının guncelBorc değeri de ödeme miktarı kadar azaltılmalıdır.
   double KrediKartiBorcOdeme(double vadesizBakiye,KrediKarti guncelBorc)
   {
       return 0;
   }
   //hesabın bakiyesinden bu miktar düşülmeli, kredinin guncelBorc değeri de ödeme
   //miktarı kadar azaltılmalıdır.
   double krediOdeme(int krediID,Krediler krediMiktari , Krediler taksitMiktari)
   {
       return 0;
   }

    @Override
    public String toString() {
        return "VadesizHesap{" +
                "hesapTuru='" + hesapTuru + '\'' +
                ", vadesizBakiye=" + vadesizBakiye +
                '}';
    }

    @Override
    public String getHesapTuru() {
        return hesapTuru;
    }

    @Override
    public void setHesapTuru(String hesapTuru) {
        this.hesapTuru = hesapTuru;
    }

    public double getVadesizBakiye() {
        return vadesizBakiye;
    }

    public void setVadesizBakiye(double vadesizBakiye) {
        this.vadesizBakiye = vadesizBakiye;
    }
}
