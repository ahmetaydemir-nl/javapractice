package day12abstract;

public class Main {

	public static void main(String[] args) {

		Motor motor = new Motor(0,0);
		motor.vitesAt(3);
		motor.hizArtir(50);
		
		motor.bilgileriGoster();
		
		Arac arac = new Motor(20,1);
		
		vitesArttir(5, motor);
		arac.vitesAt(6);
		arac.hizArtir(100);
		arac.bilgileriGoster();

		Bisiklet bisiklet = new Bisiklet(0,3);
		bisiklet.vitesAt(5);
		bisiklet.hizArtir(30);
	}

	public static void vitesArttir(int sayi,Arac arac) {
		arac.vitesAt(sayi);
	}
}
