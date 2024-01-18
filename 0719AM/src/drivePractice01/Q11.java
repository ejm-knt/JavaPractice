package drivePractice01;

public class Q11 {

	public static void main(String[] args) {
		//「Q11」クラスを作成し、
		//英語の１０月を入力させ、正しければ「OK!」間違っていれば「NG」と出力する。
		//（if~else文を使用すること）
		System.out.print("10月は英語で何?>");
		String month = new java.util.Scanner(System.in).nextLine();
		
		if (month.equals("October")) {
			System.out.println("OK!");
		} else {
			System.out.println("NG!");
		}
	}

}
