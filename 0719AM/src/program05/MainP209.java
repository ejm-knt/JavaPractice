package program05;

public class MainP209 {
	// 引数に配列を受け取るメソッドを利用 (P209 コード5-12)
	
	public static void printArray(int[] array) {
		
		for (int element : array){
			System.out.println(element);
		}

	}

	public static void main(String[] args) {
		int [] array = {1,2,3};
		printArray(array);		//配列を渡す
	
	}

	
}
