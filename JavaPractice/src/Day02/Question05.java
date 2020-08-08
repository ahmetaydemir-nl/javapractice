package Day02;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen yas giriniz");
		int yas=scan.nextInt();
		System.out.println("Lutfen kilo giriniz");
		int kilo=scan.nextInt();

		
		String result=yas>18 && kilo>50 ?"Kan verebilirsin" : "Veremezsin";
		System.out.println(result);
		scan.close();
		scan.close();

	}

}
