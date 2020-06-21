package day17constructors;

public class Constructors01 {
	
	String isim= "Ali Can";
	int yas= 33;
   // method ile main method ayni clasin icinde ise methohodu sadece ismini yazarak kullanbiirsiniz
	public static void main(String[] args) {
		buyume(33);
		isimDegistirme("Ayse Han");

	}
	
	
	public static void buyume(int yas) {
		yas++;
		System.out.println(yas);
	}
	
	public static void isimDegistirme(String isim) {
		System.out.println(isim);
	}

}
