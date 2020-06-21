package day13whiledowhileloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		//while loop kullanarak ilk 5 sayma sayisni toplamnini ekrana yazdrian programi yazniniz
		
		int sum=0;
		int num= 1;
		while(num<6) {
			sum= sum+num;
			num++;
		}
		System.out.println(sum + " ");
		// en son toplami gormek icin loop disina yazin
		//her adimdaki toplami gormek icin loopun icine yazin
		
	}
	

}
