package day09;

public class Ogrenci {

	private String isim;
	private int ogrencino;
	
	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getOgrencino() {
		return ogrencino;
	}

	public void setOgrencino(int ogrencino) {
		this.ogrencino = ogrencino;
	}

	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", ogrencino=" + ogrencino + "]";
	}

}
