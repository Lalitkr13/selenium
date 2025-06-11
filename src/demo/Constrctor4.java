package demo;

public class Constrctor4 {

	public static void main(String[] args) {
		System.out.println("starting");
      
		city5 c5 = new city5("Banglor", 58000);
		c5.display();
		
		city5 raipur = new city5("raipur", 20000);
		raipur.display();
		
		city5 bhilai= new city5("bhilai");
		bhilai.display();

		
	}

}
class city5{
	
	String cityname;
	int population;
	city5(String name, int pop){
		
		cityname=name;
		population=pop;
			}
	city5(String name){
		
		cityname=name;
	}
	void display() {
		
		System.out.println("City Name :   " +cityname );
		System.out.println("City Population :   " +population );
	}
	
	
	
	
	
}
