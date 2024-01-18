package program03;

public class MainP102 {

	public static void main(String[] args) {
		//天気による行動の変化をJavaで表す命令式(P102 コード3－1)
		//晴れなら洗濯、散歩
		//雨なら、家でDVD
		//		boolean whether = true;
		//		if(whether == true){
		//			System.out.println("洗濯をする");
		//			System.out.println("散歩をする");
		//		}else {
		//			System.out.println("DVDを見る");
		//		}		

		//応用編(勝手に作った)
		//文字を入力させて「晴」だったら「洗濯して散歩」
		//「雨」だったら「DVD見る」
		//「晴、雨以外」だったら「ぼーっとする」と出力するようにする
		System.out.println("今日の天気は？");
		String whether = new java.util.Scanner(System.in).nextLine();

		if (whether.equals("晴")) {
			System.out.println("洗濯をする");
			System.out.println("散歩をする");
		} else if (whether.equals("雨")) {
			System.out.println("DVDを見る");
		} else {
			System.out.println("ぼーっとする");
		}

	}

}
