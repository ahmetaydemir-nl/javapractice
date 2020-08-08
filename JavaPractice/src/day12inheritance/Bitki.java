package day12inheritance;

public class Bitki extends Canli{
	private String renk;
	
	public Bitki(String isim, int uzunluk, int agirlik, String renk) {
		super(isim, uzunluk, agirlik);
		this.renk=renk;
	}

	public void solunum() {
		System.out.println("bitki fotosentez yapar");
	}
	
	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	@Override
	public void beslenme() {
		System.out.println("bitki besleniyor.");
	}

}
