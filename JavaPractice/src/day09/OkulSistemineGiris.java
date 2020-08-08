package day09;

public class OkulSistemineGiris {

	public static void main(String[] args) {
		/*
	     * Öğretmen, öğrenci ve okul genel bilgilerinden oluşan JAVA programı yazınız.
	     *
	     * 1. Adım : Okulun sabit bilgilerini içerisine ekleyeceğimiz SabitBilgiler adlı bir class oluşturalım
	     *           Buradaki verileri public static final olarak tutalım.
	     *           MUDUR, OKUL_ISMI, TELEFON_NO, ADRES, WEBSITE, TEKNIK_DESTEK
	     *
	     * 2. Adım : Ogretmen adlı bir class oluşturalım.
	     *           Bu classta öğretmenin adı, branşı ve telefon numaralarını tutalım.
	     *           String isim, brans, telefon ;
	     *
	     *           içerisine "public String toString()" methodu ekleyerek, istediğimiz zaman öğretmenlerin bilgilerini yazdıralım
	     *
	     * 3. Adım : Ogrenci adlı bir class oluşturalım.
	     *           Bu classta ogrencinin adı, okulnumarası bulunsun.
	     *           String isim;
	     *           int ogrenciNo;
	     *
	     *           içerisine "public String toString()" methodu ekleyerek, istediğimiz zaman ogrencilerin bilgilerini yazdıralım
	     *
	     * 4. Adım : Ogretmenler adlı class oluşturalım.
	     *           Bu classta tüm öğretmenleri tutualım.
	     *           İçerisine List<Ogretmen> ogrentmenListesi adlı bir ArrayList oluşturalım ve tüm öğretmenleri içine ekleyelim
	     *           Bu class'ın içine "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak yeni öğretmen ekleyebilelim.
	     *
	     * 5. Adım : Ogrenciler adlı class oluşturalım.
	     *           Bu classta tüm öğrenciler tutualım.
	     *           İçerisine List<Ogrenci> ogrenciListesi adlı bir ArrayList oluşturalım ve tüm öğretmenleri içine ekleyelim
	     *           Bu class'ın içine "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak yeni öğrenci ekleyebilelim.
	     *
	     *
	     * */
		
		System.out.println("*******OKULUMUZA HOSGELDINIZ********");
		System.out.println("Okul ismi:"+ SabitBilgiler.OKUL_ISMI);
		System.out.println("Okul Muduru:"+ SabitBilgiler.MUDUR);
		System.out.println("Okul Telefonu:"+ SabitBilgiler.TELEFON_NO);
		System.out.println("Okul Adresi: "+ SabitBilgiler.ADRES);
		System.out.println("Okul Webadresi: "+ SabitBilgiler.WEBSITESI);
		System.out.println("Okul Teknik Destek: "+ SabitBilgiler.TEKNIK_DESTEK);
		
		System.out.println("\n OGRETMEN OLUSTURALIM \n");
		
		Ogretmen Ogretmen1 = new Ogretmen ();
		Ogretmen1.setIsim("Suleyman Hoca");
		Ogretmen1.setBrans("Java");
		Ogretmen1.setTelefon("+12345678");
		
		System.out.println("\n isim: " + Ogretmen1.getIsim());
		System.out.println("\n BRANS: " + Ogretmen1.getBrans());
		System.out.println("\n Telefon: " + Ogretmen1.getTelefon());


		Ogretmen ogretmenAli = new Ogretmen ("Ali", "Mat", "234567");
		
		System.out.println("isim: " + ogretmenAli.getIsim());
		System.out.println("Brans: " + ogretmenAli.getBrans());
		System.out.println("Telefon: " + ogretmenAli.getTelefon());

		System.out.println(Ogretmen1.toString());

		
		System.out.println("\n OGRENCI OLUSTURALIM \n");
		
		Ogrenci ogrenci1 =new Ogrenci();
		Ogrenci ogrenci2 =new Ogrenci();
		
		ogrenci1.setIsim("HasanDogan");
		ogrenci1.setOgrencino(1);
		ogrenci2.setIsim("Mehmet Koca");
		ogrenci2.setOgrencino(2);
		
		System.out.println(ogrenci1.toString());
		System.out.println(ogrenci2.toString());


		



		
	}

}
