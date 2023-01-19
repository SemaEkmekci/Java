package MyPackage;

public class Isci extends Calisan implements Maas{
		
	String Gorev;

	public Isci(String ad, String soyad, int yas, int cs, String gorev) {
		super(ad, soyad, yas, cs);
		Gorev = gorev;
	}

	@Override
	public double maasHesapla() {
		return ZamOranıHesapla()+3000;
	}

	@Override
	double ZamOranıHesapla() {
		return cs*100+(2*yas/3);
	}
	
	
	
}
