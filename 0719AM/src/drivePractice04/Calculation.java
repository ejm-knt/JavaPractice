package drivePractice04;

import java.util.Arrays;
import java.util.Random;

public class Calculation {

	public static int tasu(int x , int y) {
		return x + y;

	}

	public static int hiku(int x , int y) {
		return x - y;

	}
	
	public static boolean evenNumberJudge(int x) {
		
		boolean judgeEven = false;
		
		if(x % 2 == 0) {
			judgeEven = true;
		}
		
		return judgeEven;
	}
	
	public static boolean findNumber(int x) {
		boolean judgeFind = false;
		int count = 0;
		
		for (int i = 0 ; i < 100 ; i++) {
			int randNum = new Random().nextInt(100)+1;
			
			if (x == randNum) {
				count++;
				judgeFind = true;
				System.out.println(count + "回目に" + x + "を発見！ループを止めます。");
				System.out.println("見つかりました。");
				break;

			} else {
				count++;
			}
		}
		
		if(judgeFind == false) {
			System.out.println("見つかりませんでした。");
		}
		
		return judgeFind;
	}
	
	public static void arrayGeneration(int[] x) {
		int randNum = 0;
		System.out.println(Arrays.toString(x));
		
		for(int i = 0 ; i < x.length; i++) {
			randNum = new Random().nextInt(100)+1;
			x[i] = randNum;
		}
		
		System.out.println(Arrays.toString(x));
		
	}
}
