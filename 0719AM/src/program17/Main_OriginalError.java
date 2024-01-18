package program17;

public class Main_OriginalError {

	public static void main(String[] args) {
		try {
			throw new OriginalError("未対応のファイルです。");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
