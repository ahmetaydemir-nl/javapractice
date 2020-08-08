package day07;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		int sayac=0;
        
        int[]dizi={3,3,4,5,6};
                
        Scanner klavye = new Scanner(System.in);
        System.out.println("tekrarlayan sayi;");
        int ara=klavye.nextInt();
        
        for(int i=0;i<dizi.length;i++){
            if(ara==dizi[i]){
                
                sayac=sayac+1;
            }
            
        
    }
        System.out.println(" Sayı    : "   + ara);
        System.out.println(" Tekrar Sayısı : " + sayac);
    }	
	}


