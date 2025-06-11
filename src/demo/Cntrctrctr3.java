package demo;

public class Cntrctrctr3 {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		Speedway sp = new Speedway("Sujeet",32);
		Speedway sp2 = new Speedway(sp);
		sp.display();
		sp2.display();
		

	}

}
class Speedway{
	
	String name;
	int age;
	
	Speedway(String n , int a){
		name = n;
		age = a;
	}
	// Copy Constructor
	Speedway(Speedway S){
		name = S.name;
		age = S.age;
	}
	void display() {
		System.out.println("Name : "+name+" , Age :"+age);
	}


	}


