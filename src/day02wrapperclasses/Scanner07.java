package day02wrapperclasses;

import java.util.Scanner;

public class Scanner07 {

	public static void main(String[] args) {
		
		/*)Kenar uzunluklar� kullan�c�dan al�nan bir ��genin �evresini hesaplayan bir  Program yaz�n�z. 
		  (byte kullan�n�z) Not 1: ��genin Cevresi: a + b + c
        .*/
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Lutfen ucgenin kenar uzunluklarini veriniz");
		
		byte a = scan.nextByte();
		byte b = scan.nextByte();
		byte c = scan.nextByte();
		
		System.out.println(a + b + c);
	}

}
