/*#******************************************************************************************************************
        # @purpose :Demonstrate ToBinary Logic.
        # @file  :ToBinary.java
        # @author :Sandhya
   #***************************************************************************************************************/
package jUnitTesting;

public class Tobinary {
	 int binary(int n) {
		int i = 0;
		int j;
		int[] b = new int[10];
		while(n>0) {
			  b[i++]= n % 2;
			n = n/2;
		}	
		for(j=i-1;j>=0;j--) {
		
		System.out.print(b[j]);
		}
		return b[j];
		}
}
