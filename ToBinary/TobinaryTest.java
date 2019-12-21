/*#******************************************************************************************************************
        # @purpose :Demonstrate TwoBinaryTest Logic.
        # @file  :ToBiaryTest.java
        # @author :Sandhya
   #***************************************************************************************************************/

package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TobinaryTest {

	@Test
	void test() {
		Tobinary ob = new Tobinary();
		int  a = ob.binary(7);
		assertEquals(111,a);
	}

}
