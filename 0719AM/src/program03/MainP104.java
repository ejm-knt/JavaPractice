package program03;

public class MainP104 {

	public static void main(String[] args) {
		//繰り返し文の命令処理(P104 コード3-2)
		boolean doorClose = true;

		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
			doorClose = false;
		}

		System.out.println("トイレに入る");

	}

}
