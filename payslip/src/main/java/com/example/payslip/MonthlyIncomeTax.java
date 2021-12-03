/* This class calls the service class IncomeTaxCalculationService*/
package com.example.payslip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.payslip.service.IncomeTaxCalculationService;

@Component
public class MonthlyIncomeTax {
	private int incomeTax;
	@Autowired
	IncomeTaxCalculationService taxCalc;
	public int calculateIncomeTax(double annualSalary) {
		return this.incomeTax = taxCalc.getTax(annualSalary);
		
	}
	public int getTax() {
		return this.incomeTax;
	}
}
