package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		/*
		Yar��ap� kullan�c�dan al�nan bir dairenin �evresini ve alan�n� hesaplayan 
		bir program yaz�n�z. (float kullan�n�z)
		Not 1: pi say�s�: 3.14159
		Not 2: Alan: 3.14159 x radius x radius
		Not 3: Cevre: 2 x 3.14159 x radius 
		*/
		
		
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Lutfen yari capi giriniz");
		
		double yaricap = scan.nextDouble(); // data tipi int ise next int kullanilir. 
		                                    //data tipi double ise next double kullanilir vs...
		
		System.out.println(3.14159* yaricap*yaricap);
		
		System.out.println(2*3.14159*yaricap);
		
		


	}

}
