package program15;

public class P_Main_15_2 {
		
	public String connectPath(String folder, String file) {
	
		if (!folder.endsWith("\\")) {
		folder += "\\";
		}
		
		return folder += file;
	}
}

