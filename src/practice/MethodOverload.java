package practice;

public class MethodOverload {

	public static void main(String[] args) {
		

		
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
