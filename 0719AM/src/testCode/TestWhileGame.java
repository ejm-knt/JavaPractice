package testCode;

public class TestWhileGame {

	public static void main(String[] args) {

		/*
		 * 10回言わせて誤答させるダルめなゲーム
		 * ～仕様～
		 * ピザと10回文字入力を行わせる
		 * 問い表示「渡航先の国に事前に申請し、審査を経て発行される「入国許可証」ともいえるものを何という？」
		 * さらに入力させる
		 * 正誤判定 (条件分岐)
		 * ビザ → true → 正解！終わり！
		 * それ以外 → false → 不正解！やり直し！
		 */

		//各ブロックで使うので、先に宣言
		int count = 0;
		String typingWord;

		System.out.println("ピザって10回書いてみて？\n10回書いた後の問題に正解できたらゲームクリア！\n不正解ならやり直し");

		//count=11でゲームクリア
		//10回目で質問。正解で+1。不正解で-10。
		while (count < 11) {

			while (count < 10) {
				typingWord = new java.util.Scanner(System.in).nextLine();

				if (typingWord.equals("ピザ")) {
					count++;

					//回数チェック					
					System.out.println("今" + count + "回目！");
				} else {
					System.out.println(typingWord + "じゃないよ、「ピザ」って入力してね！");

					//回数チェック
					System.out.println("「ピザ」じゃないから今" + count + "回目だよ！");
				}
			}

			System.out.println("じゃあ、渡航先の国に事前に申請し、審査を経て発行される「入国許可証」ともいえるものを何という？");
			typingWord = new java.util.Scanner(System.in).nextLine();

			if (typingWord.equals("ビザ")||typingWord.equals("びざ")||typingWord.equals("visa")) {
				count++;
				System.out.println("正解！ゲームクリア！");
			} else {
				//System.out.println("フラグチェック"+count);
				count -= 10;

				System.out.println("不正解！最初からやり直し！");

				//回数チェック
				System.out.println("不正解なので" + count + "回目に戻りました");
			}
		}

	}
}
