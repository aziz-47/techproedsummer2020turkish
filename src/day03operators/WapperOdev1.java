package day03operators;

import java.util.Scanner;

public class WapperOdev1 {
	
	public static void main(String [] args) {
		
	//Kullanýcýdan ad ve soyadýný alýp ekrana yazdýran bir program yazýnýz.  (String kullanýnýz)  
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
		
		String tamIsim= scan.nextLine();
		System.out.println(tamIsim);
		
	}
	

}
