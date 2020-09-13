package day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class L03 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Ali");
		list.add("Mark");
		
		//List elemanalrini tekrarli olanalri 1 kere yazmak sartiyla ekrana  alfabetik sirali olarak ayzniz
		
		list.
			stream().
			distinct().
			sorted().
			forEach(System.out::println);
		
		System.out.println("=========");
		
		//List elemanalrini tekrarli olanalri 1 kere yazmak sartiyla ekrana  elemanlri uzunlukalrina gore 
		//siralayarak yaazdirinizi
		
		list.stream().distinct().sorted(Comparator.comparing(t->t.length())).forEach(System.out::println);
		
		
		//List elemanalrini tekrarli olanalri 1 kere yazmak sartiyla ekrana  elemanlri son harflerine 
		// gore alfabetik siraya koyunuz
		
		list.
			stream().
			distinct().
			sorted(Comparator.comparing(t->t.substring(t.length()-1))).
			forEach(System.out::println);
		
		
		System.out.println("======");
		
		//List elemanlarindan tekrarli olanlari 1 kere yazmak sartiyla ekrana 
				//alfabetik siraya gore ters olarak yazdiriniz
		list.
		   stream().
		   distinct().
		   sorted(Comparator.reverseOrder()).
		   forEach(System.out::println);
			
		
	}

}