package Day08;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
//array elemanlarini siralayan bir kod yapin.
		
		Scanner input = new Scanner(System.in);
		System.out.println("5 Sayi Giriniz");
		int num1 = input.nextInt();
		
		
		
		int arr[] = {num1};
        for(int i=0; i<=arr.length-1; i++) {
        	System.out.print(arr[i] + " ");
        }
	}

}
