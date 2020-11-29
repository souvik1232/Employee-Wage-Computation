package com.java.Employee;

public class EmployeeWage {

	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private final String comapny;
	private final int empRatePerHour; 
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;
	
	
	
	public EmployeeWage(String comapny, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {
		
		this.comapny = comapny;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHourPerMonth;
	}

	public void Empwagecomputation()
	{
		int emphrs = 0, totalemphrs = 0, totalworkingdays = 0;
		while (totalemphrs <= maxHoursPerMonth && totalworkingdays < numOfWorkingDays)
		{
			totalworkingdays++;
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empcheck)
			{
				case IS_PART_TIME:
					emphrs = 4;
					break;
				case IS_FULL_TIME:
					emphrs = 8;
					break;
				default:
					emphrs = 0;
			}
			totalemphrs += emphrs;
			System.out.println("Day#: " + totalworkingdays + " Emp Hr: " +emphrs);
		}
		totalEmpWage  =  totalemphrs * empRatePerHour; 
	}
	
	
	@Override
	public String toString() {
		return "Total Emp Wage for Comapny : " +comapny+" is : " + totalEmpWage;
	}

	public static void main(String[] args)
	{
		EmployeeWage dMart = new EmployeeWage("Dmart", 20, 2, 10);
		EmployeeWage Reliance = new EmployeeWage("Reliance", 10, 4, 20);
		dMart.Empwagecomputation();
		Reliance.Empwagecomputation();
		System.out.println(dMart);
		System.out.println(Reliance);
	}
}