package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// Arraylerde lenght sabittir, degistirlmez
		// ArraysList lerde (list) lenght esnektir. siz elelman ekledikce list lenghtini artirir
		// siz eleman sildikce list lenghtini azaltir
		
		
        
		// List<String> list01=new List<>(); ==> olmaz 
		//ArrayList<String> list01=new List<>();==> olmaz 
		//ArrayList<String> list01=new ArrayList<>();==> olabilir ama asagidaki daha cok kulanilir
		//List<String> list01 = new ArrayList<String>();==> bu da olur ama 
      //asagidaki daha cok kullanilir	
		List<String> list01=new ArrayList<>();
		System.out.println(list01);
		
		// liste eleman eklemek icin add() methodu kullanilir.
		list01.add("Ali");
		System.out.println(list01);//Ali
		
		list01.add("Can");
		System.out.println(list01);// once ekleneni one kayoar
		
		// veliyi Ali ile can arasina koylaim
		
		list01.add(1, "Veli");// ALi VELI CAN
		System.out.println(list01);
		
		
		//[Han, Ali , Kemal, Veli, Can Ayse]
		
		list01.add(0, "Han");
		System.out.println(list01);
		
		list01.add(2, "Kemal");
		System.out.println(list01);
		
	    list01.add("Ayse");
	    System.out.println(list01);
	    
	    
	   // list01 in eleman saysisini ekrana yazdiriniz
	    
	    // list01nin eleman sayisini ekrana yazdrimak icin size() methodu kullanilir.
	    System.out.println("Eleman saysi" + list01.size());//6
		
		
	}

}
