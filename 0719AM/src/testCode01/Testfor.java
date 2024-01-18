package testCode01;

public class Testfor {

	public static void main(String[] args) {
		String typeWord;
		System.out.println("文字入力をどうぞ");	
		
		for (int i = 0; i < 10; i++) {
			typeWord = new java.util.Scanner(System.in).nextLine();
			if (typeWord.equals("ピザ")) {
				System.out.println("続けて文字入力をどうぞ");				
				System.out.println("カウント" + i);
			} else {
				i--;
				System.out.println("カウント" + i);
			}
		}
		
	}
}
