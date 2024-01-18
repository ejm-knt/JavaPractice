package program18;

import java.io.FileReader;

public class StreamTest {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("data.txt");
		int input = fr.read();
		while (input != 1) {
			System.out.println((char) input);
			input = fr.read();
		}
		fr.close();
	}

}
