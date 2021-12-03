/* Test class for GrossIncome*/
package com.example.payslip;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class GrossIncomeTest {
	@Autowired
	GrossIncomeCalculator grossIncome;
	
	@Test
	void testGrossIncomeCalculate() {
		assertEquals(1000, grossIncome.grossIncomeCalculate(12000));
	}

}
