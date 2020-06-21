package day13whiledowhileloops;

public class WhileLoop03 {

	public static void main(String[] args) {
		// 3 un carpim tabosunu ekran ayazdirna programi yaziniz
		//3*1=3, 3*2=6.......3*10=30
		
		System.out.println("for loop ile couzm");
		for( int i= 1; i<11; i++) {
			System.out.println("3*" + i +" =" + (3*i));
		}
		
		System.out.println("while loop ile couzmu");
		int num= 1;
		while(num<11) {
			System.out.println("3*" + num +" =" + (3*num));
			num++;
			
		}

	}

}
