package com.java.Employee;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class EmployeeWage implements IComputeEmpWage{

	
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	
	public int numOfCompany=0;
	
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String, CompanyEmpWage>companyEmpWageMap;
	
	
	
	public EmployeeWage()
	{
		companyEmpWageList= new LinkedList<CompanyEmpWage>();
		companyEmpWageMap=new HashMap<String, CompanyEmpWage>();
	}
	


	public static void main(String[] args)
	{
		EmployeeWage empWage = new EmployeeWage();
		empWage.addCompanyEmpWage("Dmart", 20, 2, 10);
		empWage.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWage.computeEmpWage();
	}


	@Override
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		CompanyEmpWage companyEmpWage=new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);	
		
		companyEmpWageList.add(companyEmpWage);
		companyEmpWageMap.put(company, companyEmpWage);
		
	}

	@Override
	public void computeEmpWage() {
		for (int i = 0; i <companyEmpWageList.size(); i++) 
			{
				CompanyEmpWage company=companyEmpWageList.get(i);
				company.setTotalEmpWage(this.computeEmpWage(company));
				System.out.println(company);
			
	
		}
		
	}

	@Override
	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
		Random random=new Random();
		while(totalEmpHrs<=companyEmpWage.maxHoursPerMonth && totalWorkingDays<companyEmpWage.numOfWorkingDays)
		{
			totalWorkingDays++;
			
			int empCheck=random.nextInt(3);
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

	@Override
	public int getTotalWage(String company) {
		return companyEmpWageMap.get(company).totalEmpWage;
	}
	
}