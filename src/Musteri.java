import java.util.ArrayList;

public class Musteri extends Kisi {

    //musteriNumarasi kullanıcıdan alınan bir kişinin bütün hesap bilgilerini ekrana yazdırınız.
    private Integer musteriNumarasi;
    private ArrayList<BankaHesap> hesaplar;
    private ArrayList<KrediKarti> krediKartlari;

    public Musteri() {
        super();
        this.musteriNumarasi=null;
        this.hesaplar=null;
        this.krediKartlari=null;
    }

    public Musteri(int tcKimlikNo, String ad, String soyad, String email, int telefonNumarasi, int musteriNumarasi) {
        super(tcKimlikNo, ad, soyad, email, telefonNumarasi);
        this.musteriNumarasi = musteriNumarasi;
        hesaplar=new ArrayList<>();
        krediKartlari = new ArrayList<>();
        //this.hesaplar = hesaplar;
        //this.krediKartlari = krediKartlari;
    }

    public int getMusteriNumarasi() {
        return musteriNumarasi;
    }
    public void setMusteriNumarasi(int musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }
    public ArrayList<BankaHesap> getHesaplar() {
        return hesaplar;
    }
    public void setHesaplar(ArrayList<BankaHesap> hesaplar) {
        this.hesaplar = hesaplar;
    }
    public ArrayList<KrediKarti> getKrediKartlari() {
        return krediKartlari;
    }
    public void setKrediKartlari(ArrayList<KrediKarti> krediKartlari) {
        this.krediKartlari = krediKartlari;
    }

    /*
    public ArrayList getHesaplar() {
        return hesaplar;
    }

    public void setHesaplar(ArrayList hesaplar) {
        this.hesaplar = hesaplar;
    }

    */


    // Hesap türünü kontrol ederek, hangi hesabı açmak istediğine göre (Vadeli hesap, Vadesiz hesap veya yatırım hesabı) ,
    // sınıflarından nesneler oluşturarak
    //hesaplar isimli ArrayList'e atıyoruz.
    public void hesapEkle(int tcKimlikNo,String ad, String soyad)
    {
        if (BankaHesap.hesapTuru.equals("VadeliHesap")) {
            VadeliHesap vadeliHesap = new VadeliHesap();
            vadeliHesap.setTcKimlikNo(tcKimlikNo);
            vadeliHesap.setAd(ad);
            vadeliHesap.setSoyad(soyad);
            hesaplar.add(vadeliHesap);
        } else if (BankaHesap.hesapTuru.equals("Vadesiz")) {
            VadesizHesap vadesizHesap = new VadesizHesap();
            vadesizHesap.setTcKimlikNo(tcKimlikNo);
            vadesizHesap.setAd(ad);
            vadesizHesap.setSoyad(soyad);
            hesaplar.add(vadesizHesap);
        } else if (BankaHesap.hesapTuru.equals("Yatirim")) {
            YatirimHesap yatirimHesap = new YatirimHesap();
            yatirimHesap.setTcKimlikNo(tcKimlikNo);
            yatirimHesap.setAd(ad);
            yatirimHesap.setSoyad(soyad);
            hesaplar.add(yatirimHesap);
        }

    }

    // Hesabın bakiyesini kontrol ediyoruz, hesap bakiyesi 0 dan büyükse “lütfen öncelikle bakiyenizi başka bir hesaba aktarınız”
    // uyarısını gösteriyoruz. Eğer 0’a eşitse hesap siliniyor.
    public void hesapSil(int tcKimlikNo,String ad, String soyad)
    {
        if(BankaHesap.toplamBakiye>0){
            System.out.println("Lütfen öncelikle bakiyenizi başka bir hesaba aktarınız.");
        } else if (BankaHesap.toplamBakiye.equals(0)) {
            hesaplar.remove(this);
        }
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "musteriNumarasi=" + musteriNumarasi +
                ", hesaplar=" + hesaplar +
                ", krediKartlari=" + krediKartlari +
                '}';
    }


}

