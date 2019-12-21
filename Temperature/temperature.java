
/*#******************************************************************************************************************
        # @purpose :Demonstrate Temperature Logic.
        # @file  :Temperatre.java
        # @author :Sandhya
   #***************************************************************************************************************/

package jUnitTesting;

public class temperature {
	public  double temp(int  c) {
	 double t1;
	 t1 =  (c * 9/5) + 32 ; 
	System.out.println(t1);	 
	return t1;
}
	public static double temp1(int  f) {
double t2 =(f - 32) * 5/9 ;
System.out.println(t2);
return t2;
}
	}
