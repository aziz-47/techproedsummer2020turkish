package day09switchoperator;

import java.util.Scanner;

public class ArtikYilTernaryInterview {

	public static void main(String[] args) {
		//Kullanýcýdan bir yýl girmesini isteyin, yýl artýk yýl ise ekrana “Artýk yýl” degilse 
		//ekrana “Artýk yýl degil” yazdirin
		
		 Scanner scan = new Scanner (System.in);
		 System.out.println("Yil girniz");
		  int year= scan.nextInt();
		  
		  
	String result=	  (year%100==0) ? ((year%400==0) ? "Artik yil" : "artik yil degildir") :
		(year%4==0 ? "artik yil" : "artik yil degil");
	System.out.println(result);
	
	scan.close();
		

	}

}
