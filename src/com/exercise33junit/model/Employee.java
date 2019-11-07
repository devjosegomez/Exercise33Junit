package com.exercise33junit.model;

public class Employee {
	public double calculateBrute(String employeeType, double salesPerMonth, int extraHours) {
		
		double bruteSalary=0;
		double salarySales=0;
		double salaryHours=0;
	
		bruteSalary = (employeeType.equals("salesEmployee"))?1000.0:1500.0;
		salarySales = (salesPerMonth>=1000 & salesPerMonth<1500)?100.0:200.0;
		return bruteSalary = (employeeType.equals("salesEmployee"))?1000.0+salarySales+salaryHours:1500.0+salarySales+salaryHours;
	}
}
