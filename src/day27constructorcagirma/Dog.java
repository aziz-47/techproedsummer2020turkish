package day27constructorcagirma;

public class Dog  extends Mammal{
	
	public boolean sadik= true;
	

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		

	}
	public void  bark () {
		System.out.println("Kopekler havlar");
	}
	
	Dog (){
		super();// ister koyun ister koymayin istege bagli
		        // this() ayni classtaki icindeki parametresiz constructoru cagirmak icin kullanilir
		System.out.println("Dog parametrsiz constructor");
	}
	
	
	
	
		
}


