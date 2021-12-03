/* Its the main class  */


package com.example.payslip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class PayslipApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PayslipApplication.class, args);
		MonthlyPaySlipCalculator monthlyPaySlip = context.getBean(MonthlyPaySlipCalculator.class);
		monthlyPaySlip.calculateMonthlyPaySlip();		
	}
}
