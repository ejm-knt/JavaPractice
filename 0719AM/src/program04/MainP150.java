package program04;

public class MainP150 {

	public static void main(String[] args) {

		// 配列の代入と初期化は両方よく使うので、両方絶対に覚えておいてほしい。
		// よく使うというか、使い分けなきゃいけない時が来る。
		
		// 配列の作成手順 その1 int型 (P150 コード4-2)
		int [] scores; 
		scores = new int [5];	
		
		// 配列の作成手順 その2 int型 (P150 コード4-3)
		int [] numbers = new int [7];		

		// 配列の長さを調べる (P151 コード4-4）
		int [] arrayChecks = new int [10];
		int num = arrayChecks.length;
		
		System.out.println("要素数は" + num);
		System.out.println("");
		
		// 配列の要素の値を代入する (P152 コード4-5)
		int [] testsArray = new int [5];
		testsArray[1] = 30;

		System.out.println(testsArray[0]);
		System.out.println(testsArray[1]);
		System.out.println(testsArray[2]);
		System.out.println(testsArray[3]);
		System.out.println(testsArray[4]);
		System.out.println("");
		
		// 配列は自動的に初期化される (P153 コード4-6)
		int [] autoInitialize = new int [5];
		System.out.println(autoInitialize[0]);
		System.out.println("");
		
		// 配列の省略記法 (P153)
		int [] omitArray = new int[] {1,2,3,4,5};
		System.out.println(omitArray[0]);
		System.out.println(omitArray[1]);
		System.out.println(omitArray[2]);
		System.out.println(omitArray[3]);
		System.out.println(omitArray[4]);
		System.out.println("");
		
	}

}
