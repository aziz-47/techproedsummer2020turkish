package day03operators;

import java.util.Scanner;

public class WapperOdev2 {

	public static void main(String[] args) {
		
		//Kullan�c�dan ad, soyad ve adresini al�p ekrana yazd�ran bir program yaz�n�z. 
		 //Ad ve soyad ilk sat�rda, adres ikinci sat�rda olsun. (String kullan�n�z)  
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
		String tamIsim= scan.nextLine();
		
		
		System.out.println("Lutfen adresinizi giriniz");
		String adres= scan.nextLine();
		
		System.out.println(tamIsim);
		System.out.println(adres);
	}

}
