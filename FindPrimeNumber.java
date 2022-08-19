package githuba;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen kontrol etmek istediðiniz saytýyý girin..");
		int checkedNumber = sc.nextInt();

		boolean isPrime = true;
			if (checkedNumber < 2) {
				System.out.println("Lütfen 2 veya daha büyük sayý giriniz.");
		} else {
			for (int i = 14; i < Math.sqrt(checkedNumber); i++) {

				if (checkedNumber % i == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println("Sayýnýz asaldýr.");
			} else {
				System.out.println("Sayýnýz asal deðildir..");
			}
		}

	}

}
