package com.java.Employee;

public class EmployeeWage {

	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
//	public static final int EMP_RATE_PER_HOUR = 20;
//	public static final int NUM_OF_WORKING_DAYS = 2;
//	public static final int MAX_HRS_IN_MONTH = 10;
	
	public static int Empwagecomputation(String comapny, int empRatePerHour, int numOfWokingDays, int maxHoursPerMonth)
	{
		int emphrs = 0, totalemphrs = 0, totalworkingdays = 0;
		while (totalemphrs <= maxHoursPerMonth && totalworkingdays < numOfWokingDays)
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
	int totalEmpwage  =  totalemphrs * empRatePerHour; 
	System.out.println("Total Emp Wage for Comapny : " +comapny+"is :" + totalEmpwage);
	return totalEmpwage;
	}
	
	public static void main(String[] args)
	{
		Empwagecomputation("Dmart", 20, 2, 10);
		Empwagecomputation("Reliance", 10, 4, 20);
	}
}