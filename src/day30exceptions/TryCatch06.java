package day30exceptions;

public class TryCatch06 {

	public static void main(String[] args) {
		try {
			hop();
			
		}catch(Exception e) {
			e.printStackTrace();
			// printStackTrace() methodu Exceptionlarin nerede olustugunu daatyli bilgisini verir
			// excepton olusum sirasina gore consolda yazilir
		}
	}
    
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
}
