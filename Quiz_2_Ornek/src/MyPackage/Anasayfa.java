package MyPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Anasayfa {
	public static void main(String[] args) throws IOException {
		ArrayList<Isci> Isciler= new ArrayList<Isci>();
		Scanner input = new Scanner(System.in);
		System.out.print("İşci Sayısı Giriniz: ");
		int isciSayisi = input.nextInt();
		
		for(int i = 0; i<isciSayisi;i++) {
			System.out.print((i+1)+".İşci Ad: ");
			String ad = input.next();
			System.out.print((i+1)+".İşci Soyad: ");
			String soyAd = input.next();
			System.out.print((i+1)+".İşci Maaş: ");
			Double maas = input.nextDouble();
			System.out.print((i+1)+".İşci Yas: ");
			int yas = input.nextInt();
			System.out.print((i+1)+".İşci Çs: ");
			int cs = input.nextInt();
			System.out.print((i+1)+".İşci Görev: ");
			String gorev = input.next();
			Isciler.add(new Isci(ad,soyAd,yas,cs,gorev));
		}
		
		for(int i=0; i<isciSayisi;i++) {
			String boyut = "%5s %10s %10s %8s %5s \n";
			System.out.printf(boyut,Isciler.get(i).id, Isciler.get(i).ad, Isciler.get(i).soyad, Isciler.get(i).maasHesapla(), Isciler.get(i).Gorev);
		}
		
		File file = new File("isciler.txt");
		BufferedWriter writter = new BufferedWriter(new FileWriter(file,true));
		for(int i=0; i<isciSayisi;i++) {
			writter.write(Isciler.get(i).id + " " + Isciler.get(i).ad +" "+ Isciler.get(i).soyad +" "+ Isciler.get(i).maasHesapla()+" "+Isciler.get(i).Gorev);
			writter.newLine();
		}
		writter.close();
		
	}
}
