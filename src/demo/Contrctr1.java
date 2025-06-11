package demo;

public class Contrctr1 {

	public static void main(String[] args) {
		System.out.println("this is starting but not ending");
		employ e1 = new employ(18,"Lalit");

	}

}
 class employ{
	 employ(int id , String name){
		 
		 System.out.println("this is employee contructor");
		 System.out.println(id+ "  " + name);
	 }
	 
 }