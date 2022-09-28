package reCapDemo_Classes;

public class main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc =dortIslem.Topla(3, 4);
		System.out.println(sonuc);
		sonuc =dortIslem.Cikar(3, 4);
		System.out.println(sonuc);
		sonuc =dortIslem.Carp(3, 4);
		System.out.println(sonuc);
		sonuc =dortIslem.Bol(3, 4);
		System.out.println(sonuc);
	}

}
