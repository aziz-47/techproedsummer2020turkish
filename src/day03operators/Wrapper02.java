package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		
		// kullanicadan ilk ismini alin , ekrana yazdirin
		// kullanicadan son soyismini alin ekrana ilksinin altina yazdirin
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen ilk isminizi giriniz");
		
		String ilkIsim= scan. nextLine();
		System.out.println(ilkIsim);
		
		
		System.out.println("Soy isminizi giriniz");
		String soyIsim= scan.nextLine();
		
		System.out.println(ilkIsim);
		System.out.println(soyIsim);
	}

}
