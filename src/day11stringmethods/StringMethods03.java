package day11stringmethods;

public class StringMethods03 {

	public static void main(String[] args) {
		//cocncat() methodu cancateanation yapmamnin iki stringi bilestirmenin diger diger yontemidir.
		
		String str1= "Ali";
		String str2= "Veli";
		System.out.println(str1+str2);// AliVeli
		System.out.println(str1.concat(str2));//AllVeli . str1+ str2 ile str1.concat(str2) aynidir
		
		
		System.out.println(str1.concat(str2).concat(str1));//AliVeliAli concat i istedginiz kadar pese pese 
		                                                   //pespese kullanabilirsiniz.
		
		System.out.println(str1.concat("==>").concat(str1));
		
		
		// replace () methodu var olan bir caharacterin butun gorunumlwrinin yerine baska caharcter yazmaya yarar.
		// ata==> ana ata yerine ana yazmak gibi
		
		//replace 1 versiyon
		String str3= "ata";
		System.out.println(str3.replace("t", "n"));// ekranda ana cikar
		System.out.println(str3.replace("a", "u"));//utu
		System.out.println(str3.replace("a", "o"));//oto 
		
		
		System.out.println(str3.replace("x", "y"));//ata x harfi olmadigi icin herhangi bi degisim yapmaz
		System.out.println(str3.replace("", "y"));//yaytyay
		System.out.println(str3.replace("", "/"));//==> //==>  /a/a/a
		System.out.println(str3.replace("t", ""));//==> aa yani t yi sileriz biz bu yontemi bir cahacteri stringten
		                                          // silmek icin kullaniriz
		System.out.println(str3.replace("a", ""));// t , butun a cahacterlenirni siler
		
		System.out.println(str3.replace("at", "Mustaf"));// mustafa
		System.out.println(str3.replace("at", "y"));//ya
		
		
		// replaceFirst() 2. versiyom  methodu degsitrmek istedgimiz caharacterin ilk gorunumunu degsitirir.
		String str4= "karakartal";
		System.out.println(str4.replaceFirst("k", "K"));//Karakartal
		System.out.println(str4.replaceFirst("a", "e"));//kerakartal
		System.out.println(str4.replaceFirst("ka", "KA"));//Arakartal
		System.out.println(str4.replaceFirst("kar", ""));//akartal
		System.out.println(str4.replaceFirst("kara", "A"));//Akartal
		System.out.println(str4.replaceFirst("karakartal", "cimbombom"));//cimbombom
		
		
		//Soru:
		String text= "Ali okula gitti.Ali otobuse bindi. Ali eve geldi. Ali yemek yedi. Ali uyudu.";
		System.out.println(text.replaceAll("Ali", "Veli"));// butun ali ler veli oldu
		
		
		//replaceAll() ve replace() methodlari tammaiyle ayni seyi yapar. replace methodunda isterseniz tek tirnak 
		//tek harfli caharterler icin tek tirnak kullanabilirsiniz.
		// fakat replaceALL() TEK TIRNAK DA KULLANILAMAZ
		
		
		
		
		
		
		
	}

}
