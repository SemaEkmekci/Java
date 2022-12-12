package kodlar;

public class Personel{
	
	public String ad;
	public String soyad;
	public int yas;
	public String departman;
	private static int personelSayisi;
	//private static int syc = 0;
	
	public Personel(String ad, String soyad, int yas) {
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		//syc = syc+1;
		
		
	}
	
	public Personel(String ad, String soyad) {
		this.ad = ad;
		this.soyad = soyad;
	}
	
	public static int personelSayisiVer() {
		Personel.personelSayisi++;
		return personelSayisi;
		
	}
	
	public void bilgileriYazdir() {
		System.out.println("Ad : " + ad);
		System.out.println("Soyad : " + soyad);
		System.out.println("Yas : " + yas);
		System.out.println(" Personel Sayısı:" +personelSayisiVer());
	}
	
	
	
	

}
