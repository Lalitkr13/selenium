package demo;

public class Cnstrctr {

	public static void main(String[] args) {
	
		System.out.println("start");
		
     city c1 = new city();
     c1.banglore();
     
     city2 c2  = new city2();
     
     city3 c3 = new city3();
     
     emp e1 = new emp();
     
     emp2 e = new emp2(101,"lalit");
	}

}
class city{
	public void banglore() {
		
		System.out.println("banglore");
	}
	
}

class city2{
	city2(){
		System.out.println("chennai");
		
	}
	
}

class city3{
	city3(){
		System.out.println("this is pune");
		
	}
	
}

class emp{
	int id;
	String name;
	{
		System.out.println(id+ "  "+ name);
		
	}
	
	
}

class emp2{
	emp2(int id, String name ){
	
		System.out.println(id+ "  "+ name);
		
	}
	
	
}
