package MyPackage;

public abstract class Calisan {
	public int id;
	public String ad;
	public String soyad;
	public int yas;
	public int cs;
	public static int syc = 998;
	

	public Calisan(String ad, String soyad, int yas, int cs) {
		super();
		syc = syc + 2;
		this.id = syc;
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.cs = cs;
	}
	
	abstract double ZamOranıHesapla();
	
	
}
