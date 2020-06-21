package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {
		// substring () methodu bir stringin belli bir bolumunu kesip almak icin kullanilir.
		
		String str1="Java calisana kolaydir";
		
		
		//substring() methodu 1 . versiyoru
		System.out.println(str1.substring(5));// calisna kolaydir. 5 indeexi gosterir
		System.out.println(str1.substring(8));//isana kolaydir. index 8 dahildir(inclusive)
		System.out.println(str1.substring(22));//bosluk verir
		System.out.println(str1.substring(20));// index 23 yok ama ben olmayan bir yerden kesmek istiyorum.
		                                       // bu bir hatali istektir. java exception verir yani beni uyarir
		                                      //  hata yapiyosun diyor
		
		System.out.println(str1.substring(0));// stsr1.substring(0) = str1 oldugundan substring hic kullanilmaz
		                                      //
		
		//substring () methodu 2. versiyonu
		
		System.out.println(str1.substring(5, 13));// ilk index dahil ikinci index dahil degildir.
		                    // ilk indexi ekranda goruruz ikinci indexi ekranda gormeyiz
		                                           //calisana
		
		System.out.println(str1.substring(6,  12));//alisan
		System.out.println(str1.substring(6,  6));//ekranda hic birsey gorunmez.susbstring(6 6) kullanimlaz
		//System.out.println(str1.substring(7 , 6));//exeption verir. bu hatayi yapmayin. her zman ilk index 
		                                            //kucuk olmali veya esit olmali
                                                 
	}

}
