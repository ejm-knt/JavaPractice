package drivePractice03;

public class Q01 {
//	戻り値のない、initGame(),runGame(),endGame()メソッドを作成する。
//	各メソッドの処理内容はメソッド名を出力するのみとする。
//	mainメソッドから3つのメソッドを呼び出し、以下の実行結果となるようにせよ。
//
//	[実行結果]
//	initGame
//	runGame
//	endGame
	
	public static void main(String[] args) {
		initGame();
		runGame();
		endGame();
		
	}

	public static void initGame() {
		System.out.println("initGame");
	}
	
	public static void runGame() {
		System.out.println("runGame");
	}
	
	public static void endGame() {
		System.out.println("endGame");
	}
	
}
