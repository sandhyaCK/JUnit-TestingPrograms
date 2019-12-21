/*#******************************************************************************************************************
        # @purpose :Demonstrate DayWeekTest Logic.
        # @file  :DayOfWeekTest.java
        # @author :Sandhya
   #***************************************************************************************************************/
package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DayOfWeekTest {

	@Test
	void test() {
DayOfWeek ob = new DayOfWeek();
int day = ob.day(2020, 4, 22);
assertEquals(3,day);
	}

}
