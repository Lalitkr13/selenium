package demo;

public class MissingNumber {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,6,5,7,8};
		
		int n = a.length +1;
		
		int expectedSum = n*(n+1)/2 ;
		
		int actualSum = 0;
		
		for(int num:a) {
			
			actualSum += num;
			
			 int missingNo = expectedSum -actualSum ;
			
		}
		 int missingNo = expectedSum -actualSum ;
          System.out.println("Missisng number is  "+ missingNo );
	}

}
