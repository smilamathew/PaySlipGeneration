/* This class read inputs from console and perform the calculation and displays the output*/
package com.example.payslip;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MonthlyPaySlipCalculator {
	@Autowired
	 GrossIncomeCalculator grossIncomeController;
	@Autowired
	 MonthlyIncomeTax incometax;
	@Autowired 
	MonthlyIncome netIncome;

	public void calculateMonthlyPaySlip() {
		//Reading input from the console
		System.out.println("Generate Monthly PaySlip");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Employee Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Annual Salary: ");
		double annualSalary = scanner.nextDouble();
		int grossIncome= grossIncomeController.grossIncomeCalculate(annualSalary);
		int monthlyIncometax = incometax.calculateIncomeTax(annualSalary);
		netIncome.calculateIncome(grossIncome, monthlyIncometax);	
		//Displaying Output in the console		
		System.out.println("####################################");
		System.out.println("Monthly payslip for: " +name);
		System.out.println("Gross Monthly Income:" +grossIncomeController.getGrossIncome());
		System.out.println("Monthly Income Tax:" +incometax.getTax());
		System.out.println("Net Monthly Income:" +netIncome.calculateIncome(grossIncome, monthlyIncometax));
		scanner.close();
	}

	

	
	

}
