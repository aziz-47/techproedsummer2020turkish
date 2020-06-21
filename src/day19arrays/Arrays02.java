package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		//4 elemanli char bir array olusturun bu arryaye elemanlar yerlestirin 
		// yum elemanalri for dongusu kullanarak ekrana yazdirn
		
		
		char arr1[] = new char[4];
		
		arr1[0]= 'A';
		arr1[1]= 'D';
		arr1[2]='E';
		arr1[3]= 'M';
		
		for(int i=0; i<4; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println(arr1[3]);
		
		// Arrayin lenghti bulmak icin arrayin ismi arr1.lenght yazmak yeterlidir
		// stringlerde de lenhgt metodu kullanilir ama stringlerde kulanilan lenght methodu parantezlidir . yani stringlerde 
		//==> lenght() Arraylarde ==> lenght var 
		System.out.println(arr1.length);//4
		
		
		
		// Arraydeki son elemani bulmak icin lenght kullaniniz
		System.out.println(arr1[arr1.length-1]);//M
		
		
		
		
		

	}

}
