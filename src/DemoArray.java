
public class DemoArray {

	public static void main(String[] args) {
	
		int [] a = {2,5,8,6,10};
		// array start with 0 index so its goes to length-1
		System.out.println(a[0]);
		System.out.println(a[3]);
		System.out.println(a[1]);
		// if we have to change value
		a[3]= 25;
		System.out.println(a[3]);
		
		
		int[] b = new int [5];
		
		b[0]=2;
		b[1]= 8;
		b[3]=9;
		b[4]=56;
		System.out.println(b[3]);
		System.out.println(b[0]);
		System.out.println(b[4]);
		

		int[] num = {1,2,3,4,5,6,7,8};
		
		int len =num.length;
		System.out.println("This is length of arrya : "+len);
		
		for(int i = len-1 ; i>=0 ; i--) {
			System.out.println(num[i]);
		
		}	
		int[] numbers = {10, 20, 30, 40, 50};
		System.out.println("Elements using traditional for loop:");
		for (int i = 0; i < numbers.length; i++) {
		    System.out.println("Element at index " + i + ": " + numbers[i]);
		    
		}
		
		
	}

}

