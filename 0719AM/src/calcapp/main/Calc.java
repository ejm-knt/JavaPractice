package calcapp.main;

import java.util.Random;
import java.util.Scanner;

import calcapp.logics.CalcLogic;

public class Calc {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
		int total = CalcLogic.tasu(a , b);
		int delta = CalcLogic.hiku(a , b);
		
		System.out.println("足すと"+ total +"、引くと" + delta);
		
		int num = new java.util.Scanner(System.in).nextInt();
		
		int rondom = new Random().nextInt(100);
		int number = new Scanner(System.in).nextInt();
		}
	
}
