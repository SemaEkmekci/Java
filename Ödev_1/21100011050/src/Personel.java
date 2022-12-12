public class Personel extends Departman {
    private int depNo;
    private int perID = 0;
    private static int syc = 0;
    private String perAd;
    private String perSoyad;
    private int perYas;

    public Personel(int depNo, String depAd, String perAd, String perSoyad, int perYas) {
        super(depNo, depAd);
        setDepNo(depNo);
        setDepAd(depAd);
        setPerAd(perAd);
        setPerSoyad(perSoyad);
        setPerYas(perYas);
        syc = syc + 1;
        this.perID = syc;
    }

    public int getDepNo() {
        return depNo;
    }


    public int getPerID() {
        return perID;
    }

    public String getPerAd() {
        return perAd;
    }

    public void setPerAd(String perAd) {
        this.perAd = perAd;
    }

    public String getPerSoyad() {
        return perSoyad;
    }

    public void setPerSoyad(String perSoyad) {
        this.perSoyad = perSoyad;
    }

    public int getPerYas() {
        return perYas;
    }

    public void setPerYas(int perYas) {
        this.perYas = perYas;
    }
}
