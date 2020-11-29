package com.java.Employee;

import java.util.Random;

public class EmployeeWage {

	
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	
	public int numOfCompany=0;
	
	CompanyEmpWage companyEmpWage[];
	
	public EmployeeWage()
	{
		companyEmpWage=new CompanyEmpWage[5];
	}
	
	private void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
	{
		companyEmpWage[numOfCompany]=new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		numOfCompany++;
	}
	
	private void computeEmpWage()
	{
		for (int i = 0; i <numOfCompany; i++) 
		{
			companyEmpWage[i].setTotalEmpWage(this.computeEmpWage(companyEmpWage[i]));
			System.out.println(companyEmpWage[i]);
		}
	}
	
	
	private int computeEmpWage(CompanyEmpWage companyEmpWage)
	{
	int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
	Random random=new Random();
	while(totalEmpHrs<=companyEmpWage.maxHoursPerMonth && totalWorkingDays<companyEmpWage.numOfWorkingDays)
	{
		totalWorkingDays++;
		
		int empCheck=random.nextInt(3);
				//(int) Math.floor(Math.random() * 10)%3;
		switch(empCheck)
		{
		case IS_PART_TIME:
			empHrs=4;
			break;
			
		case IS_FULL_TIME:
			empHrs=8;
			break;
		default:
			empHrs=0;
		}
		totalEmpHrs+=empHrs;
		System.out.println("day: "+totalWorkingDays + "EmpHrs: "+empHrs);
		}
	
	return totalEmpHrs * companyEmpWage.empRatePerHour;
	}

	public static void main(String[] args)
	{
		EmployeeWage empWage = new EmployeeWage();
		empWage.addCompanyEmpWage("Dmart", 20, 2, 10);
		empWage.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWage.computeEmpWage();
	}
}