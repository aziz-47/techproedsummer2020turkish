package day02wrapperclasses;

import java.util.Scanner;

public class Scanner07 {

	public static void main(String[] args) {
		
		/*)Kenar uzunluklarý kullanýcýdan alýnan bir üçgenin çevresini hesaplayan bir  Program yazýnýz. 
		  (byte kullanýnýz) Not 1: Üçgenin Cevresi: a + b + c
        .*/
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Lutfen ucgenin kenar uzunluklarini veriniz");
		
		byte a = scan.nextByte();
		byte b = scan.nextByte();
		byte c = scan.nextByte();
		
		System.out.println(a + b + c);
	}

}
