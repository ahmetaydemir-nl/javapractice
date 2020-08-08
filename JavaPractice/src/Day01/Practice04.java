package Day01;

import java.util.Scanner;

public class Practice04 {
	/* Basit bir bilgi tablosu oluşturalım.
	 * 
	 * 1. Adım : İsim ve Soyismiminizi ekrana yazdırın.
	 * 2. Adım : Satır atlayarak boyunuzu ekrana yazdırın.
	 
	 * */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("İsim ve soyisim yazınız : ");
		String isimSoyisim = scan.nextLine();
		System.out.println("Boyunuzu yazınız : ");
		int boy = scan.nextInt();
	
		scan.close();
	}

}
