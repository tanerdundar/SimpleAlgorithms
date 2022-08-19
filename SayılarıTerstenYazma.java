package githuba;

import java.util.Scanner;

public class SayılarıTerstenYazma {

	public static void main(String[] args) {

		System.out.println("Lütfen tamsayı giriniz.");
		Scanner n1 = new Scanner(System.in);
		int p = n1.nextInt();
		sayıParçala(p);
	}

	static void sayıParçala(int p) {

		System.out.print("Sayınızın tersi : ");
		for (; p > 10;) {

			int sayı = p % 10;
			System.out.print(sayı);
			p = p / 10;
		}
		System.out.print(p);
	}

}
