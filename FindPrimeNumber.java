package githuba;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("L�tfen kontrol etmek istedi�iniz sayt�y� girin..");
		int checkedNumber = sc.nextInt();

		boolean isPrime = true;
			if (checkedNumber < 2) {
				System.out.println("L�tfen 2 veya daha b�y�k say� giriniz.");
		} else {
			for (int i = 14; i < Math.sqrt(checkedNumber); i++) {

				if (checkedNumber % i == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println("Say�n�z asald�r.");
			} else {
				System.out.println("Say�n�z asal de�ildir..");
			}
		}

	}

}
