package kodlar;

public class Yazilimci extends Personel {
	private int id;
	public int gs;
	private static int syc = 100;
	public double zamMiktari;
	public Yazilimci(String ad, String soyad, int yas, int gs) {
		super(ad, soyad, yas);
		this.gs = gs;
		super.departman = "Yazılımcı";
		syc = syc+5;
		this.id = syc;
	}
	
	@Override
	public void bilgileriYazdir() {
		System.out.println("Id "+ this.id);
		System.out.println("Departman : " + departman);
		System.out.println("Gs : " + this.gs);
		super.bilgileriYazdir();
	}
	
	
	public void zamHesapla() {
		if(this.gs>10) {
			zamMiktari =  super.yas * 0.20; 
		}else if(this.gs>20) {
			zamMiktari = super.yas * 0.30;
		}else {
			zamMiktari = super.yas * 0.10;
		}
		System.out.println("Zam Miktarı : " + this.zamMiktari);
		
	}

	
	
	
	

}
