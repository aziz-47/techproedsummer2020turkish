package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview01 {

	public static void main(String[] args) {
		//Kulanicidan bir string alin ve bu strungi ekrana tersten yazdirin
		// foor loop kullanin
		Scanner scan= new Scanner (System.in);
		System.out.println("Bir cumle veya kelime  giriniz");
		
		
		String str= scan.nextLine();
		
		for(int i= str.length() -1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		scan.close();
		
		
		
		
		
		
	}

}
