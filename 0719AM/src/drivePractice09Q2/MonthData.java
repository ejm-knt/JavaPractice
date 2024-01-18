package drivePractice09Q2;

import java.util.Map;
import java.util.Random;

public class MonthData {
	
	public MonthData(Map<Integer, Integer> calendarMonth) {
		int randNum; //月々に入る 0~999 のランダム値

		for (int i = 1; i <= 12; i++) {
			randNum = new Random().nextInt(1000);
			calendarMonth.put(i, randNum);
		}
	}
	
}
