package demo;

import java.util.ArrayList;

public class Demo_Collection {

	public static void main(String[] args) {
		System.out.println("this is begning");
		
		ArrayList<String> name = new ArrayList<String>();
		System.out.println(name.getClass().getName());
		
		name.add("lalit");
		name.add("bhupesh");
		name.add("bhupendra");
		name.add("chameli");
		name.add("jagriti");
		System.out.println(name);
		
		// add new name
		name.add("kurud");
		System.out.println(name);
		
		// add name after bhupesh
		name.add(2,"akash");
		System.out.println(name);
		
		// remove name
		name.remove(3);
		System.out.println(name);
		
		// change name akash to bhupendra
		name.set(2, "bhupendra");
		System.out.println(name);
		
		//print only one name
		System.out.println(name.get(3));
		
		name.clear();
		
		
		
		

	}

}
