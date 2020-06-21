package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		// startsWith() methodu bir stringin istenen hafle baslanip baslanmadigini kontrol eder
		// istetenen harfle basliyorsa tru, baslamiyorsa false return eder
		
		String str1= "Ali Can";
		// startsWith() 1. versiyorn
		System.out.println(str1.startsWith("A"));//true
		System.out.println(str1.startsWith("B"));//false
		System.out.println(str1.startsWith("a"));//false
		
		
		
		System.out.println(str1.startsWith("Ali"));//true
		
		
		//startsWith() 2 versiyonu
		System.out.println(str1.startsWith("a", 3));//false
		System.out.println(str1.startsWith("a", 5));//true
		System.out.println(str1.startsWith("Can", 4));//true
		
		
		//endsWith() bir stringin istenen harfle bitip bitmedgini kontrol eder
		// istenen harfle bitiuyorsa true, bitmiyorsa false return eder
		
		String str2= "Ayse Canan";
		
		System.out.println(str2.endsWith("n"));//true
		System.out.println(str2.endsWith("Canan"));//true
		
		System.out.println(str2.endsWith("CANAN"));//FALSE 
		
		System.out.println(str2.endsWith(""));// "" VE " " TAMAMIYLA FARKLIDIR . ikincinin icinde bosluk karakteri var
		                                      // biriniicnin icinde hic birsey yok
		
		
		String str3= "Ali ";
		System.out.println(str3.endsWith(" "));//true
		System.out.println(str3.endsWith(""));//true
		System.out.println(str3.startsWith(" "));// true

	}

}
