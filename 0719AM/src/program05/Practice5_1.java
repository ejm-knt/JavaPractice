package program05;

public class Practice5_1 {
	// 	練習5-1
	/*	以下の仕様を参考にメソッド「introduceOneself」を定義してください。
	 * 	さらに、定義したメソッドをmainメソッドから呼び出してください。
	 */
	
	public static void main(String[] args) {
		introduceOneself();
	}

	public static void introduceOneself() {
		String name = "JavaIchiro";
		int age = 28;
		double height = 314.15;
		char zodiac = '亥';
		
		System.out.println("名前は" + name);
		System.out.println("年は" + age);
		System.out.println("身長は" + height);
		System.out.println("干支は" + zodiac);
		
		
	}
	
	// chra型についての解説が授業内であった
	// charからString に変換する時の変数 String.valueOf();
	// ex) 
	// System.out.println(String.valueOf('A') + String.valueOf('B'));
	
	// 逆にStringからChar に変換するときの方法
	// String str = "文字列";
	// char[] c = str.toCharArray();
	
	// ※ charを更にStringに再変更したい場合に用いる
	// String s = new String(c) 

}
