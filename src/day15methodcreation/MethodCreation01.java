package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		
		
		toplama();
		carpma();
		
		
	}
	//Bir methodu main methodun icinden cagirmak icin mutlaka static kelimesini kullanmalisiniz.
		public static void toplama() {
			System.out.println(3+5);
		}
		
		public static void carpma(){
			System.out.println(3*5);
		}

	
	

}
