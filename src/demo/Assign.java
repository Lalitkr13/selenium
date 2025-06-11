package demo;

public class Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=100;i+=2) 
		{
			//another way
			if(i%2!=0)
			sum+=i;
		}

		System.out.println("Sum of odd numbers from 1 to 100 = "+ sum);
	}


	}

