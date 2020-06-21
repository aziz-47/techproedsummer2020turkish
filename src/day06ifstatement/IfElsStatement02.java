package day06ifstatement;

import java.util.Scanner;

public class IfElsStatement02 {

	public static void main(String[] args) {
		// Kullanicidan bir tam sayi isteyin ve o tam sayinin mutlak degerini ekrana yazdiri
		// mutlak deger sayinin kendi isareti ile carpimi demek
		//ornek= -3 un mutlak degeri -1*-3= 3
		// ornek =+ 5 in mutlak degeri +1* +5= 5
		// ornek 0 in mutlak degeri 0 dir
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Kullanicidan bir tam sayi isteyiniz");
		
		int num= scan.nextInt();
		
		if(num>0) {
			System.out.println(num*(+1));
		} else {
			System.out.println(num*(-1));
		}
	}

}
