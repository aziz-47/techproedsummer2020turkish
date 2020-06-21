package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		// ['A', 'C', 'B', 'C'] LISTESINI OLUSTURUN
		
		List<String>list= new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		// list de eleman olarak B var mi ? 
		System.out.println(list.contains("B"));// eger B eleman olarak varsa true yoksa false return eder
		
		System.out.println(list.contains("Z"));// FALSE
		
		//listeki elelamnalri alfabetik siraya koyunuz
	   // colection ==>bir araya getirilmis parcalar.
		
	    // BIR LISTEKI elemanlari alfabetik siraya (Natural order) dizmek icin 
		//collection.sort() methodu kullanilir. argument  olarak listin adini kullaniniz
		Collections.sort(list);
		System.out.println(list);// [ A B C C]
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
