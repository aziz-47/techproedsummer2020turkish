package day35collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		//LinkedListde head haric her eleman icin bir data birde pointer var. head de sadece pointer var
		//her elemanin pointeri bir sonraki elemani gosterir, son elemanin pointeri Null gosteririr
		//Data ve pointer iceren her elmanin diger adi "Node" dur
		//Linkedlist eleman ekleme ve cikara durumalrinda basariliridir.
		//
		//
		
		
		
		
		// Link list objesini olusturunuz
		LinkedList<String>linkList=new LinkedList<>();
		linkList.add("Mark");
		linkList.add("Amanda");
		linkList.add("Jhon");
		linkList.add("Ann");
		linkList.add("Pamela");
		System.out.println(linkList);//[Mark, Ammanda, Jhon,Ann, Pamela]
		
		linkList.remove(2);//remeove() methodu indexe gore eleman siler
		System.out.println(linkList);
		
		linkList.removeFirst();//
		System.out.println(linkList);
		
		linkList.removeLast();//
		System.out.println(linkList);
		
		linkList.add(1, "Ali");
		System.out.println(linkList);
		
		linkList.addFirst("Kemal");
		System.out.println(linkList);
		
		linkList.addLast("Zeynep");
		System.out.println(linkList);
		
		linkList.set(1, "Ajanda");
		System.out.println(linkList);
		
		
		LinkedList<String>linkList2= new LinkedList<>();
		linkList2.add("X");
		linkList2.add("Y");
		
		linkList2.addAll(linkList);
		System.out.println(linkList2);
		
		linkList.addAll(3, linkList2 );
		System.out.println(linkList);
		
		
		
		System.out.println(linkList2.contains("Can"));
		System.out.println(linkList2.contains("Ali"));
		
		linkList2.clear();// clear() methodu listin elemanlrini siler bize bos bir list kalir.
		System.out.println(linkList2);//[]
		

	}

}
