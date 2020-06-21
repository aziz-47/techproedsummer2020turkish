package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {
	
    // Checked Exceptionlari (Compile time exception) handle  etmek icin iki yol var
	//birincisi "throws" keywordunu kullanamk. bunu kullanirsanzi consolda teknik mesajlar gorurssunuz
	//.bu yuzden cok tercih edilmez
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream file =new FileInputStream("C:/ogrenci.text");

	}

}
  // ikinciisi try-cathc block kullanmaktir, bunu kullnairsaniz consolda teknik mesajlar yerine kendi yazdiginiz mesajalri gorurusunzu
// bu yuzden try-cathc kullanmak tercih edilir.
 class ExceptionTryCatch{
	 public static void main(String [] args) {
		 try {
			FileInputStream file =new FileInputStream("C:/ogrenci.text");
		} catch (FileNotFoundException e) {
			
			System.out.println("Dosyanin path i yalnsi veya dosya silinmis olabilir");
		}
	 }
 }
