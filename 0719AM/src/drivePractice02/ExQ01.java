package drivePractice02;

public class ExQ01 {

	public static void main(String[] args) {
		/* 	exQ1
			5人のテスト結果から最高得点を取得するプログラム
			for文を使って、１つずつmaxと比較して、大きかったら、maxに代入しています。
			
			int max = 0;// 最高得点
			int scores[] = {80, 92, 60 ,100, 78};
			for(問題){
				問題
			}
			System.out.println("max = " + max);
			
			以下の実行結果となるようにfor文の()の中と{}の中を記入しなさい。
			[実行結果]
			max = 100
		*/
		
		int max = 0;// 最高得点
		int scores[] = {80, 92, 60 ,100, 78};
		
		for (int i = 0 ; i < scores.length; i++){
			for (int j = i+1; j < scores.length; j++) {
				
				if(max < scores[i]) {
				max	= scores[i];
				scores[i] = scores[j];
				scores[j] = max;
				}
				
			}
		}
		
		System.out.println("max = " + max);
		
		
	}

}
