package MyPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Anasayfa {
	public static void main(String[] args) throws IOException{
		ArrayList<Muhendis> muhendis = new ArrayList<Muhendis>();
		Scanner input = new Scanner(System.in);
		while(1==1) {
		System.out.println("1-Ekleme\n2-Listeleme\n3-Yer Değiştir\n4-Çıkış\nSeçim: ");
		int secim = input.nextInt();
		switch (secim) {
		case 1:
			System.out.print("Bil.Müh Ad: ");
			String ad = input.next();
			System.out.print("Bil.Müh Soyad: ");
			String soyad = input.next();
			System.out.print("Bil.Müh Yaş: ");
			int yas = input.nextInt();
			System.out.print("Bil.Müh Çs: ");
			int cs = input.nextInt();
			muhendis.add(new BilgisayarMuhendisi(ad,soyad,yas,cs));
			break;
		case 2:
			for(int i = 0; i<muhendis.size(); i++) {
				System.out.println(muhendis.get(i).id +" "+ muhendis.get(i).ad +" "+ muhendis.get(i).yas +" "+ muhendis.get(i).cs+" "+muhendis.get(i).MaasHesapla());
			} 
			break;
		
		case 3:
			int kontrol = 0;
			int indis1 = 0;
			int indis2 = 0;
			while(kontrol == 0) {
			kontrol = 1;
			System.out.println("Yer Değiştirmesini İstediğiniz 1. indis: ");
			indis1 = input.nextInt();
			if(indis1 > muhendis.size()-1) {
				kontrol = 0;
				System.out.println("Fazla indis girdiniz. Tekrar indis giriniz");
			}
			}
			kontrol = 0;
			while(kontrol == 0) {
			kontrol = 1;
			System.out.println("Yer Değiştirmesini İstediğiniz 2. indis: ");
			indis2 = input.nextInt();
			if(indis2 > muhendis.size()-1) {
				kontrol = 0;
				System.out.println("Fazla indis girdiniz. Tekrar indis giriniz");
			}
			}
			Muhendis tempMuh = new BilgisayarMuhendisi();
			tempMuh = muhendis.get(indis1);
			muhendis.set(indis1,muhendis.get(indis2));
			muhendis.set(indis2,tempMuh);
			
			break;
			
		case 4:
			File file = new File("muhmaaslar.txt");
			BufferedWriter writter = new BufferedWriter(new FileWriter(file,true));
			for(int i = 0; i<muhendis.size();i++) {
				writter.write(muhendis.get(i).id +" "+ muhendis.get(i).MaasHesapla());
				writter.newLine();
			}
			writter.close();
		}
		
			

			
		
		}
		
	}

}
