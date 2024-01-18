package drivePractice02;

public class ExQ03 {

	public static void main(String[] args) {
		/*	String names[] = {"A","B","C","D","E"};// 名前配列
			int[] totals = new int[5];// 個人の合計得点の配列
			int scores[][] = {{80, 92, 60 ,100, 78},{60, 45, 65 ,56, 80},{64, 89, 48 ,45, 67}};
							//{第一教科配列},{第二教科配列},{第三教科配列}
			
			// 多次元配列の要素ごとに処理
			for(問題){// 教科毎のfor文
				for(問題){// 個人毎のfor文 
					// 個人の合計得点の保存
					totals[j] += 問題;
				}
			}
			
			// 合計得点の表示
			for(int i = 0; i<totals.length; i++){
				System.out.println(names[i] + "さんの合計得点 = " + totals[i]);
			}
			
			以下の実行結果となるようにfor文の()の中と{}の中を記入しなさい。
			[実行結果]
			Aさんの合計得点 = 204
			Bさんの合計得点 = 226
			Cさんの合計得点 = 173
			Dさんの合計得点 = 201
			Eさんの合計得点 = 225
		*/
		
		String names[] = {"A","B","C","D","E"};// 名前配列
		int[] totals = new int[5];// 個人の合計得点の配列
		int scores[][] = {{80, 92, 60 ,100, 78},{60, 45, 65 ,56, 80},{64, 89, 48 ,45, 67}};
						//{第一教科配列},{第二教科配列},{第三教科配列}
						//scores[3][5] ということ
		
		// 多次元配列の要素ごとに処理
		for(int i = 0; i < scores[0].length; i++){// 教科毎のfor文
			
			for(int j = 0; j < scores.length; j++){// 個人毎のfor文 
				// 個人の合計得点の保存
				totals[i] += scores[j][i];
			}
			
		}
		
		// 合計得点の表示
		for(int i = 0; i<totals.length; i++){
			System.out.println(names[i] + "さんの合計得点 = " + totals[i]);		
		}
			
		//デバック用(X,Yを一括表示)
		/*
		for (int i = 0 ; i < 3; i++) {
			for (int j = 0 ; j < 5; j++) {
				System.out.print(scores[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		*/
		
		
	}

}
