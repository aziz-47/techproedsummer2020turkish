package day17constructors;

public class Constructors02 {
	
	
      //  buyume() methodu bu clasda degil constructor01 clasinda .
	  //o yuzden java kullanmamiza musade etmiyor
	// eger siz baska bir classdaki methodu kullnamk istiyorsaniz o classi dan bir tane object olusturp
	// o object sayseinde istediginiz methodu kullanbilrisnzi
	public static void main(String[] args) {
		
		Constructors01 obj1= new Constructors01();
		
		
		// buyume methodu static oldgundan java object kullanarak buyume methodunu 
		//cagirmamizi istemez ve kodun altini 
		// sari renkle cizer.
		obj1.buyume(33);
		Constructors01.buyume(45);
		obj1.isimDegistirme("Kemal Can");
		Constructors01.isimDegistirme("merhaba naci");
		System.out.println(obj1.isim);
		System.out.println(obj1.yas);
		
		
		// Bir veriable veya method static olarak olusturulumussa , o veriable veya methodds object olustrumadan 
		// sadece calass ismini kullanarak ulasabilirsiniz
		System.out.println(Constructors03.ad);
		System.out.println(Constructors03.kilo);
		Constructors03.artirma(45);
		Constructors03.degistirme("Ayhan Isik");
		
	}

}
