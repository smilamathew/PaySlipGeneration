/**
 * Test IncomeTax calculation for the class Monthly Income Tax
 */
package com.example.payslip;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.payslip.service.IncomeTaxCalculationService;
@SpringBootTest
class MonthlyIncomeTaxTest {
	@Autowired
	MonthlyIncomeTax incomeTax;
	@Autowired
	IncomeTaxCalculationService taxCalc;

	@Test
	void testCalculateIncomeTax() {
		assertEquals(100, this.incomeTax.calculateIncomeTax(60000));
	}

	
}
