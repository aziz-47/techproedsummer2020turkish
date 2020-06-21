package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		// Kullanicidan sinav notunu tam sayi oalrak girmesini  isteyin
		// negatif girerse ekrana yalisn deger girdiniz desin
		//  0 dan buyk ve esit 50 den kucuk girerse ekrana kaldiniz yadrin
		//50 den buyuk ve esit 80 den kucuk ise ekrana gectiniz yazdirin
		// 80 den byuyuk ve esit  100 den kucuk ise ekrana tebrikler yazdriin
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Sinavv notunu isteyiniz");
		
		int not= scan.nextInt();
		
		if(not<0) {
			System.out.println("Negatif deger giremezsinzi");
		}else if(not<=50) {
			System.out.println("Kaldiniz");
		}else if( not<=80) {
			System.out.println("Gectiniz");
		}else if(not<=100){
			System.out.println("Tebrikler");
			
			
		} else {
			System.out.println("100 den buyk deger gireemzsinz");
		}
			
		
	
	}

}
