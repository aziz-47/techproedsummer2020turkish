package day09switchoperator;

import java.util.Scanner;

public class ArtikYilTernaryInterview {

	public static void main(String[] args) {
		//Kullan�c�dan bir y�l girmesini isteyin, y�l art�k y�l ise ekrana �Art�k y�l� degilse 
		//ekrana �Art�k y�l degil� yazdirin
		
		 Scanner scan = new Scanner (System.in);
		 System.out.println("Yil girniz");
		  int year= scan.nextInt();
		  
		  
	String result=	  (year%100==0) ? ((year%400==0) ? "Artik yil" : "artik yil degildir") :
		(year%4==0 ? "artik yil" : "artik yil degil");
	System.out.println(result);
	
	scan.close();
		

	}

}
