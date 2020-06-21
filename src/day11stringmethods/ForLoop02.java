package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		// 100 den kucuk 3 un kati olan sayma sayialrini for loop kullnarak ekrna yan yan yazdiriniz
		
		//3,6,9....99
		
		for(int i= 3; i<100; i+=3) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//ilk 5 sayma sayisnin toplamini veren programi for loop ile yaziniz
		//int sum=0 0+1=1 ==>1+2=3==> 3+3=6==> 6+4=10==> 10+5=15
		
		int sum=0;
		for(int i=1; i<6; i++) {
			sum=sum+i;
		}
		System.out.println("Toplam: " + sum);//sadece en son adimi ekranda goremk isterseniz yzdirma
		                                     // islemini for loop un disinda yapiniz
		
		//10 dan buyuk ilk 3 sayma sayisni toplamni verenfor loop yaziniz
		//11,12,13
		System.out.println();
		int sum1=0;// toplam denildginde bunum mutlaka yazmazliyiz
		for(int i=11; i<14 ; i++) {
			sum1=sum1 + i;
		}
		System.out.println("Toplam : " + sum1);
		
	
		// 20 den buyuk ilk 5 sayma sayinin toplamini veren for loop yaziniz
		
		int sum2= 0;
		
		for(int i= 21; i<26; i++) {
			sum2=sum2+i;
		}
			System.out.println("Toplam: " + sum2);
			System.out.println();
		// Ilk 50 sayma sayisnin toplamini vereen for loop olustuuz
			
			int sum3=0;
			for(int i= 1; i<51 ; i++) {
				sum3= sum3+i;
			}
			System.out.println("Toplam: "+ sum3);//1275
			
			// 5 ile bolunebilen 100 den kucuk sayma sayilarinin tolamni veren for loop olusturuz
			
			int sum4=0;
			for(int i= 5; i<100; i+=5) {
				sum4= sum4+i;
			}
			System.out.println("Toplam:" + sum4);
		

	}
	
	

}
