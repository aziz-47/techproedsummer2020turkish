package day01variables;

public class Variable02 {

	public static void main(String[] args) {
	    
		char harf1 ='a'; // a nin degeri 97
		char harf2 = 'b'; // b nin degeri 98
		System.out.println(harf1+harf2); //Syso ==> ctrl+ space diyoruz cevap 195
		System.out.println(harf1); // a
		System.out.println(harf2); // b
		
		
		// ab yazmak icin asagidaki yontem kullanilabilir
		System.out.print(harf1);
		System.out.println(harf2);
		
		// bir charin sayi degeri askii tablosu kullanmadan nasil bulunur
		// data taypi int olan bi variable olustur ve chari bu varibale ye ata
		int  aCharDeger = 'a';
		System.out.println(aCharDeger );  // 97
		

		// '!', '%', ' *' sembollerinin ascii degerlerini bulunuz
		
		int unlemCharDegeri ='!';
		System.out.println(unlemCharDegeri); //33
		
		int yuzdeCharDeger='%';
		System.out.println(yuzdeCharDeger);//37
		
		int asteriksCharDeger='*';
		System.out.println(asteriksCharDeger);//42
				
		
		

	}

}
