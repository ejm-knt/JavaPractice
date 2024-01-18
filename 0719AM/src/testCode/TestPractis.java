package testCode;

public class TestPractis {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		int a = -1 ;
//		System.out.println(a < 0);

	  int gameBalance;
	  int gameBalanceChance;

	  //難易度調整
	  gameBalance = 15;	  						//当てる数値の最大値
	  gameBalanceChance = (gameBalance / 2) ;	//挑戦回数

	  System.out.println("【数あてゲーム】");
	  System.out.println("説明: 0から"+ (gameBalance) +"のランダムな数字を1つ生成するので、プレイヤーはその数字を当てよう！");
	 
	  int ans = new java.util.Random().nextInt(gameBalance+1);
	  //答え。デバック用。実装時は下記コードをコメントアウト
	  System.out.println(ans); 
	  
	  for (int i = 0 ; i < gameBalanceChance ; i++) {
		  System.out.println("0～"+ (gameBalance) +"の数字を入力してください");
		  int num = new java.util.Scanner(System.in).nextInt();
		  
		  if (num > (gameBalance) || num < 0) {
			  i--;
			  System.out.println("無効な数値が入力されています！");
			  System.out.println("残り" + (gameBalanceChance-(i+1)) + "回！ [" + (i+1) +"/"+gameBalanceChance+"]");
	  	  } else if (ans == num) {
			  System.out.println("アタリ！");
			  System.out.println("オメデトウ！今回は" + (i+1) + "回で当てられたよ！");
			  break;
		  } else if (ans > num) {
			  System.out.println("違います！\n答えのほうが大きいです。");
			  System.out.println("残り" + (gameBalanceChance-(i+1)) + "回！ [" + (i+1) +"/"+gameBalanceChance+"]");
		  } else {
			  System.out.println("違います！\n答えのほうが小さいです。");
			  System.out.println("残り" + (gameBalanceChance-(i+1)) + "回！ [" + (i+1) +"/"+gameBalanceChance+"]");
		  }
	  }

	 System.out.println("\n答えは" + ans + "でした！");
	 System.out.println("ゲームを終了します");

	}

}
