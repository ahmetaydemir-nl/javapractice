package day12;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// KULLANICIDAN BIR SAYI ALALim o sayi kadar ard arda gelen
		//fibonaci sayi dizisini yazalim
		//ornek girilen sayi 10, 0 1 1 2 3 4 8 13 21 34

		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen fibonacci sayisi giriniz");
		int sayi=input.nextInt();
		
		int sayi1=0;
		int sayi2=1;
		int ikiSayininToplami=0;
		System.out.print(sayi1+ " " + sayi2);
		for (int i=2; i <sayi; i++){
			ikiSayininToplami =sayi1 +sayi2;//1=0+1
			sayi1=sayi2;
			sayi2=ikiSayininToplami;//1
			System.out.print(" "+ ikiSayininToplami);
		}
	}

}
