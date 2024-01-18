package program16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P_Main_16_2 {

	public static void main(String[] args) {
		P_Hero_16_2 hero1 = new P_Hero_16_2("斎藤");
		P_Hero_16_2 hero2 = new P_Hero_16_2("鈴木");
		
		List<P_Hero_16_2> heroList = new ArrayList<>();
		heroList.add(hero1);
		heroList.add(hero2);
		
		for (P_Hero_16_2 h : heroList) {
		System.out.println(h.getName());	
		}
		
		Map< P_Hero_16_2 , Integer> killScore = new HashMap<>();
		killScore.put(hero1, 3);
		killScore.put(hero2, 7);
		
		for (P_Hero_16_2 k : killScore.keySet()) {
			int value = killScore.get(k);
			System.out.println(k.getName() +"のkill数は"+ value);
			}
	}
}
