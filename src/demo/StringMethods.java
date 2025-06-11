package demo;

public class StringMethods {

	public static void main(String[] args) {
		
		// 1. length method
		String str1 = "This is raipur city";
         int leng = str1.length();
         System.out.println("lenth of charectror  " + leng );
              
         //OR
         System.out.println("lenghth of charct  " +str1.length());
         
         // 2. char at index (index start with 0)
         System.out.println(" char at index " + str1.charAt(8) );
         System.out.println(" char at index " + str1.charAt(11) );
         System.out.println(" char at index " + str1.charAt(17) );
         
         // 3.  Sub String
         System.out.println("this is Substring : "+str1.substring(5,14));
         System.out.println("this is Substring : "+str1.substring(0));
         System.out.println("this is Substring : "+str1.substring(5));
         System.out.println("this is Substring : "+str1.substring(3,15));
         System.out.println("this is Substring : "+str1.substring(19));
         System.out.println("this is Substring : "+str1.substring(0,13));
         
         // 4.Concat
           String str2 = "My Name Is ";
           System.out.println(str2.concat("Lalit"));
           
           // 5.equal
           String str3 = "Hello";
           String str4 = "Hello";
           String str5 = "hello";
           String str6 = new String("Hello");
           
            System.out.println(str3==str4);
            System.out.println(str3==str5);
            System.out.println(str3==str6);
            System.out.println(str3.equals(str4));
            System.out.println(str3.equals(str5));
            System.out.println(str3.equals(str6));
            System.out.println(str3.equalsIgnoreCase(str5));
            
            
            //5. upper case and lower case
            
            String str7 = "this is raipur";
            String str8 = "THIS IS RAIPUR";
            System.out.println("change in to upper case  " + str7.toUpperCase());
            System.out.println("change in to lower case  " + str8.toLowerCase());
           
            // 6. replace
            
            System.out.println(str1.replace("r", "k"));
            
            System.out.println(str1.replace("raipur", "bhilai"));
            
            
	}

}