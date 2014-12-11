package com.example.ps5;

public class CalcEngine {
	public CalcEngine(){
	}
	public double Calculate(double investment, int year, double IR){
		return Math.pow(1+IR/100, year)*investment;
	}
	public static double investmentCalculator(double investmentAmount,
			double years, double annualInterestRate) {
		// TODO Auto-generated method stub
		return 0;
	}
}
