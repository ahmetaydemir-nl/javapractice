package Day22ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Q01 {

	public static void main(String[] args) {
/*
 * Bir integer array oluşturunuz ve bu array’deki 
 * tum sayıların çarpımını For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
 */
		
		List<Integer> il = new ArrayList<>();
		il.add(-3);
		il.add(-5);
		il.add(2);

		int product = 1;
		for (int w : il) {
			product = product * w;
		}
		System.out.println(product);
	}

}
