import java.util.Scanner;

public class AnaSayfa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Departman Sayısı Girin : ");
        int departmanSayisi = input.nextInt();
        Departman[] departman = new Departman[departmanSayisi];
        int arananKontrol = 0;
        String aranan;
        int arananSayi;
        for (int i = 0; i < departmanSayisi; i++) {
            System.out.print((i + 1) + ". Departman No Girin : ");
            int depNo = input.nextInt();
            System.out.print(depNo + "'nolu departman Adını Girin : ");
            String depAd = input.next();
            departman[i] = new Departman(depNo, depAd);
            System.out.print(depAd + " departmanındaki personel sayısını giriniz : ");
            int personelSayisi = input.nextInt();
            departman[i].personeller = new Personel[personelSayisi];
            for (int j = 0; j < personelSayisi; j++) {
                System.out.print(depAd + " departmanındaki " + (j + 1) + ". personel adını giriniz : ");
                String perAd = input.next();
                System.out.print(depAd + " departmanındaki " + (j + 1) + ". personel soyadını giriniz : ");
                String perSoyad = input.next();
                System.out.print(depAd + " departmanındaki " + (j + 1) + ". personel yaşını giriniz : ");
                int perYas = input.nextInt();
                departman[i].personeller[j] = new Personel(depNo, depAd, perAd, perSoyad, perYas);
            }
            System.out.print(depAd + " departmanındaki proje sayısını giriniz : ");
            int projeSayisi = input.nextInt();
            departman[i].projeler = new Proje[projeSayisi];
            for (int k = 0; k < projeSayisi; k++) {
                System.out.print(depAd + " departmanındaki " + (k + 1) + ". proje adını giriniz : ");
                String projeAd = input.next();
                System.out.print(projeAd + " projesinin süresini giriniz : ");
                int projeSure = input.nextInt();
                System.out.print(projeAd + " projesinin maliyetini giriniz : ");
                int projeMaaliyet = input.nextInt();
                departman[i].projeler[k] = new Proje(depNo, depAd, projeAd, projeSure, projeMaaliyet);
            }
            System.out.println("-------------------------------------------------------------------------------------");
        }
        while (1 == 1) {
            System.out.println("\n1-Tüm Departmanların Bilgilerini Listele\n2-Departman Adına Göre Arama Yap\n3-Personel Adına Göre Arama Yap\n4-Proje Adına Göre Arama Yap\n5-Yaş Bilgisine Göre Personelleri Bul\n6-Yaş Bilgisine Göre Personelleri Analiz Et\n7-Proje Süresine Göre Projeleri Bul\n8-Proje Maliyetine Göre Projeleri Bul\n9-Proje Maliyetine Göre Projeleri Analiz Et\n10-Çıkış");
            int secim = input.nextInt();
            int i = 0;
            if (secim == 1) {
                for (i = 0; i < departman.length; i++) {
                    System.out.println("Departman No: " + departman[i].getDepNo() + " Departman Ad: " + departman[i].getDepAd());
                    System.out.println("Personeller: ");
                    for (int j = 0; j < departman[i].personeller.length; j++) {
                        System.out.println((j + 1) + ". Personel: " + departman[i].personeller[j].getPerID() + " " + departman[i].personeller[j].getPerAd() + " " + departman[i].personeller[j].getPerYas());
                    }
                    System.out.println("Projeler: ");
                    for (int k = 0; k < departman[i].projeler.length; k++) {
                        System.out.println((k + 1) + ". Proje: " + departman[i].projeler[k].getProjeId() + " " + departman[i].projeler[k].getProjeAd() + " " + departman[i].projeler[k].getProjeSure() + " " + departman[i].projeler[k].getProjeMaliyet());
                    }
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
            } else if (secim == 2) {
                System.out.println("Aranan Departman Adını Giriniz: ");
                aranan = input.next();

                for (int m = 0; m < departman.length; m++) {
                    if (departman[m].getDepAd().equals(aranan)) {
                        arananKontrol = 1;
                        System.out.println("Departman No: " + departman[m].getDepNo() + " Departman Ad: " + departman[m].getDepAd());
                        System.out.println("Personeller: ");
                        for (int j = 0; j < departman[m].personeller.length; j++) {
                            System.out.println((j + 1) + ". Personel: " + departman[m].personeller[j].getPerID() + " " + departman[m].personeller[j].getPerAd() + " " + departman[m].personeller[j].getPerYas());
                        }
                        System.out.println("Projeler: ");
                        for (int k = 0; k < departman[i].projeler.length; k++) {
                            System.out.println((k + 1) + ". Proje: " + departman[m].projeler[k].getProjeId() + " " + departman[m].projeler[k].getProjeAd() + " " + departman[m].projeler[k].getProjeSure() + " " + departman[m].projeler[k].getProjeMaliyet());
                        }
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    }
                }
                if (arananKontrol == 0)
                    System.out.println(aranan + " adında bir departman yok!");
            } else if (secim == 3) {
                arananKontrol = 0;
                System.out.println("Aranan Personel Adını Giriniz: ");
                aranan = input.next();
                for (int m = 0; m < departman.length; m++) {
                    for (int k = 0; k < departman[m].personeller.length; k++) {
                        if (departman[m].personeller[k].getPerAd().equals(aranan)) {
                            arananKontrol = 1;
                            System.out.println((k + 1) + ". Personel: " + departman[m].personeller[k].getDepAd() + " " + departman[m].personeller[k].getPerID() + " " + departman[m].personeller[k].getPerAd() + " " + departman[m].personeller[k].getPerYas());
                        }
                    }
                }
                if (arananKontrol == 0)
                    System.out.println(aranan + " adında bir personel yok!");
            } else if (secim == 4) {
                arananKontrol = 0;
                System.out.println("Aranan Proje Adını Giriniz: ");
                aranan = input.next();
                for (int m = 0; m < departman.length; m++) {
                    for (int k = 0; k < departman[m].projeler.length; k++) {
                        if (departman[m].projeler[k].getProjeAd().equals(aranan)) {
                            arananKontrol = 1;
                            System.out.println((m + 1) + ". Proje: " + departman[m].projeler[k].getDepAd() + " " + departman[m].projeler[k].getProjeAd() + " " + departman[m].projeler[k].getProjeSure() + " " + departman[m].projeler[k].getProjeMaliyet());
                        }
                    }
                }
                if (arananKontrol == 0)
                    System.out.println(aranan + " adında bir proje yok!");
            } else if (secim == 5) {
                arananKontrol = 0;
                System.out.println("Aranan Personel Yaşını Giriniz: ");
                arananSayi = input.nextInt();
                for (int m = 0; m < departman.length; m++) {
                    for (int k = 0; k < departman[m].personeller.length; k++) {
                        if (departman[m].personeller[k].getPerYas() == arananSayi) {
                            arananKontrol = 1;
                            System.out.println((k + 1) + ". Personel: " + departman[m].personeller[k].getDepAd() + " " + departman[m].personeller[k].getPerID() + " " + departman[m].personeller[k].getPerAd() + " " + departman[m].personeller[k].getPerSoyad() + " " + departman[m].personeller[k].getPerYas());
                        }
                    }
                }
                if (arananKontrol == 0)
                    System.out.println(arananSayi + " yaşında bir personel yok!");

            } else if (secim == 6) {
                if (departmanSayisi != 0) {
                    int sayac1 = 0;
                    int sayac2 = 0;
                    int sayac3 = 0;
                    int sayac4 = 0;
                    int yasToplam = 0;
                    for (int m = 0; m < departman.length; m++) {
                        for (int k = 0; k < departman[m].personeller.length; k++) {
                            if (departman[m].personeller[k].getPerYas() >= 20 & departman[m].personeller[k].getPerYas() <= 30) {
                                sayac1++;
                                yasToplam += departman[m].personeller[k].getPerYas();
                            } else if (departman[m].personeller[k].getPerYas() > 30 & departman[m].personeller[k].getPerYas() <= 40) {
                                sayac2++;
                                yasToplam += departman[m].personeller[k].getPerYas();
                            } else if (departman[m].personeller[k].getPerYas() > 40 & departman[m].personeller[k].getPerYas() <= 50) {
                                sayac3++;
                                yasToplam += departman[m].personeller[k].getPerYas();
                            } else if (departman[m].personeller[k].getPerYas() > 50) {
                                sayac4++;
                                yasToplam += departman[m].personeller[k].getPerYas();
                            }
                        }
                    }
                    System.out.println("20 - 30 Yaş Aralığındaki Personel Sayısı: " + sayac1);
                    System.out.println("31 - 40 Yaş Aralığındaki Personel Sayısı: " + sayac2);
                    System.out.println("41 - 50 Yaş Aralığındaki Personel Sayısı: " + sayac3);
                    System.out.println(">50 Yaş Personel Sayısı: " + sayac4);
                    System.out.println("-------------------------------------------------------------------------------------");
                    System.out.println("Tüm Personellerin Yaş Ortalaması: " + yasToplam / (sayac1 + sayac2 + sayac3 + sayac4));
                } else {
                    System.out.println("Personel Yok");
                }
            } else if (secim == 7) {
                arananKontrol = 0;
                System.out.println("Aranan Proje Süresi Giriniz: ");
                arananSayi = input.nextInt();
                for (int m = 0; m < departman.length; m++) {
                    for (int k = 0; k < departman[m].projeler.length; k++) {
                        if (departman[m].projeler[k].getProjeSure() == arananSayi) {
                            arananKontrol = 1;
                            System.out.println((k + 1) + ". Proje: " + departman[m].projeler[k].getDepAd() + " " + departman[m].projeler[k].getProjeAd() + " " + departman[m].projeler[k].getProjeSure() + " " + departman[m].projeler[k].getProjeMaliyet());
                        }
                    }
                }
                if (arananKontrol == 0)
                    System.out.println(arananSayi + " süresi olan bir proje yok!");
            } else if (secim == 8) {
                arananKontrol = 0;
                System.out.println("Aranan Proje Maliyeti Giriniz: ");
                arananSayi = input.nextInt();
                for (int m = 0; m < departman.length; m++) {
                    for (int k = 0; k < departman[m].projeler.length; k++) {
                        if (departman[m].projeler[k].getProjeMaliyet() == arananSayi) {
                            arananKontrol = 1;
                            System.out.println((m + 1) + ". Proje: " + departman[m].projeler[k].getDepAd() + " " + departman[m].projeler[k].getProjeAd() + " " + departman[m].projeler[k].getProjeSure() + " " + departman[m].projeler[k].getProjeMaliyet());
                        }
                    }
                }
                if (arananKontrol == 0)
                    System.out.println(arananSayi + " maliyetinde bir proje yok!");
            } else if (secim == 9) {
                int maxMaliyet;
                int minMaliyet;
                String maxProjeAdi;
                String minProjeAdi;
                i = 0;
                if (departmanSayisi != 0) {
                    try {
                        maxMaliyet = departman[i].projeler[0].getProjeMaliyet();
                        maxProjeAdi = departman[i].projeler[0].getProjeAd();
                        minMaliyet = departman[i].projeler[0].getProjeMaliyet();
                        minProjeAdi = departman[i].projeler[0].getProjeAd();

                    } catch (Exception e) {
                        maxMaliyet = departman[i + 1].projeler[0].getProjeMaliyet();
                        maxProjeAdi = departman[i + 1].projeler[0].getProjeAd();
                        minMaliyet = departman[i + 1].projeler[0].getProjeMaliyet();
                        minProjeAdi = departman[i + 1].projeler[0].getProjeAd();

                    }
                    int toplamMaliyet = 0;
                    int toplamProjeSayisi = 0;

                    for (int m = 0; m < departman.length; m++) {
                        for (int k = 0; k < departman[m].projeler.length; k++) {
                            toplamMaliyet += departman[m].projeler[k].getProjeMaliyet();
                            toplamProjeSayisi++;
                            if (maxMaliyet < departman[m].projeler[k].getProjeMaliyet()) {
                                maxMaliyet = departman[m].projeler[k].getProjeMaliyet();
                                maxProjeAdi = departman[m].projeler[k].getProjeAd();
                            } else if (minMaliyet > departman[m].projeler[k].getProjeMaliyet()) {
                                minMaliyet = departman[m].projeler[k].getProjeMaliyet();
                                minProjeAdi = departman[m].projeler[k].getProjeAd();
                            }
                        }
                    }
                    System.out.println("En Yüksek Maliyetli Proje: " + maxProjeAdi + " " + maxMaliyet);
                    System.out.println("En Düşük Maliyetli Proje: " + minProjeAdi + " " + minMaliyet);
                    System.out.println("-------------------------------------------------------------------------------------");
                    System.out.println("Tüm Projelerin Ortalama Maliyeti: " + toplamMaliyet / toplamProjeSayisi);
                } else System.out.println("Proje Yok");
            } else if (secim == 10)
                return;
            else
                System.out.println("Hatalı Seçim Yaptınız");
        }
    }
}

