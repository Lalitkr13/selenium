package demo;

public class Contructornew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeee e1 = new Employeee(214,"lalit",65984562,"ee","kurud");
	e1.display();
		
	}

}
class Employeee{
	
	int id;
	String name;
	long mob;
	String Dept;
	String Address;
	
Employeee(int i , String n , long m,String d,String a){
	this.id=i;
	this.name=n;
	this.mob=m;
	this.Dept=d;
	this.Address=a;
	
}

void display() {
	System.out.println(id+" "+name+" "+mob+" "+Dept+" "+Address);
	System.out.println(id+" "+name+" "+mob+" "+Dept);
	
	
	
	
}
}