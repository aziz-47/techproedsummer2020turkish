package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// equals() methodu iki listin birbirne esit olup olmadigini kontrol eder
		//listler esit ise true degilse false return eder
		//EQUALS METHODU AYNI INDEXDE AYNI elemanin olup olmadgini kontrol eder
		// EQUALS METhodu objelerin refereanslarina bakmaz 
		// equals methodundan true alabilmek icin listler birbirnin fotokopisi gibi olmalidir
		
		List<String> list1= new ArrayList<>();
		List<String> list2= new ArrayList<>();
		
		list1.equals(list2);
		System.out.println(list1.equals(list2));//true

		
		list1.add("A");
		list1.add("B");
		System.out.println(list1.equals(list2));//false cunku biri bos digerinde A ve  B var
		
		list2.add("B");
		list2.add("A");
		System.out.println(list1.equals(list2));//false cunku elemanlarin siralari ayni degil


	}

}
