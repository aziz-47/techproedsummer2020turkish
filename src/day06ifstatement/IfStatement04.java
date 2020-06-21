package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {
		//Bir tane strin veriable olsuturun ve bir gun ismini kucuk harflerlel degr olarak atayin
		//Eger atadiginiz gun hafta icin gunlerinden briri ise
		//ekrana "Hafta ici " yazdirin.
		// eger atadiginiz deger hafta sonu ise 
		// ekrana " Hafta sinu" yazdirin
		// hafta ici: pazartesi sali carsamba persembe cuma hafta sonu cymartesi pazar
		
		
		String day= "pazar";
		
		if(day.equals("pazartesi") || day.equals("sali") || day.equals("carsamba")  ||day.equals("persembe" ) || day.equals("cuma") ) {
			System.out.println("Hafta ici");
			
		}
		
		if(day.equals("pazar" )|| day.equals("cumartsei")) {
			System.out.println("Hafta sonu");
		}
		
		
		

	}

}
