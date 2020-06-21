package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		byte by1 = 101;
		int sayi1= by1;// kucuk data tpii buyuk data tipine cevirmek icin ekstra bir kod yazmaya 
		             //gerek yok java bunu otomatik olarak yapar.( auto widenining)
		
		System.out.println(sayi1);
		
		int sayi2= 53;
		byte by2= (byte) sayi2;// buyuk data tipini kucuk data tipine cevirmek java tarafindan yapilamz 
		                      // orenkteki gibi sag tarafa donusturmke istedgimiz data tipini
		                      //parantez icinde yazmaliyiz
		
		System.out.println(by2);
		
		double sayi3= 23.5; 
		int by3= (int) sayi3;
		System.out.println(by3);
		
		
		float sayi4= -23.9f;
		short by4 =  (short) sayi4;
		System.out.println(by4);
		
		
		double sayi5= 4.8;
		double sayi6= 1.4;
		double sonuc1= sayi5/ sayi6;
		System.out.println(sonuc1);//3.428571428571429
		
		int sonuc2= (int) (sayi5/sayi6);
		System.out.println(sonuc2);// 3
		
		int sayi7= 5;
		int sayi8= 3;
		
		int sonuc3= sayi7/sayi8;
		System.out.println(sonuc3);// normlade 5/3 =1.6666666 ama data tipini int yaoarsak
		                           // sadece tam ksimi 1 gorurusunuz 1
		
		
		int sayi9= 255;
		byte by5= (byte) sayi9;
		System.out.println(by5);// normlade 255 cikmasi lazim. normalde byte da 256 tane sayi var 
		                        //(-128 den baslayip 127 ekadar) 255 koyunca 
		                       // 1 tane eksik o yuzden -1 cikiyor ekranda
		                        // 255 i 256 a boler kalani yazar
		
		
		
		
		
		
				
			
		

	}

}
