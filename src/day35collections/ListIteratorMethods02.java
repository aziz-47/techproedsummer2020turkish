package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {
		// Elemanlri A, B, VE C olan bir list olustrunuz 
		//list iteratir kullanarak bu elemanlri AW,BW,CW ye donustrunuz
		
		
		List<String> list= new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		ListIterator<String>lit = list.listIterator();
		
		//
		while(lit.hasNext()) {
			Object element= lit.next();
			lit.set(element + "W");
		}
		System.out.println(list);//AW, BW, CW
		
		lit.add("Kemal");
		lit.add("Can");
		
		System.out.println(list);
		
		

	}

}
