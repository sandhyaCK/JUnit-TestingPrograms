*#******************************************************************************************************************
        # @purpose :Demonstrate MonthlyPaymentTest Logic.
        # @file  :MonthlyPaymentTest.java
        # @author :Sandhya
   #***************************************************************************************************************/

package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class monthlyPaymentTest {

	@Test
	void test() {
		monthlyPayment ob = new monthlyPayment();
		double result = ob.payment(150000,5,5000);
		assertEquals(600000.0,result);
	}

}
