package day12inheritance;

public class Hayvan extends Canli{

	private String cins;
	public Hayvan(String isim, int uzunluk, int agirlik, String cins) {
		super(isim, uzunluk, agirlik);
		this.cins=cins;
	}
	
	public void kos() {
		System.out.println("hayvan sinifinda kos methodu calisti.");
	}
	
	
	public String getCins() {
		return cins;
	}
	public void setCins(String cins) {
		this.cins = cins;
	}

	@Override
	public void solunum() {
		System.out.println("hayvanda solunum calisti");	

	}

	@Override
	public void beslenme() {
		System.out.println("hayvanda beslenme calisti");	
		}

}
