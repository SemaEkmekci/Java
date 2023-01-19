package kodlar;

public class Ogretmen {
	public String ad;
	public String soyad;
	public int yas;
	public String brans;
	
	private static int ogretmenSayisi;


	public Ogretmen(String ad, String soyad, int yas) {
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		ogretmenSayisi++;
	}


	public void bilgileriYazdir() {
		System.out.println("Ad : " + this.ad);
		System.out.println("Soyad : " + this.soyad);
		System.out.println("Yaş : " + this.yas);
		System.out.println("Branş : " + this.brans);
	}
	
	
	public static void ogretmenSayisiVer() {
		System.out.println(Ogretmen.ogretmenSayisi);
	}

	

	
	
}
