package Day02;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
//Kullancidan 2 tam sayi alalim ve dort islem
		// sonucunu yazdiralim
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("iki sayi giriniz");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
	
		System.out.println("Toplama=" + (sayi1+sayi2));
		System.out.println("Cikarma=" + (sayi1-sayi2));
		System.out.println("Carpma=" + sayi1*sayi2);
		System.out.println("Bolme=" + sayi1/sayi2);

		scan.close();
		
	}

}
