package com.java.Employee;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Wage Computation");
		Random random=new Random();
		int attendance=random.nextInt(2);
		if(attendance == 0)
			System.out.println("Employee is absent!");
		else
			System.out.println("Employee is present!");
		int WagePerHour=20;
		int FullDayHour=8;
		int PartTimeHour=4;
		int DailyWage=0;
		int MAX_HRS_IN_MONTH=100;
		int NUM_WORKING_DAYS=20;
		int totalWorkingDays=0;
		int totalWorkhours=0;
		int WorkingDays=20;
		int MonthlyWage=0;
		int totalWage=0;
		int EmployeeType=random.nextInt(2);
		while(totalWorkhours<MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS)
		{
			switch(EmployeeType)
			{
			case 0:
				DailyWage=(WagePerHour*FullDayHour);
				//System.out.println("Employee wage is: "+DailyWage);
				MonthlyWage=(DailyWage*WorkingDays);
				//System.out.println("Monthly wage is: "+MonthlyWage);
				totalWorkhours=(totalWorkhours+FullDayHour);
				break;
			case 1:
				DailyWage=(WagePerHour*PartTimeHour);
				//System.out.println("Employee wage is: "+DailyWage);
				MonthlyWage=(DailyWage*WorkingDays);
				//System.out.println("Monthly wage is: "+MonthlyWage);
				totalWorkhours=(totalWorkhours+PartTimeHour);
				break;
			default:
				System.out.println("Invalid");
					
			}
			totalWorkingDays++;
			
		}
		totalWage=(totalWorkhours*totalWorkingDays*WagePerHour);
		System.out.println("Total Wage is : "+totalWage);
	}

}
