package demo;

public class ExceptionHandlenig2 {

	public static void main(String[] args) {
     System.out.println( "this is brgining");
     try {
		int [] a = {1,2,3,4,5};
		System.out.println(a[5]);
     }catch (ArrayIndexOutOfBoundsException e) {
    	 System.out.println(e);
     }
		

	}

}
