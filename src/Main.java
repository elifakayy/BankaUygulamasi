public class Main {
    public static void main(String[] args) {


        //PersonelID, tcKimlikNo, musteriNumarasi, kartNumarasi, iban gibi değerleri random
        //number generator kullanarak otomatik olarak türetiniz. Bunların aynı olmaması için
        //kontrolünü yapınız.

        Kisi kisi=new Kisi(23,"elif","akay","e",34);
        kisi.toString();
        System.out.println(kisi);
        BankaPersonel bankaPersonel =new BankaPersonel(12,"yunus","akgeç","y",35,9);
        bankaPersonel.toString();
        System.out.println(bankaPersonel);
        Musteri musteri=new Musteri();
        musteri.toString();
        System.out.println(musteri);
    }

}