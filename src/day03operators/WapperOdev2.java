package day03operators;

import java.util.Scanner;

public class WapperOdev2 {

	public static void main(String[] args) {
		
		//Kullanýcýdan ad, soyad ve adresini alýp ekrana yazdýran bir program yazýnýz. 
		 //Ad ve soyad ilk satýrda, adres ikinci satýrda olsun. (String kullanýnýz)  
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
		String tamIsim= scan.nextLine();
		
		
		System.out.println("Lutfen adresinizi giriniz");
		String adres= scan.nextLine();
		
		System.out.println(tamIsim);
		System.out.println(adres);
	}

}
