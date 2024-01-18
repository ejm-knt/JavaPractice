package drivePractice10Q1;

import java.util.Scanner;

public class BmiCalculationMain {

	public static void main(String[] args) {
		System.out.print("Please input your height(cm)>");
		int height = new Scanner(System.in).nextInt();
		
		System.out.print("Please input your weight(kg)>");
		int weight = new Scanner(System.in).nextInt();
		
		System.out.println("BMI：" + BmiCalculation(height,weight));
		
	}
	
	public static double BmiCalculation(int height,int weight) {
		double bmi = 0.0;
		double metersHeight = (double)height/100;
		
		bmi = (double)weight/(metersHeight * metersHeight);
		
		return bmi;
	}

}
