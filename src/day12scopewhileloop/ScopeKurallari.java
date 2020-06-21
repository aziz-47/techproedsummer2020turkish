package day12scopewhileloop;

public class ScopeKurallari {
	  int num; // Class veriable veya inctance veriable denir

	public static void main(String[] args) {
		// // Scope kapsam demektir. Olusturdugunuz bir variable'i nerelerde kullanabileceginiz
		// gosterir.
		
		
	}
	
	public void toplama() {
		int num1=12;
		System.out.println("Toplama");
		
		
	}
	
	
	public void carpma(int num, String str, char ch) {
		int num2;
		num2 =3;
		System.out.println("Carpma");
		
	}
	
	
}

   //1. KURAL:Clasin icnde methodlarin diisinda olan variableleri butun methodlar istediklerizamanisteikleri
   //kadar kullanabilerler. bu variabalere "Class veriable veya Instance veriable denir.
   //Class veriablerelere deger atamasi yapmazsak java onlara DEFault degerler (java kafasina gore deger veriri)
   //verir.java tum sayialr icin default olarak sifir  degerini verir.

   //2. KUral: bir methodyn bodysi icinde olusturkan variablerli sadece o methotun icinde kullanabilabilr.
   //o methodun disindaki methotlar o veriableyi kullanamazlar.
   // methodun icinde olusturulan bu veriablelere"Local Veriable" denir
   // Body icinde olusturulan verablerelere degr atmasi yapmak zorundayiz.java onlara default value vermez.

  //3. KURAL: Methodlarin parantezleri icinde olusturlan veriablerlri locak veriable gibi sadece o methodlarin 
  // bodysi icinde kullanilabilir. bu veriablerlere de locak veriable denir. parantez icinde oluturulan veriablere
  // deger atamasi yapmayiniz

  //4.KURAL: bir veriableyi kullanmadan once o veribaleyi tanimlamaliyiz
  // once num= num+2 sonra int num= 12 diyemeyiz
  // once int num=12; sonra num = num+ 2 demeliyiz




