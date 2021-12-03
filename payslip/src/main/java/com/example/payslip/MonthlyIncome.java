package com.example.payslip;

import org.springframework.stereotype.Service;

@Service
public class MonthlyIncome {
 private int netIncome;
 public int calculateIncome(int annualSalary,int monthlyIncometax) {
	 return netIncome = annualSalary-monthlyIncometax;
 }
 public int getNetIncome() {
	 return this.netIncome;
 }
}
