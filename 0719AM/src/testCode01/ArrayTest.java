package testCode01;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		for (int i = 0 ; i < 10;i++) {
			int[] nums = new int[i+1];
			nums[i] = i;
			System.out.println(Arrays.toString(nums));
			System.out.println(nums.length);
		}
	}
	
	// for文を使って配列数可変の配列を作成することは可能だが、格納については問題が残った。
	// for文の中で作成する → 処理が動く度に新規作成される → 中身がリセット/格納されない。

	// for文の前に置くと、繰り返し回数を取得できず、中身の大きさを後出しで指定できない
	// for文の中に置くと、前述の通り新規作成されて中身が格納しきれない
	// for文の後に置くと、そもそも配列を作成していないため、for文の中で書いても使えない
	
	// 箱を後々から拡張する場合はコレクション型を用いることがなぜ好ましいかがわかった
	
}
