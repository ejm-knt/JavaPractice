package program04;

public class MainP163 {

	public static void main(String[] args) {
		// 従来のfor文
		/*
		int[] scores = {10,20,30,40,50};
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		*/
		
		// 拡張for文
		int[] scores = {10,20,30,40,50,60};
		
		for (int value : scores) {
			System.out.println(value);
		}

	}

}
