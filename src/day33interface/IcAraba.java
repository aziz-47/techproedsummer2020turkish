package day33interface;

public interface IcAraba {
	
	int price = 2000;
	boolean old= true;
	
	public abstract void direksiyon ();
	public void koltuk ();
    abstract void klima ();
    
    //Default keywordunu kullanirsak body eklemek zorudnayiz.Aksi taktirde compile tiem error aliriz.
    public default void doseme() {
    	System.out.println("Interface de dafult keywor ile dosme yaptim");
    }
    
    //Static keywordunu kullanirsak body eklemek zorudnayiz.Aksi taktirde compile tiem error aliriz
    public static void isitma() {
    	System.out.println("interface static keywor ile isitma yaptim");
    }
    
}
