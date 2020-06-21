package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		// Kullnicinin girdgi sayi icin carpim tablosnu ekrna yazdirin
		Scanner scan= new Scanner (System.in);
		System.out.println("carpim tablosunu gorek icin bir sayi giriniz");
		int num= scan.nextInt();
		
		System.out.println("for loop ile coum");
		for( int i= 1; i<11; i++) {
			System.out.println(num + "x"+ i + "=" + (num*i));
		}
		
		
		
		System.out.println("while ile couzm");
		int num1= 1;
		while(num1<11) {
			System.out.println(num + "x"+ num1 + "=" + (num*num1));
			num1++;
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
