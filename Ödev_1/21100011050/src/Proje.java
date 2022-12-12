public class Proje extends Departman {
    private int depNo;
    private int projeID = 0;
    static int syc = 0;
    private String projeAd;
    private int projeSure;
    private int projeMaliyet;


    public Proje(int depNo, String depAd, String projeAd, int projeSure, int projeMaliyet) {
        super(depNo, depAd);
        this.projeAd = projeAd;
        this.projeSure = projeSure;
        this.projeMaliyet = projeMaliyet;
        syc = syc + 1;
        this.projeID = syc;
    }

    public int getDepNo() {
        return depNo;
    }

    public void setDepNo(int depNo) {
        this.depNo = depNo;
    }

    public int getProjeId() {
        return projeID;
    }

    public String getProjeAd() {
        return projeAd;
    }

    public void setProjeAd(String projeAd) {
        this.projeAd = projeAd;
    }

    public int getProjeSure() {
        return projeSure;
    }

    public void setProjeSure(int projeSure) {
        this.projeSure = projeSure;
    }

    public int getProjeMaliyet() {
        return projeMaliyet;
    }

    public void setProjeMaliyet(int projeMaliyet) {
        this.projeMaliyet = projeMaliyet;
    }
}
