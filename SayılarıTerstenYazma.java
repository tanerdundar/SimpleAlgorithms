package githuba;

import java.util.Scanner;

public class Say�lar�TerstenYazma {

	public static void main(String[] args) {

		System.out.println("L�tfen tamsay� giriniz.");
		Scanner n1 = new Scanner(System.in);
		int p = n1.nextInt();
		say�Par�ala(p);
	}

	static void say�Par�ala(int p) {

		System.out.print("Say�n�z�n tersi : ");
		for (; p > 10;) {

			int say� = p % 10;
			System.out.print(say�);
			p = p / 10;
		}
		System.out.print(p);
	}

}
