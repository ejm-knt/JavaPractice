package program02;

public class MainP73 {

	public static void main(String[] args) {
		//代入演算子(P73 - 表2-5の練習)
		//加算
		int addTest = 10;
		addTest += 10;
		System.out.println(addTest);
		
		//減算
		int	subtractionTest = 10;
		subtractionTest -= 10;
		System.out.println(subtractionTest);
		
		//乗算
		int multiplyTest = 10;
		multiplyTest *= 10;
		System.out.println(multiplyTest);

		//除算
		int dividedTest = 10;
		dividedTest /= 10;
		System.out.println(dividedTest);
		
		//剰余演算(剰余：remainder)
		int remainderTest = 10;
		remainderTest %= 10;
		System.out.println(remainderTest);
		
		//よく使う剰余演算
		int remainderTest2 = 10;
		remainderTest2 %= 2;
		//この下にif文とか入れて偶数奇数判断をする(多分)
		System.out.println(remainderTest2);

		int remainderTest3 = 11;
		remainderTest3 %= 2;
		System.out.println(remainderTest3);
	}

}
