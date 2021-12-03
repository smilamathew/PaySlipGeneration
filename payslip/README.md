#PaySlip Application
Payslip Application is a spring boot based project which take Employee name and annual salary as the input and calculates monthly salary.This application use Maven as the  build tool.

#How I intialize the project
- Navigate to  https://start.spriong.io
- Choose the the language as Java and build tool as Maven 
- Click Dependencies  and select Spring Web
- Click Generate
- Download the zip file and import the project to Eclipse
 
#How I develop the the project
- Created a MonthlyPaySlipCalculator class which take the input name and annual salary from the console and call other classes to calculate gross income, tax and monthly income and then it displays the output to the console. 
- Also created test classes to test the respective classes.

#Assumptions:
- Annual Salary is non-negative.
- Employee name is not null.

 
#How to run the application
- Open IDE(eclipse, IntelliJ IDEA) import the zip file
- Right click on project(payslip), select 'Run As' and click on "Spring Boot App"
- They type Employees name in console "Enter Employee Name:"
- Then provide Annual Salary in console "Enter Annual Salary:"
- Then press Enter.

#How to run the test cases
- Open IDE(eclipse, IntelliJ IDEA) import the zip file
- Right click on project(payslip), select 'Run As' and click on "JUint Test"

 
