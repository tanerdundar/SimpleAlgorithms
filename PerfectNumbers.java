package githuba.at�ld�;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("L�tfen kontrol etmek istedi�iniz say�y� giriniz.");
		int newNumber = sc.nextInt();
		int total = 0;
		
		for (int i=1;i<newNumber;i++) {
			if (newNumber%i==0 ) {
				total +=i;
			}
			
		}
		if (total == newNumber) {
			System.out.println(newNumber + " bir M�KEMMEL say�d�r.");
		}else {
			System.out.println(newNumber + " bir m�kemmel say� de�ildir. :((((");
			System.out.println("B�lenleri toplam� ise: " + total);
		}
	}

}