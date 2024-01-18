package program02;

public class MainP84 {

	public static void main(String[] args) {
		//演算時の自動型変換(P84 - コード2-8)
		//意味的に大きな型に統一されてから演算が行われる
//			double d = 8.5 / 2;
//			System.out.println(d);
//			long l = 2L;
//			int  in = 5;
//			Object test = l + in; 
//			System.out.println(test.getClass().getSimpleName());

		//計算結果が何の型になっているか確認するコード
		//GoogleBardくんに聞いてみた。下記がURL。
		//https://g.co/bard/share/d5d6c93d8359
		
		// 変数 double型 で 8.5 を定義
        double d = 8.5;

        // 変数 int型 で 2 を 定義
        int i = 2;

        // 上記のdouble型 と int型 を割り算します
        Object result = d / i;

        // 上記の計算が終了した結果の型が何の型なのか表示します
        System.out.println(result.getClass().getSimpleName());
        
        //下記はint型 と long型 での計算式
        long l = 5 + 2L;
		Object test = l; 
		System.out.println(test.getClass().getSimpleName());

	}

}
