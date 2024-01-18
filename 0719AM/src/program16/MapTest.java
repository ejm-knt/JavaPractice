package program16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String,Integer> prefs = new HashMap<String,Integer>();
		
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は、" + tokyo);
		
		//prefs.remove("京都府");
		prefs.put("熊本県", 182);
		
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は、" + kumamoto);
		
		for (String p : prefs.keySet()) {
			int value = prefs.get(p);
			System.out.println(p + "の人口は" + value);
		}
		
		//String型の都道府県をkey、各都道府県の特産品をListを値とするMapの宣言
		Map<String , List<String>> prefsList = new HashMap<>();
		
		//各都道府県お特産品リストを格納するリスト
		List<List<String>> product = new ArrayList<>();
		
		//特産品リストに東京の特産品リストを格納する
		List<String> tokyoProduct = new ArrayList<>();
		
		product.add(tokyoProduct);
		
		prefsList.put("東京都", product.get(0));
		
	}

}
