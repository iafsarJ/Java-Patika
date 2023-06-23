package java101;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {

	public static void main(String[] args) {
		int mat, kimya, fizik, turkce, tarih, muzik;

		Scanner input = new Scanner(System.in);

		System.out.print("Matematik notunuz: ");
		mat = input.nextInt();

		System.out.print("Kimya notunuz: ");
		kimya = input.nextInt();

		System.out.print("Fizik notunuz: ");
		fizik = input.nextInt();

		System.out.print("Türkçe notunuz: ");
		turkce = input.nextInt();

		System.out.print("Tarih notunuz: ");
		tarih = input.nextInt();

		System.out.print("Müzik notunuz: ");
		muzik = input.nextInt();

		double ortalama = (mat + kimya + fizik + turkce + tarih + muzik) / 6;
		System.out.println("Ortalamanız: " + ortalama);

		var sonuc = (ortalama >= 60) ? "Sınıfı geçti" : "Sınıfta Kaldı";
		System.out.println(sonuc);

	}

}
