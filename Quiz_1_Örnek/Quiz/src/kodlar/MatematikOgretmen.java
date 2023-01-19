package kodlar;

public class MatematikOgretmen extends Ogretmen{
	
	private int id;
	public int gs;
	public double tp;
	private static int syc = 0;


	public MatematikOgretmen(String ad, String soyad, int yas, int gs) {
		super(ad, soyad, yas);
		super.brans = "Matematik";
		this.gs = gs;
		tp = gs*0.4;
		this.id = ++syc;
	}

	
	@Override
	public void bilgileriYazdir() {
		System.out.println("Id : " + this.id);
		super.bilgileriYazdir();
		System.out.println("Tp : " + this.tp);
	}



	
	

	


}
