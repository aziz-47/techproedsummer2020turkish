package day11stringmethods;

public class ForLoop01 {

	public static void main(String[] args) {
		// 6, 5, 4 , 3 ve 2 yui ekrana yazdiran bir foor loop olusturun
		
		for(int i =6 ; i>-2 ; i--) {
			System.out.println(i);
		}
		
		
		//3,4 ,5,6 ,7 sayialrini ekrana yazdirna
		// baslangic kucuk bitis degeri buyuk ise i++ aksi duurmda i-- kullanin
		
		for(int i= 3; i<8 ; i++) {
			System.out.println(i);
		}
		
		
		//ilk 100 sayma sayisni ekrana yanayana yazdrina ve aralarina bosluk koyan
		//for loop programini kullanarak yaznaiz
		
		for(int i= 1; i<101; i++)
			System.out.print(" "+ i);
		
		System.out.println();
		
		// ilk saym sayisni 100 den 1 kadar ekrana yanyana yazdidran ve aralarna bosluk koyan programi yazniz
		
		for(int i=100; i>0; i--) {
			System.out.print(i + " ");
			
			
		}
		
		System.out.println();
		
		//ilk 50 cift sayma sayisini ekrana yazdiran for loop olusturun
		//
		
		for(int i = 2; i<101; i=i+2) {
			System.out.print(i+ " ");
		}
		
		
		//ilk 50 tek sayma sayisini ekrana yazdiran for loop
		//1,3 ,5, 7,.....99
		System.out.println();
		for( int i=1; i<100; i=i+2) {
			System.out.print(i + " ");
		}
			
		
		
		
		
		
		
		
		
		
		
		

	}

}
