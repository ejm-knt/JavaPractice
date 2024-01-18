package drivePractice02;

import java.util.Arrays;

public class Q11 {

	public static void main(String[] args) {
		/* 「Q11」クラスを作成し、
			{3,8,10,5,4}という配列を昇順に並び替える。
			変更された配列を出力する。
			[実行例]
			3
			4
			5
			8
			10
			
			ギブアップ
			参考：
			http://www.creative-forest.com/java/java_intro/array/application/application.html
		*/
		int[] nums	= {8,3,10,5,4};	
		
		 for(int i = 0; i < nums.length-1; i++){
	            for(int j = i+1; j < nums.length; j++){
	                if(nums[j] < nums[i]){
	                    int temp = nums[i];
	                    nums[i] = nums[j];
	                    nums[j] = temp;
	                }
	            }
	        }
		 
		 System.out.println(Arrays.toString(nums));
	}
}