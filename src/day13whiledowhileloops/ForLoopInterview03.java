package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview03 {

	public static void main(String[] args) {
		//Kullanicidan bir sayi alin
		// bu sayinin tersinin 2 fazlasini  ekrana yazdinriz
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Bir sayi giriniz");
		String num= scan.nextLine();
		
		String ters="";
		
		for(int i = num.length()-1; i>=0; i--) {
			ters= ters+(num.charAt(i)) + "";// chari stringe cevirmek icin sonuna + "" ekleyebilrisiniz
			

		}
		
		System.out.println(ters);
		
		int tersInt=Integer.valueOf(ters);
		tersInt= tersInt+2;
		
		System.out.println(tersInt);//123 ==> 321 + 2==>323
		
		scan.close();
		
		
	}

}
