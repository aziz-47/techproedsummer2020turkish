package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		 
		// Kullanicidan yasini alin
		//yas 13 den az ise calsimaz ekrana calisamz yazdirin
		//yas 13 den 65 ekadar ise  calisabilir yazdirin
		// yas 65 ten buyukse ekrana emekli yazdirin
		// Negatif sayi girerse " yas negatif olmaz"
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Yasinizi giriniz");
		
		int yas= scan.nextInt();
		
				
		if(yas<0) {
			System.out.println("Yas negatif olamaz");
		}
		
		else if(yas<13) {
			System.out.println("Calisamaz");
		}else if(yas<=65) {
			System.out.println("Calisabilir");
		}else {
			System.out.println("Emekli");
		}
	}

}
