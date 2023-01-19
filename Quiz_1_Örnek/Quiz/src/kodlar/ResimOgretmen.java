package kodlar;

public class ResimOgretmen extends Ogretmen{
	
	private int id;
	public int gs;
	public double tp;
	private static int syc = 0;
	
	public ResimOgretmen(String ad, String soyad, int yas , int gs) {
		super(ad, soyad, yas);
		super.brans = "Resim";
		this.gs = gs;
		tp = gs*0.3;
		this.id = ++syc;
	}
	
	
	@Override
	public void bilgileriYazdir() {
		System.out.println("Id : " + this.id);
		super.bilgileriYazdir();
		System.out.println("Tp : " + this.tp);
	}
	
	
}
