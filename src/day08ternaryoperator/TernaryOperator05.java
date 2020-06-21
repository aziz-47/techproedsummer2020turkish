package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
		// Kullanicidan bir character girmeini isteyiniz
		//charcter harf ise kucuk harf olup olmadigni kontrol ediniz
		//kucuk harf ise ekrana "kucuk harf yazdiriniz"
		// buyuk harf ise ekrana buyuk harf yazdirniniz
		// harf egilse erkrna harf degildir yazdiniz
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Bir harf griniz");
		 char harf= scan.next().charAt(0);
		 
		 
		 String sonuc= ((harf>=97 && harf<=122 ) || (harf>=65 && harf<=90)) ? 
				 ((harf>=97 && harf<=122) ?"kucuk harf" : "buyuk harf") : "harf degildir" ;
		 
		 System.out.println(sonuc);
		 
		 scan.close();

	}

}
