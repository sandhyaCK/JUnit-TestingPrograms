/*#******************************************************************************************************************
        # @purpose :Demonstrate SqtrTest Logic.
        # @file  :SqrtTest.java
        # @author :Sandhya
   #***************************************************************************************************************/

package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sqrtTest {

	@Test
	void test() {
		sqrt ob = new sqrt();
		double a = ob.sqrt(36.0);
		assertEquals(6.0,a);
	}

}
