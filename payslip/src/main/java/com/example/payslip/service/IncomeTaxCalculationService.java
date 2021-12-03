/* Perform tax calculation based on the annual Salary*/
package com.example.payslip.service;

import org.springframework.stereotype.Service;

@Service
public class IncomeTaxCalculationService {
	private int incomeTax;
	private final double RATE1 = 0;
	private final double RATE2 = 0.1;
	private final double RATE3 = 0.2;
	private final double RATE4 = 0.3;
	private final double RATE5 = 0.4;
	private final int SCALE1 = 20000;
	private final int SCALE2 = 20000;
	private final int SCALE3 = 40000;
	private final int SCALE4 = 100000;
	private final int TOTAL_MONTHS = 12;
	

public int getTax(double annualSalary) {
	
	if(annualSalary >=0 && annualSalary<= 20000) {
		incomeTax = 0;
		
	}
	else if(annualSalary >20000 && annualSalary<= 40000){
		incomeTax = (int)Math.round(((SCALE1*RATE1)+((annualSalary-SCALE1)*RATE2))/TOTAL_MONTHS);	
	}
	else if(annualSalary >40000 && annualSalary<= 80000){
		incomeTax = (int)Math.round(((SCALE1*RATE1)+(SCALE2*RATE2)+((annualSalary-(SCALE1+SCALE2))*RATE3))/TOTAL_MONTHS);	
	}
	else if(annualSalary >80000 && annualSalary<= 180000){
		incomeTax = (int)Math.round(((SCALE1*RATE1)+(SCALE2*RATE2)+(SCALE3*RATE3)+((annualSalary-(SCALE1+SCALE2+SCALE3))*RATE4))/TOTAL_MONTHS);	
	}
	else if(annualSalary> 180000){
		incomeTax = (int)Math.round(((SCALE1*RATE1)+(SCALE2*RATE2)+(SCALE3*RATE3)+(SCALE4*RATE4)+((annualSalary-(SCALE1+SCALE2+SCALE3+SCALE4))*RATE5))/TOTAL_MONTHS);	
	}
	
	return incomeTax;
}


}
