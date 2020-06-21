package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// ["Ali", "Can", "Ayse", "Ali"]
		
		List<String>list02= new ArrayList<>();
		
		list02.add("Ali");
		list02.add("Can");
		list02.add("Ayse");
		list02.add("Ali");
		System.out.println(list02);
		
		list02.remove("Ali");
		System.out.println(list02);
		
		list02.remove("Ali");// birden fazal ayni elamn varsa ilkini siler
		System.out.println(list02);
		
		list02.remove("kemal");/// remove() methodu listede olmayan elman elamnlkar icin hatta vermez.cunku silcek elamn yok
		// remoibve methodu sayi olarak yazarsaniz index olarak alir ve listede yoksa exeption hata verir
		System.out.println(list02);
		
		
		System.out.println(list02.remove("Ali"));//true
		System.out.println(list02.remove("Kemal"));//false
		
		System.out.println(list02.remove(0));// bu can elemnaii siler ve ekrana silinen elamni yazar
		
		
		// Ayse elemaninini "Aysegul" yapin bunun icin set() methodu kullanilir
		System.out.println(list02.set(0, "Aysegul"));// ayse yeni degisimden onceki hali ekrana yazdririr
		
		System.out.println(list02);
		
		
		// liste "kenan" ve zeynep" ekelyin
		
		list02.add("Kenan");
		System.out.println(list02);
		list02.add("Zeynep");
		System.out.println(list02);
		list02.clear();
		System.out.println(list02.isEmpty());//true
		System.out.println(list02);
		
		
		

	}

}
