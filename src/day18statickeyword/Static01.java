 package day18statickeyword;

public class Static01 {

	static int en= 12;
	static int boy= 10;
	static int yaricap=4;
	static double pi;
	static int alan ;
	// eger bir verablein degerini olsuturuken hesaplama yapmamiz gerekirse "static  bloc" olusturmak iyidir.
	//yani "int alan = en*boy" demek yerine
	// staic bloc olusturup bu islemelri  static bloc un icine yazmak daha iyidir.
	// static blok veriablelere deger atamk icinde kullanilabilir.
	
	// "static blok" clasiin icinde butun metohlarin (main dahil) ve constructorlarin disinda olusturulmalidir
	
	// static block class olusturuldugu zman olusturulur. 
	
	// tsatic block tum methodlrdan(main method dahil ) ve constructorlardan  once calistirilir.
	
	// birden fazla static block varsa usteki once calisir
	
	
	static {
		
		pi=3.14;
	}
	
	static {
		
		alan=en*boy;
	}
	
	public static void main(String[] args) {
	
	}
	
	
	// static class olusturulablir ama alt claslar(inner class) static olabilri.
	//ust claslar(outer clas) static olamazlar.
	
	
	
	public class AltClass{
		
	}
	
	
}
