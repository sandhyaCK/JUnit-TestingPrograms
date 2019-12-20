/*#******************************************************************************************************************
        # @purpose :Demonstrate VendingMachineTest Logic.
        # @file  :VendingMachineTest.java
        # @author :Sandhya
   #***************************************************************************************************************/

package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VendingMachineTest {

	@Test
	void test() {
		VendingMachine ob=new VendingMachine();
		int result= ob.countCurrency(3000);
		 assertEquals(2,result);
	}

}
