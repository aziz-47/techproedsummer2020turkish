package day02wrapperclasses;

import java.util.Scanner;

public class Scanner09 {

	public static void main(String[] args) {
		
		//Saati saniyeye çeviren bir program yazýnýz. (long kullanýnýz) Not 1: Saniye = Saat x 60 x 60
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen saati saniyeye ceviriniz");
		
		long sayi= scan.nextLong();
		
		System.out.println(sayi*60*60);
	}

}
