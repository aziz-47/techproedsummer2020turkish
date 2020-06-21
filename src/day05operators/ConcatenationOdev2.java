package day05operators;

public class ConcatenationOdev2 {

	public static void main(String[] args) {
		
		//Altaki variable’lari kullanarak ekrana  “61 Study-1”  yazdýran bir program yazýnýz.
		//Not: Sadece variable isimlerini kullanýnýz.
		
		
		int numA = 2;
		int numB = 3;
		String str1= "Study";
		String str2= "Hard";
		
	/*	System.out.print(numA*numB);
		System.out.print(numB-numA);
		System.out.print(" "+ str1);
		System.out.print(numA-numB);
		
	*/	
		
		System.out.println((numA*numB)+(numB-numA+" "+str1)+(numA-numB));

	}

}
