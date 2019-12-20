
/*#******************************************************************************************************************
        # @purpose :Demonstrate Sqrt Logic.
        # @file  :Sqrt.java
        # @author :Sandhya
   #***************************************************************************************************************/

package jUnitTesting;

public class sqrt {
	public double sqrt(double c) {
		double t=0;
		t = c;
		double epsilon = 1e-15;
		while(Math.abs(t-(c/t)) > epsilon*t){
			t = (c/t + t)/2.0;
		}
		System.out.println(t);
			

return t;
}
}
