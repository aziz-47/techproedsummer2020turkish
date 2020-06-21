package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		// TreeSet:         1) HashSet ile hemen hemen aynidir. Duplication'a musaade etmez
				//             key-value yapisi kullanir.
				//          2) HashSet ile farki; TreeSet elemanlarini natural order'a gore dizer.
				//             HashSet ise, rastgele elemanlari dizer
				//          3) HashSet ile farki; HashSet daha hizlidir.
				//          4) Natural Order'a sahip bir Set lazim oldugunda HashSet olusturulur,
				//             elemanlar eklenir sonra bu HashSet TreeSet'e donusturulur 
				//             boylelikle TreeSet'in hiz problemi halledilir. 
				//             Natural Order'a sahip bir Set lazim oldugunda direkt TreeSet 
				//             olusturma genellikle kullanilmaz

		
		TreeSet<String>tSet = new TreeSet<>();
		tSet.add("ABC");
		tSet.add("String");
		tSet.add("Tast");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");
		System.out.println(tSet);//[ABC, Ink, Jack, Pen, String, Taet]
		
		
		//HashSet olusturup javanin elelmanalri hizli eklemsini sagalriz 
		HashSet<String> hSet1= new HashSet<>();
		hSet1.add("ABC");
		hSet1.add("String");
		hSet1.add("Tast");
		hSet1.add("Pen");
		hSet1.add("Ink");
		hSet1.add("Jack");
		System.out.println(hSet1);
		
		// olusturdgumuz heshseti TreeSet constratoruna parametre olarak koyup 
		//TreeSet e ceviriiiz, boylelikle TreeSet in 
		//elemanlari natural order yapma ozlleiginden istifade etmis oluruz 
		TreeSet<String>tSet1 = new TreeSet<>(hSet1);
		System.out.println(tSet1);
		

	}

}
