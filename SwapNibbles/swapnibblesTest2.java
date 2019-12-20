/*#******************************************************************************************************************
        # @purpose :Demonstrate SwapNibblesTest Logic.
        # @file  :SwapNibblesTest.java
        # @author :Sandhya
   #***************************************************************************************************************/
package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class swapnibblesTest2 {

	@Test
	void test() {
		swapnibbles ob = new swapnibbles();
		int result = ob.swapNibbles(100);
		assertEquals(70,result);
	}
	

}
