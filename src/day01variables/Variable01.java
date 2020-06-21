package day01variables;

public class Variable01 {
	
	public static void main(String[] args) {
		
		int maas =3000;
		
		char harf = 'S';  // charlara deger atamasi yaparken mutlaka tek tirnak kullan
		
		System.out.println(maas);   // ekrana variable yazdiginda cift tirnak kullanamz
		System.out.println(harf);
		
		int sayi=123;
		System.out.println(sayi); 
		
		boolean isOld= true; // boolean lar icin sadece true yada false degerlerini yazariz
		System.out.println(isOld);//true
		
		boolean isNew= false;
		System.out.println(isNew);// false
		
		byte derinlik= -123; //-128 den 127 (dahil) e kadar==> 8 bit yer kaplar
		System.out.println(derinlik);// =123
		
		
		short sirnakNufus= 2800;//
		System.out.println(sirnakNufus); //28000
		
		
		long hucreSayisi= 1234567891122344489l;// int sinirini asan long variablarda en sona "l" vaya L harfi koymaliyiz
		System.out.println(hucreSayisi);
		
		
		double pi= 3.145678889877; // java butun odalik kesirleri otamatik oarak double kabul eder
		                           // default value= 0.0
		System.out.println(pi);
		
		
		
		float para =5.25f; // eger bi ondalik kesri float yapmak istersek sonuna kucuk veya buyuk f veya F koyulur
		System.out.println(para); // default  vauesi 
		
		
		
		String ogrenciIsmi= "Ali Can";
		System.out.println(ogrenciIsmi);// Ali Can
	}

}
