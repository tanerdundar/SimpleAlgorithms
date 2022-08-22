package githuba.atýldý;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lütfen kontrol etmek istediðiniz sayýyý giriniz.");
		int newNumber = sc.nextInt();
		int total = 0;
		
		for (int i=1;i<newNumber;i++) {
			if (newNumber%i==0 ) {
				total +=i;
			}
			
		}
		if (total == newNumber) {
			System.out.println(newNumber + " bir MÜKEMMEL sayýdýr.");
		}else {
			System.out.println(newNumber + " bir mükemmel sayý deðildir. :((((");
			System.out.println("Bölenleri toplamý ise: " + total);
		}
	}

}