package Day01;

import java.util.Scanner;

public class Practice06 {

	/* Kullanıcıdan 2 tane sayı alalım ve toplama işlemi yaptırıp ekrana yazdıralım
	 * 
	 * 1. Adım : Scanner class'ından nesne üretelim.
	 * 2. Adım : Kullanıcıdan 2 tane sayı isteyelim.
	 * 3. Adım : Aldığımız sayıları toplayarak, yeni bir değişkene atayalım.
	 * 4. Adım : Bunu ekrana yazdıralım.
	 * 5. Adım : Bunu float içinde yapalım.
	 *
	 * 
	 * */
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		System.out.println("Iki rakam giriniz : ");
		int sayi1 = scan.nextInt();
		int sayi2 =scan.nextInt();
		System.out.println(sayi1-sayi2);
		
		

		
		
		scan.close();

		


	}

}
