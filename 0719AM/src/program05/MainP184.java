package program05;

public class MainP184 {
	// シンプルなメソッドの定義 (P184 コード5-1)
	/*
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello();
		System.out.println("メソッドの呼び出しが完了しました。");
	}	
	
	public static void hello() {
		System.out.println("湊さん、こんにちわ");
	}
	*/
	
	// 引数の例(渡す値が1つの場合) (P193 コード5-4)
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		
		hello("湊(みなと)");
		hello("奏(かなで)");
		hello("泰(やす)");
		hello("秦(しん)");
		
		System.out.println("メソッドの呼び出しが完了しました。");
	}	
	
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちわ");
	}

}
