package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		// kullanici karenuin bi kenar uzunlugu versin 
		//karenin cevrsi ve alani ekrana yazdrilaim
		//karenin cevrsi a+a+a+a alani a*a 
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz");
		
		int kenarUzunlugu= scan.nextInt();
		
		 System.out.println(kenarUzunlugu+ kenarUzunlugu+ kenarUzunlugu+ kenarUzunlugu);//40
		 System.out.println( kenarUzunlugu* kenarUzunlugu );//100
		
		

	}

}
