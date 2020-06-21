package day03operators;

public class Operators01 {

	public static void main(String[] args) {
		
		/*
		   1 parantez ici islmeler yapilir 
		   2 carpma ve bolmeler yapiir carpma ve bolmeden soldaki once yapilir
		   3 toplama ve  cikrma yapilir
		 
		 */
		
		int i1= 12;
		int i2= 13;
		int i3= 14;
		int i4= 15;
		
		
		System.out.println(i1+  i2*i3); // java once carpmayi yapcaak 13*14= 182 sonra 182+12= 194
		
		System.out.println(i1* i2 + i3* i4);// 12* 13= 156 sonra 14* 15= 210 sonra bunalri taoplayacak 156+210= 366
		
		System.out.println((i1+i2)/i4);// 12+13=25/15= 1.66 ama int oldugu icin 1 verecek
		System.out.println(i4* (i2+i1/3));// 255 
		
		

	}

}
