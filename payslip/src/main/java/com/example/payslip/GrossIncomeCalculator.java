/* Calculate Gross Income based on annual salary.*/

package com.example.payslip;


import org.springframework.stereotype.Component;
@Component
public class GrossIncomeCalculator {
	private int grossIncome;
	public int grossIncomeCalculate(double annualSalary) {
		this.grossIncome = (int)Math.round(annualSalary/12);
		return this.grossIncome;
	}
	
	public int getGrossIncome() {
		return this.grossIncome;
	}

}
