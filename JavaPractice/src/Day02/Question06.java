package Day02;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		// Kullanicidan alinan sayinin
		//pozitif, negatif yada notr durumu kontrol.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("harf giriniz");
		char ch = scan.next().charAt(0);
		
		String result = ( ch>='a' && ch<='z')? "kucuk harf" :(ch>='A' && ch<='Z' ) ? "Buyuk harf" : "Harf degil";
		System.out.println(result);
		
		
		scan.close();
	}

}
