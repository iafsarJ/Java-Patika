package java101;

import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen bir tutar giriniz: ");
		double para = input.nextDouble();
		
		double kdvOraniHesaplama = (para > 1000 ? 0.08 : 0.18);
		double kdvTutari = para * kdvOraniHesaplama;
		System.out.println("Kdv Tutarı: " + kdvTutari);
		
		double kdvliFiyat = para + kdvTutari;
		System.out.println("Kdvli Fiyat: " + kdvliFiyat);
	}

}
