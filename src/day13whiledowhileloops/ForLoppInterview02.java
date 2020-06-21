package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoppInterview02 {

	public static void main(String[] args) {
		// //Kulanicidan bir string alin ve bu strungi ekrana tersten yazdirin
		// while loop kullanin
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Bir cumle veya kelime giriniz");
		String str= scan.nextLine();
		
		
		int lenght= str.length()-1;
		
		while(lenght>=0) {
			System.out.print(str.charAt(lenght));
			lenght--;
		}
		
		scan.close();
		
		
		
		
		
		
	}

}
