package Day06;

import java.util.Scanner;
public class Question04 {

	public static void main(String[] args) {
		// Uc sayi arasindaki en buyuk sayiyi bulan java methodu yazalim.
		
		enBuyuk(5,4,3);
		

	}
	public static void enBuyuk(double a, double b, double c) {
		
		if(a>b && a>c) {
			System.out.println("En buyuk sayi : " + a);
		}else if (b>a && b>c) {
			System.out.println("En buyuk sayi " + b);
		}else {
			System.out.println("En buyuk sayi: " + c);
		}
		
	}

}