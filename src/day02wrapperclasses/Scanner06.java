package day02wrapperclasses;

import java.util.Scanner;

public class Scanner06 {

	public static void main(String[] args) {
		
		/*Boyutlarý kullanýcýdan alýnan bir dikdörtgenler prizmasýnýn hacmini hesaplayan bir program yazýnýz.
	    	Not: Dikdörtgenler Prizmasýnýn Hacmi:  En x Boy x Yükseklik 
        */
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen en, boy ve yukseklik giriniz");
		
		int en= scan.nextInt();
		int boy = scan.nextInt();
		int yukseklik = scan.nextInt();
		
		System.out.println(en* boy* yukseklik);
		
	}

}
