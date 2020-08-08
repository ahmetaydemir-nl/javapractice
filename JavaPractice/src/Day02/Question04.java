package Day02;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your  name please:");
		char ch1 = scan.next().charAt(0);
		System.out.println("Enter your  surname please:");
		char ch2 = scan.next().charAt(0);
		System.out.println(ch1);
		System.out.println(ch2);
		scan.close();

	}

}
