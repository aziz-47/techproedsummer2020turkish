package day32abstraction;

public class KralDairesi  extends Otel {

	public static void main(String[] args) {
		KralDairesi musteri3 = new KralDairesi ();
		  musteri3.kahvalti();
		  System.out.println(musteri3.tv("international", 5));
		  System.out.println(musteri3.wifi(10));

	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltiniz teras kat kral restaurantadir");
		
	}
	
	public int tv(String international, int saat) {
		if(international.equals(international)) {
			return saat*5;
		}else {
			return 0;
		}
	}

}
