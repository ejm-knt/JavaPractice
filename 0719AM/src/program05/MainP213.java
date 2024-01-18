package program05;

import java.util.Arrays;

public class MainP213 {
	// 戻り地が配列の場合 (P213 コード5-14)

	public static int[] makeArray(int size) {
		int[] newArray = new int [size];
		
		for (int i = 0; i < newArray.length ; i++) {
			newArray[i] = i;
			}
		
		return newArray;
	}	
	
	public static void main(String[] args) {
		int[] array = makeArray(3);
		for (int i : array) {
			System.out.println(i);
		}
		
		array[1] = 500;
		System.out.println(Arrays.toString(array));
	}

}
