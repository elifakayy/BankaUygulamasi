public class KrediKarti {
    private Integer kartNumarasi;

    //KrediKarti limiti 5000 TL altında olanların guncelBorc bilgisini yazdırın.
    //● KrediKarti limiti 10000 TL üstündeyse kredi teklifi yapsın.
    Double limit;
    Double guncelBorc;

    private Musteri musteri;

    public KrediKarti(int kartNumarasi, double limit, double guncelBorc, double kullanilabilirLimit,Musteri musteri) {
        this.kartNumarasi = kartNumarasi;
        this.limit = limit;
        this.guncelBorc = guncelBorc;
        this.musteri = musteri;

    }

    public KrediKarti()
    {   super();
        this.kartNumarasi=null;
        this.limit=null;
        this.guncelBorc=null;
    }

    //krediKartlari isimli ArrayList’e eklemek için kart isimli bir nesne oluşturdum ve kart bilgileriyle birlikte ekledim.
    public void krediKartiEkle(int kartNumarasi, double limit)
    {
        KrediKarti yeniKart = new KrediKarti();
        yeniKart.setKartNumarasi(kartNumarasi);
        yeniKart.setLimit(limit);
        musteri.getKrediKartlari().add(yeniKart);
        System.out.println("Kredi kartı başarıyla eklendi.");
    }

    //Kartın güncel borç bilgisi kontrol edilerek,
    //eğer 0’a eşitse kart siliniyor, değilse “lütfen öncelikle borç ödemesi yapınız” uyarısı gösteriliyor.
    public void krediKartiSil(int kartNumarasi,double guncelBorc)
    {
        for(KrediKarti kart : musteri.getKrediKartlari()) {
            if(kart.getKartNumarasi() == kartNumarasi) {
                if(guncelBorc == 0) {
                    musteri.getKrediKartlari().remove(kart);
                    System.out.println("Kredi kartı başarıyla silindi.");
                } else {
                    System.out.println("Lütfen öncelikle borç ödemesi yapınız.");
                }
                return;
            }
        }
        System.out.println("Kredi kartı bulunamadı.");
    }


    // müşteriye güncel kullanılabilir limitini
    //yazdırınız.
    public double kullanilabilirLimit(int kartNumarasi, double guncelBorc)
    {
            return limit;
    }

    @Override
    public String toString() {
        return "KrediKarti{" +
                "kartNumarasi=" + kartNumarasi +
                ", limit=" + limit +
                ", guncelBorc=" + guncelBorc +
                '}';
    }

    public int getKartNumarasi() {
        return kartNumarasi;
    }

    public void setKartNumarasi(int kartNumarasi) {
        this.kartNumarasi = kartNumarasi;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getGuncelBorc() {
        return guncelBorc;
    }

    public void setGuncelBorc(double guncelBorc) {
        this.guncelBorc = guncelBorc;
    }
}
