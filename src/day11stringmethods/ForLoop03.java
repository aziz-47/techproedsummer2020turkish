package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		// ilk 4 sayma sayisnin carpimini veren for loop olusturunuz
		//1,,3,4, 1*2*3*4=24 
		
		int product=1;
		for(int i= 1; i<5; i++) {
			product= product*i;
		}
		System.out.println(product);
		
		System.out.println();
		// ilk 10 cift sayma sayisnin carpimini veren for loop olustuburubz
		//2,4,6,8,10,12,
		
		int prod=1;
		for(int i=2; i<13; i+=2) {
			prod=prod*i;
		}
		System.out.println(prod);
		
		
		// matematikde 1 e r 1 er geri sayim yapip carpmaya faktoriyel denir
		//6!= 6 *5 *4 *3 *2 *1 
		//interviviwde sorarlar
		
		System.out.println();
		// 9! li hesaplayan programi for loop kullanarak yaziniz
		
		int prod2= 1;
		for(int i=9; i>0; i--) {
			prod2=prod2*i;
		}
		System.out.println(prod2);

		
		
		

	}

}
