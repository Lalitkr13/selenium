package opps;

public class DemoStringBuffer {

	public static void main(String[] args) {
		
		// stringbuffer is a class , which is mutable that means we an change the content
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("   "
				+ "World");
		sb.append(" How are You");
		System.out.println(sb);
		
		StringBuffer sb1 = new  StringBuffer("This is Raipur");
		
		System.out.println(sb1.insert(7, " the ")); 
		
		System.out.println(sb1.replace(13, 19, "Kurud"));
		
		System.out.println(sb1.length());
		
		System.out.println(sb1.reverse());
		

	}

}
