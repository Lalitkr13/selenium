package opps;

public class Demo_class {

	public static void main(String[] args) {
		
		Banglore b1= new Banglore();
		b1.banglore();
		
		Pune p1 = new Pune();
		p1.pune();
		
		Raipur r1 = new Raipur();
		
		
	}
}
class Banglore{
	public void banglore() {
		System.out.println("This is banglore");
		
	}
}
class Pune {
	public void pune() {
		System.out.println("This is pune");
		
	}	
}
class Raipur{
	Raipur(){
		
	System.out.println("This is Raipur");
	}
}