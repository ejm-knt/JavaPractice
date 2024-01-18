package program17;

import java.io.FileWriter;
import java.io.IOException;

public class TryCatchMain {

	public static void main (String[] args) {

		try (FileWriter fw = new FileWriter("data.txt")) {
			fw.write("Hello!");
		} catch (IOException e) {
			System.out.println("何らかの例外が発生しました。");
		}

	}
}
