package day27constructorcagirma;

public class Mammal extends Animal {
	
	public boolean dogum = true;

	public static void main(String[] args) {
		
		//Mammal mammal = new  Mammal();
		Mammal mammel01 = new Mammal(15);

	}
	
	public void feed() {
		System.out.println("Cocuklarini besler");
	}
	
	Mammal(){
		this(11);// parent taki parametresiz constructiri cagir demektir
		        // super keywordunu kullanmasanzi da olur ama bazilari kullnair sasirmayin.
		        // super() kullanilacaksa mutlaka ilk satirda olmalidir.
		        // super () ve this() ayni consturucorun icinde ayni anda kullanilamz
		        // cunku; ikisininde ilk satirda olma zorunlulugu var.
		System.out.println("Mammal parametresiz constructor");
	}
	
	public Mammal(int age) {
		super();
		System.out.println("Mammal parametreli consturctor ");
	}
	
   

}