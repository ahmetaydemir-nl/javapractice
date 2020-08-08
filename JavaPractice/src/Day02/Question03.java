package Day02;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {

		//kullancidan 5 sayi alalim ve ilk iki ve son 2 basamaklarindaki sayilarin 
		//toplamini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("5 basamaklı bir sayı giriniz");
		int sayi=scan.nextInt();
		int birler=sayi%10;
		int onlar=(sayi/10)%10;
		int binler=(sayi/1000)%10;
		int yuzBinler=(sayi/10000)%10;
		System.out.println(birler+onlar+binler+yuzBinler);



       

scan.close();

	}

}
