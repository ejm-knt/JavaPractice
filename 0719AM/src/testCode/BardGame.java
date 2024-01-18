package testCode;

import java.util.Scanner;

public class BardGame {
	// Bardくんに数当てゲーム作ってもらった！！(P137 練習3-6)
	// https://g.co/bard/share/5f2668754fec
	
    public static void main(String[] args) {
        // ゲーム開始のメッセージを表示
        System.out.println("【数当てゲーム】");

        // 0から9までの整数の中からランダムな数を1つ生成
        int ans = (int) (Math.random() * 10);

        // 回答制限5回の内、今何回入力したかを表示
        int currentAnswerCount = 0;

        // 数字を入力し、変数numに代入
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        // 5回繰り返すループを作成
        for (int i = 0; i < 5; i++) {
            // 画面に「0～9の数字を入力してください」と表示
            System.out.println("0～9の数字を入力してください");

            // 数字を入力し、変数numに代入
            num = scanner.nextInt();

            // もし変数numが変数ansと等しかったら「アタリ！」と表示して、繰り返しを終了
            if (num == ans) {
                System.out.println("アタリ!");
                break;
            }

            // もし変数numが変数ansより大きければ「大きい」と表示
            else if (num > ans) {
                System.out.println("大きい");
            }

            // もし変数numが変数ansより小さければ「小さい」と表示
            else {
                System.out.println("小さい");
            }

            // 現在の回答数を表示
            currentAnswerCount++;
            System.out.println("現在の回答数: " + currentAnswerCount + "/" + 5);
        }

        // ゲーム終了時に結果発表をする
        if (num == ans) {
            System.out.println("今回は" + currentAnswerCount + "回で当てられました！");
        } else {
            System.out.println("残念！今回は当てられませんでした。答えは" + ans + "でした。");
        }
    }
}