package day19arrays;

public class OdevSorusu06 {

	public static void main(String[] args) {
		// Bir array�de herhangi iki eleman�n ayn� olup olmad���n� kontrol 
		//eden bir program yaz�n�z.Ayn� eleman varsa �Ayn� eleman var� yoksa  �Ayn� eleman yok� yazd�r�n�z.
		 
		int arr[] = {1, 2, 3, 4 ,5, 6,7, 3,4};
			
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					
				}
			}
			
		}
		
		if(count>0) {
			System.out.println(count + " Ayni eleman var");
		}else {
			System.out.println("Ayni eleman yok");
		}
			
	}

}
