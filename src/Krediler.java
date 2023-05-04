public class Krediler {
    private int krediID;
    double krediMiktari;
    double taksitMiktar;

    //müşteri numarasını,krediID’sini
    //ve krediMiktarını parametre olarak alacak. Bu metodun içinde musteriNumarasi verisi
    //kullanılarak kişinin bakiye verilerine göre yıllık kazancının %50’si kadar kredi
    //verilebilecek.
    public Krediler(int krediID, double krediMiktari, double taksitMiktar) {
        this.krediID = krediID;
        this.krediMiktari = krediMiktari;
        this.taksitMiktar = taksitMiktar;
    }

    //public void kampanya(KrediKartiLimit){ }

    public int getKrediID() {
        return krediID;
    }

    public void setKrediID(int krediID) {
        this.krediID = krediID;
    }

    public double getKrediMiktari() {
        return krediMiktari;
    }

    public void setKrediMiktari(double krediMiktari) {
        this.krediMiktari = krediMiktari;
    }

    public double getTaksitMiktar() {
        return taksitMiktar;
    }

    public void setTaksitMiktar(double taksitMiktar) {
        this.taksitMiktar = taksitMiktar;
    }

    @Override
    public String toString() {
        return "Krediler{" +
                "krediID=" + krediID +
                ", krediMiktari=" + krediMiktari +
                ", taksitMiktar=" + taksitMiktar +
                '}';
    }
}
