package Day03;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullanıcıdan 3 tene pozitif  tam sayı alalım 
	    // bu uc sayidan ucgen olup olmama durumunu kontrol edelim
	    // eger ucgen olabiliyor ise, es kenar ucgen mi kontro edelim
	        // a+b>c>a-b
	        //a+c>b>a-c
	        //b+c>a>b-c
	        //a=b=c es kenar ucgen 
	        // sadece ucgen
	        //ucgen degildir.

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ilk sayiyi giriniz");
		int ilk = scan.nextInt();
		System.out.println("Ikinci sayiyi giriniz");
		int ikinci = scan.nextInt();
		System.out.println("Ucunu sayiyi giriniz");
		int ucuncu = scan.nextInt();
         
         if (ilk-ikinci<ucuncu && ikinci-ucuncu<ilk && ucuncu - ilk<ikinci) {
        	 System.out.println("ucgendir");
        	 if (ilk==ikinci && ikinci==ucuncu){
        	if(ilk==ikinci || ikinci==ucuncu) {
                	 System.out.println("eskenar ucgen");
        	 }
         }else 
        	  
        	  { System.out.println("ucgen degildir");
        		 {
        		 
        		 }
        	  }
        	 
	}

	}
	}
