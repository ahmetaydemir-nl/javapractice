package Day06;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		// Klavyeden girilen bir cumlede belerledigimiz bir harfin tekrar sayisini bulalim.
		
		//bugun hava cok sicak  //3 tane a harfi var
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=input.nextLine();
		System.out.println("Tekrari bulunacak harfi giriniz");
		String harf =input.next();
		
		System.out.println(harf + " harfi " + harfSayisi(cumle,harf) + " defa tekrar etmistir.");
		
	}
	public static int harfSayisi(String cumle,String harf) {
		int harfSayisi= 0;
		for(int i =0; i<cumle.length();i++) {
			if(cumle.substring(i,i+1).equals(harf))  //ali a
				harfSayisi++;
			
		}
		return harfSayisi;
		
		

	}

}