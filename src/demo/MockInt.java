package demo;

import org.checkerframework.checker.units.qual.s;

public class MockInt {
      static String str = "lalit";
    		  
     
      
	public static void main(String[] args) {
		int n =896;
		String[] res= {"even","odd"};
		System.out.println("even or odd - "+res[n%2]);
		
	  // local variable
		int a= 10;
		int b=20;
		int c= a+b;
		System.out.println(c);

		Demo d1= new Demo();
		d1.sum();
		
		System.out.println();
		
		System.out.println(MockInt.str);
		
		System.out.println();
		
		Demo2 d2 = new Demo2("lalit", 007,698564123);
		d2.display();
		
				System.out.println();
				
		Demo2 d3= new Demo2("sujeet",18,909856422);
		d3.display();
		
	}

}
class Demo {
	int a = 10;
	int b=23;
	int c = a+b;
	
	
	public void sum() {
		System.out.println(c);
	}
		
}
class Demo2 {
	String name;
	int id ;
	int mob;
	public Demo2(String name ,int id,int mob) {
		this.name=name;
		this.id =id;
		this.mob= mob;
	}
		public void  deposite (double amount) {
			
		}
	
	void display () {
		System.out.println("this is my name  " + name);
		System.out.println("this is my id   " + id);
		System.out.println("this is my mobile   " + mob);
	}
	
	
}