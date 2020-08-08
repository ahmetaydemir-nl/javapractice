package Day06;

import java.util.Scanner;

public class Odev01 {
	public static void main(String[] args) {
	     //Kullanıcıda bir String kümesi girmesini isteyelim ve Kaç kelimeden
       //oluştuğunu dönen java methodu yazınız.
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir kelime grubu grubu giriniz");
		String str = input.nextLine();
		
		System.out.println("Metindeki kelime sayisi: " +kelimeSayisi(str));
		
		input.close();
		
	}
	public static int kelimeSayisi(String str) {
		
		int count=0;
		for (int i = 0; i <str.length(); i++) { //bugun hava cok sicak
			
			if (str.charAt(i)==' ') {
				count++;
			}
			
		}
		count=count+1;
		return count;


	}


}