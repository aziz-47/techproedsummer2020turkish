package day18statickeyword;

public class ThisKeyword {
	
	int x = 12;
	static int y= 13;
	
	ThisKeyword(int x){
		// this kullandigim zman icinde bulundugum clastaki instance veya static veriablelere ulasmak istiyorum demektir.
		
		// this() icinde bulundugunuz clastaki parametresiz construtoru cagirmak icin kullnilir.
		// this(ali) icinde bulunudgumuz calastaki string parametreli constructoru cagirmak icin kullanilir
		//
		// this() kullanicaksa mutlaka ilk satira yazilmalidird. aksi taktirde compile tie eror verir.
		this();
		this.x= x;
		System.out.println("parametreli constructor");
		
	}
	
	
	ThisKeyword(){
		System.out.println("paramaetresiz constructor");
	}
	
	ThisKeyword(String str){
		System.out.println(" String paramaetreli  constructor");
	}
	
	

	public static void main(String[] args) {
		
		ThisKeyword obj1= new ThisKeyword(15);
		System.out.println(obj1.x);//15
		
		
		
	}

}
