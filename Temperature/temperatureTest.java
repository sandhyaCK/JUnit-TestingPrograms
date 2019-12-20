/*#******************************************************************************************************************
        # @purpose :Demonstrate TemperatureTest Logic.
        # @file  :TemperatureTest.java
        # @author :Sandhya
   #***************************************************************************************************************/

package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class temperatureTest {

	@Test
	void test() {
		temperature ob = new temperature();
		double a = ob.temp(30);
		assertEquals(86.0,a);
	}

}
