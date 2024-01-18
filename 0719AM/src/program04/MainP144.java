package program04;

public class MainP144 {

	public static void main(String[] args) {
		// 点数管理プログラム (P144 コード4-1) → 配列不使用版
		
		int sansu = 20;
		int kokugo = 30;
		int rika = 40;
		int eigo = 50;
		int syakai = 80;
		
		int sum = sansu + kokugo + rika + eigo + syakai;
		int avg = sum / 5;
		
		System.out.println(sum);
		System.out.println(avg);
		
		//教科を追加する際に 代入宣言 と sum と avg の内容を変更しないといけずめんどい
	}

}
