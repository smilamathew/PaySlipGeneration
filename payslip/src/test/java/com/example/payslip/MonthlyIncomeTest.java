/* Test class for MonthlyIncome*/
package com.example.payslip;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class MonthlyIncomeTest {
@Autowired
MonthlyIncome netIncome;

	@Test
	void testCalculateIncome() {
		assertEquals(1000, netIncome.calculateIncome(129999, 99));
	}

}
