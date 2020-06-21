package day33interface;

public class LuxHonda extends Araba implements IcAraba, DisAraba {

	public static void main(String[] args) {
		LuxHonda luxHonda = new LuxHonda();
		luxHonda.benzin();
		luxHonda.direksiyon();
		luxHonda.kapi();
		luxHonda.klima();
		luxHonda.koltuk();
		luxHonda.move();
		System.out.println("IcAraba interfaceinden : " + IcAraba.price);//2000
		System.out.println("DisAraba interfaceinden: " + DisAraba.price);//3000
		System.out.println(old);// iki tane old isimli variable olmadihindn inteface adini kullanmaya gerek yok.
		luxHonda.doseme();

	}

	@Override
	public void move() {
		System.out.println("3 saniyede 100 klik hiza ulasir");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("gercek deri dirreksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("isitmali deri koltuk");
		
	}

	@Override
	public void klima() {
	     System.out.println("Digital klima ");
		
	}

	@Override
	public void kapi() {
		System.out.println("parmak izi ayarli kapi");
		
	}

}
