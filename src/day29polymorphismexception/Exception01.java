package day29polymorphismexception;

public class Exception01 {

	public static void main(String[] args) {
		// 	// Exception: Istisnai hata
		// Temelde kac tur exception var?
		// Temelde iki tur exception var; 1) Compile Time Exception (Checked)
		//                                2) Run Time Exception
		// Compile Time Exception'a ornek verebilir misiniz?
		// Tabii ki; 1)FileNotFoundException ==> Dosya bulunamadigi zaman ortaya cikar
		//           2)IOException(Input Output Exception) Input veya Output yapilirken olusan problem-
		//           lerde ortaya cikar.
		// Not: FileNotFoundException, IOException'in child'idir.
		// Not: Compile Time Exception'lar mutlaka Handle edilmelidir (Halledilmelidir)
		// Checked Exception'lar iki turlu handle edilir:
		//         1) Method isminden sonra "throws" keyword kullanilir
		//         2) try-catch block kullanilir. try-catch block kullanmak daha iyidir; cunku readable'dir.
		
		//  zehra hanim
		  //***************Checked exceptionlar nasýl handle edilir?**********
				// iki türlü yapýyoruz:
				// 1*) throws yazmak: javaya: "problem varsa yardým iste demektir."
				// 2-)try-catch blocks. try: dene, catch= yakala demketir.
				// 3-) dene- hata cýkarsa -yakala-yapamazsan-bana mesaj at. readable dýr.
				//aradaki fark: try catch önce dener. olmazsa mesaj atar.
				//ama throw da hazýr mesajlarý ekrana atar problem hakkýnda.
				//try da ayrýntý ve hatanýn yerini özetleyen bir mesaj yazabilirz. bu yüzden readable dir


	}

}
