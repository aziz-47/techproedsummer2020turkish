package day02wrapperclasses;

import java.util.Scanner;

public class Scanner08 {

	public static void main(String[] args) {
		
		//Mil’i kilometreye çeviren bir program yazýnýz. (double kullanýnýz) Not 1: km = mile x 1.6
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Lutfen mili kilometreye ceviriniz");
		
		double sayi = scan.nextDouble();
		
		System.out.println(sayi*1.6);
	}

}
