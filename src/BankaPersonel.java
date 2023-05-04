import java.util.ArrayList;

public class BankaPersonel extends Kisi{
    private int personelID;
    //ArrayList musteriler;
    private Musteri musteriler; //???


    public BankaPersonel(int tcKimlikNo, String ad, String soyad, String email, int telefonNumarasi,int personelID) {
        super(tcKimlikNo,ad,soyad,email,telefonNumarasi);
        this.personelID=personelID;

    }

    public int getPersonelID() {
        return personelID;
    }

    public void setPersonelID(int personelID) {
        this.personelID = personelID;
    }


    @Override
    public String toString() {
        return "BankaPersonel{" +
                "personelID=" + personelID +
                ", musteriler=" + musteriler +
                '}';
    }
}