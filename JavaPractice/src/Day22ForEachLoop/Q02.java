package Day22ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Q02 {

	public static void main(String[] args) {
/*
 * Bir integer list oluşturunuz ve bu list’deki 
 * tum sayıların karesinin toplamını 
 * For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
 */
		
		List<Integer> il=new ArrayList<>();
		il.add(2);
		il.add(3);
		il.add(4);
		il.add(5);
		System.out.println(il);
		int sum=0;
		for(int w:il) {
			sum+=w*w;
		}
		System.out.println(sum);
	}

}
