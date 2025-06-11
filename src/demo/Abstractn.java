package demo;

public class Abstractn {

	public static void main(String[] args) {
		Payment p1;
		p1 = new ATM();
		p1.makePayment(20000);
		
         p1= new creditCard();
         p1.makePayment(25000);
         
         p1 = new debitCard();
         p1.makePayment(30000);
	}

}
abstract class Payment{
	
	abstract void makePayment(double Amount);
	
}
class ATM extends Payment{

	@Override
	void makePayment(double Amount) {
	 System.out.println("Payment Rs:" + Amount + " using ATM");
		}
}
class creditCard extends Payment{

	@Override
	void makePayment(double Amount) {
		System.out.println("Payment Rs:" + Amount + " using CC");
		}
	}
class debitCard extends Payment{

	@Override
	void makePayment(double Amount) {
		System.out.println("Payment Rs:" + Amount + " using DC");
		}
	}