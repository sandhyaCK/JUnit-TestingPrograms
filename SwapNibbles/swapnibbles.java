
/*#******************************************************************************************************************
        # @purpose :Demonstrate SwapNibbles Logic.
        # @file  :SwapNibbles.java
        # @author :Sandhya
   #***************************************************************************************************************/
package jUnitTesting;

public class swapnibbles {
	 int binary(int n) {
		int i = 0;int j;
		int[] b = new int[100];
	 while(n>0) {
		 b[i++]=n%2;
		 n=n/2;
		
	 }
      for(j=i-1;j>=0;j--) {
   	   System.out.print(b[j]);
      }
   return b[j];
	}
	  public static int swapNibbles(int x) {
		  int c=((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
		  System.out.println(c);
		  return c;
	  }
		 

	
}
