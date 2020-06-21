package day32abstraction;

public interface Interface01 {
	
	// onterface icine concrete metod yazarsanzi copile time error aliriniz
		//interface de method olsuturuken kesinlile body yazmayin
		//interface deki methodlar kesinlile abstarct olamslidir 
		//interface deki  abstract methodlari uretirken abstarct keyword kulansainz da olur kullanmasaniz da our. vunku interface kedni icine yazilan 
		// methodlari otomatik olarak abstract olarak kabul eder
		public void add();
		
		// interface de variablelelr mutlaka public static fianl olmali ve mutlaka initalize(deger atanalai) edilemlidir.
		// variable olusturlurken public static final keyworleri kullansada olur kullanmasada olur 
		//public static final keyworleri kullanildiginda da kullanilmadaginda da variable public stsatic ve finaldir.
		public static final int a=12;
		int b= 11;
		public int c= 12;
		final int d= 14;
		static int e= 18;
	
	
	
}
