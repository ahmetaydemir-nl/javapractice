package Day02;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		// iki sayi girin. bunlarin birbiriyle 
		//olan durumunu karsilastir.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen birinci tam sayiyi giriniz");
		int sayi1 = scan.nextInt();
		System.out.println("lutfen ikinci tam sayiyi giriniz");
		int sayi2= scan.nextInt();
		
		
		if(sayi1<sayi2) {
			System.out.println(sayi1+"<"+sayi2);
		}else if (sayi1>sayi2) {
			System.out.println(sayi1+">"+sayi2);
		}else if (sayi1==sayi2) {
			System.out.println(sayi1+"="+sayi2);
		}else if (sayi1!=sayi2) {
			System.out.println(sayi1+"!="+sayi2);
		}else if (sayi1>=sayi2) {
			System.out.println(sayi1+">="+sayi2);
		}else  {
			System.out.println(sayi1+"<="+sayi2);
		}
		
		
		scan.close();
	}

}
