/* Test class for IncomeTaxCalculationService*/
package com.example.payslip.service;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.payslip.service.IncomeTaxCalculationService;

@SpringBootTest
class IncomeTaxCalculationServiceTest {
@Autowired
IncomeTaxCalculationService taxService;
	
	@Test
	void testGetTax() {
		assertEquals(100, this.taxService.getTax(60000));
	}

}
