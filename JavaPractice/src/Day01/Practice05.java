package Day01;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		/* Basit bir bilgi tablosu oluşturalım.
		 * 
		 * 1. Adım : Scanner classtan nesne üretelim.
		 * 2. Adım : Kullanıcıdan isim alalım.
		 * 3. Adım : Kullanıcıdan soyisim alalım.
		 * 4. Adım : Kullanıcıdan, boy bilgisi alalım.
		 * 5. Adım : Kullanıcıdan, kilo bilgisi alalım.
		 * 6. Adım : Kullanıcıdan, hobi bilgisi alalım.
		 * 
		 * Not : Tüm işlemleri variable(değişken) kullanarak yapın.
		 * 
		 * Scanner scan = new Scanner(System.in);
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("İsim ve soyisim yazınız : ");
		String isimSoyisim = scan.nextLine();
		System.out.println("Boyunuzu yazınız : ");
		int boy = scan.nextInt();
		System.out.println("Kilonuzu yazınız : ");
		float kilo = scan.nextFloat();
		System.out.println("Hobilerinizi yazınız : ");
		String hobi = scan.nextLine();
		scan.nextLine();
		System.out.println(isimSoyisim);
		System.out.println(boy);
		System.out.println(kilo);
		System.out.println(hobi);
		scan.close();

		
		
				
		

	}

}
