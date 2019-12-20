package jUnitTesting;

public class monthlyPayment {
	public static double payment(int p,int y,int R) {
	
	int n = 12 * y;
	double r = R /(12 * 100);
	     double payment = (p*r)/ (1-Math.pow((1+r),(-n))); 
	     System.out.println(payment);
		return payment;

}
}