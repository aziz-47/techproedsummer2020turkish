package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {
		//Eleanalri A, B ve C stringleri olan bir list olustrunuz.
		
		List<String> list= new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		
		//list iterator olustunuz ve list elelmnalini consolo yazdiriniz.
		ListIterator<String>listIterator= list.listIterator();
		while(listIterator.hasNext()) {
			Object element=  listIterator.next();
			System.out.print(element + " ");
		}
		
		
		System.out.println();
		
		//hasPrevious VE previous() methodalrini kullanrak bir lsitin elemanalrini tersten yazdirmak istersek mutlaka once hasNex() ve next()
		// kullanmaniz lazim.
		while (listIterator.hasPrevious()) {
			Object element= listIterator.previous();
			System.out.print(element + " ");
			
		}

	}

}
