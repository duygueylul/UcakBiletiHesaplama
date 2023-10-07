package UcakBiletiHesaplama;


import java.util.Scanner;
public class BiletHesaplama {

	public static void main(String[] args) {
		// Km birim fiyatı : 0.105
		// 12 yaşından küçükse toplam fiyata 50% indirim
		// 12 ve 24 yaş arasındaysa 10% indirim
		// 65 yaşından büyükse 30% indirim
		// Gidiş dönüş alırsa 20% inidirim
		
		Scanner scan = new Scanner(System.in);
		int km, yas, tip;
		System.out.print("Mesafeyi giriniz: ");
		km = scan.nextInt();
		System.out.println("Yaşınızı giriniz: ");
		yas = scan.nextInt();
		System.out.println("Yolculuk tipini seçiniz:  (1= Tek Gidiş / 2= Gidiş/Dönüş) ");
		tip = scan.nextInt();
		
		double normFiyat, yasInd, tipInd;
		if(km > 0 && yas > 0 && (tip == 1 || tip == 2 )) {
			normFiyat = km*0.10;
			if(yas < 12) {
				yasInd = normFiyat * 0.5;
			}
			else if(yas >= 12 && yas <= 24) {
				yasInd = normFiyat * 0.10;
			}
			else if(yas >= 65) {
				yasInd = normFiyat * 0.30;
			}
			else {
				yasInd = 0;
			}
			normFiyat -= yasInd;
			if(tip == 2) {
				tipInd = normFiyat * 0.20;
				normFiyat = (normFiyat - tipInd) * 2;
			}
			System.out.println("Bilet Tutarı: " + normFiyat + "$");
		 
		}
		else{
			System.out.println("Girdiğiniz değerler eksik veya yanlış lütfen tekrar deneyiniz!!!");
		}
	}

}
