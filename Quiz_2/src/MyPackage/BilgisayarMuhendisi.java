package MyPackage;

public class BilgisayarMuhendisi extends Muhendis{
	
	String brans;
	

	public BilgisayarMuhendisi(String ad, String soyad, int yas, int cs) {
		super(ad, soyad, yas, cs);
		this.brans="Muhendis"; 
	}

	public BilgisayarMuhendisi() {

	}

	public double MaasHesapla() {
		return (cs*200)+(2*yas/3)+10000;
	}


	
	
}
