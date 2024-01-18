package program05;

public class MainP212 {
	// 同じ配列を参照していることを確認する (P212 コード5-13)
	// オブジェクト指向で便利になっていくらしい
	public static void incArray(int[] array) {
		for(int i = 0 ; i < array.length; i++) {
			array[i]++;
		}
//		array[0] ++;
		
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3};
		incArray(array);
		for(int i : array) {
			System.out.println(i);
		}
	}

}
