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
		int EmployeeType=random.nextInt(2);
		if(EmployeeType == 0)
		{
			DailyWage=(WagePerHour*FullDayHour);
			System.out.println("Employee wage is: "+DailyWage);
		}
		else
		{
			DailyWage=(WagePerHour*PartTimeHour);
			System.out.println("Employee wage is: "+DailyWage);
		}
	}

}
