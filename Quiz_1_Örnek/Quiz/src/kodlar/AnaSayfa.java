package kodlar;

import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) {

		String ad;
		String soyad;
		int yas;
		int gs;
		Scanner veriAl = new Scanner(System.in);
		System.out.print("Kaç Matematik Öğretmeni Olsun?");
		int matematikSayi = veriAl.nextInt();
		System.out.print("Kaç Resim Öğretmeni Olsun?");
		int resimSayi = veriAl.nextInt();
		MatematikOgretmen[] matematikOgretmen = new MatematikOgretmen[matematikSayi];
		ResimOgretmen[] resimOgretmen = new ResimOgretmen[resimSayi];
		int i;
		for (i = 0; i < matematikSayi; i++) {
			System.out.println("Matematik öğretmeni adını giriniz: ");
			ad = veriAl.next();
			System.out.println("Matematik öğretmeni soyadını giriniz: ");
			soyad = veriAl.next();
			System.out.println("Matematik öğretmeni yaşını giriniz: ");
			yas = veriAl.nextInt();
			System.out.println("Matematik öğretmeni gs giriniz: ");
			gs = veriAl.nextInt();
			matematikOgretmen[i] = new MatematikOgretmen(ad, soyad, yas, gs);

		}

		for (i = 0; i < resimSayi; i++) {
			System.out.println("Resim öğretmeni adını giriniz: ");
			ad = veriAl.next();
			System.out.println("Resim öğretmeni soyadını giriniz: ");
			soyad = veriAl.next();
			System.out.println("Resim öğretmeni yaşını giriniz: ");
			yas = veriAl.nextInt();
			System.out.println("Resim öğretmeni gs giriniz: ");
			gs = veriAl.nextInt();
			resimOgretmen[i] = new ResimOgretmen(ad, soyad, yas, gs);
		}

		Ogretmen.ogretmenSayisiVer();

		for (i = 0; i < matematikSayi; i++) {
			matematikOgretmen[i].bilgileriYazdir();
		}

		for (i = 0; i < resimSayi; i++) {
			resimOgretmen[i].bilgileriYazdir();
		}
		
		
		
	}
}
