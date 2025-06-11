package demo;

public class Constrctr2 {

	public static void main(String[] args) {
		System.out.println("starting");
		Speedway1 sp = new Speedway1("Lalit",28);
		sp.disply();
	}

}
class Speedway1{ 
	String name;
	int age;
	Speedway1(String n , int a){
		
		this.name = n; //for instace variable we have to write this 
			this.age = a;	
			
	}

	void disply() {  //if here display matheod does not assign parametor then sp.disply also does not assign parmetor
		System.out.println("Name: "+name+" , Age: " +age);
	}
	}
	
		
	
	
