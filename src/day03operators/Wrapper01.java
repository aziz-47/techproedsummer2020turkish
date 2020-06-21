package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		 // Kullanocan ad ve soyad alip ekrana yazdiran bir progam yaziniz
		// (strin kullaniniz)
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
		
		String isim= scan.nextLine();// ya sadece next kullanilir vey nextLine kullanlir
		// next() tek kelimelik Stringler iin kullanilir
		// SPACE GORUNCE STRINGI ALAMYI BIRAKIR
		//nextLine() girilien tum Stringi alamak icin kullanilir
		
		
		System.out.println(isim);

	}

}
