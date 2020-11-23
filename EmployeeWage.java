package com.java.Employee;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Wage Computation");
		Random random=new Random();
		int attendance=random.nextInt(2);
		if(attendance == 0)
		{
			System.out.println("Employee is absent!");
		}
		else
		{
			System.out.println("Employee is present!");
		}
		
	}

}
