package kodlar;

import java.util.Scanner;

public class Anasayfa {
	public static void main(String[] args) {
		int i;
		String ad;
		String soyad;
		int yas;
		int gs;
		Scanner veriAl = new Scanner(System.in);
		System.out.print("Yazılımcı Sayısı : ");
		int yazilimciSayisi = veriAl.nextInt();
		Yazilimci[] yazilimci = new Yazilimci[yazilimciSayisi];
		
		for (i = 0; i < yazilimciSayisi; i++) {
			System.out.println("Yazılımcı adını giriniz: ");
			ad = veriAl.next();
			System.out.println("Yazilimci soyadını giriniz: ");
			soyad = veriAl.next();
			System.out.println("Yazilimci yaşını giriniz: ");
			yas = veriAl.nextInt();
			System.out.println("Yazılımcı gs giriniz: ");
			gs = veriAl.nextInt();
			yazilimci[i] = new Yazilimci(ad, soyad, yas, gs);

		}
		
		for (i = 0; i < yazilimciSayisi; i++) {
			yazilimci[i].bilgileriYazdir();
			yazilimci[i].zamHesapla();
		
		}
		
		
		
	}

}
