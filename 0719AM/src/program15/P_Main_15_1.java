package program15;

import java.util.Arrays;

public class P_Main_15_1 {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1 ; i <= 100; i++) {
			sb.append(i).append(",");
		}
		
		String s = sb.toString();
		String[] a = s.split(",");
		
		System.out.println(Arrays.toString(a));
			
	}
		
		
}