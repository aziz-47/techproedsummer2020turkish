package day03operators;

import java.util.Scanner;

public class WapperOdev1 {
	
	public static void main(String [] args) {
		
	//Kullan�c�dan ad ve soyad�n� al�p ekrana yazd�ran bir program yaz�n�z.  (String kullan�n�z)  
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
		
		String tamIsim= scan.nextLine();
		System.out.println(tamIsim);
		
	}
	

}
