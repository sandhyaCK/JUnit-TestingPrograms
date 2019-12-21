/*#******************************************************************************************************************
        # @purpose :Demonstrate SwapNibblesTest Logic.
        # @file  :SwapNibbles.java
        # @author :Sandhya
   #***************************************************************************************************************/

package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class swapnibblesTest {

	@Test
	void test() {
	swapnibbles ob = new swapnibbles();
	int res = ob.binary(12);
	assertEquals(1100,res);
	}
	
		
}
