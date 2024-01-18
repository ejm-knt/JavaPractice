package drivePractice09Q2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int selectMode = 0;

		Map<Integer, Map<Integer, Integer>> calendarYear = new HashMap<>();

		while (selectMode != 3) {
			System.out.print("1.データを作る,2.データを閲覧する,3.終了>");
			selectMode = new Scanner(System.in).nextInt();

			switch (selectMode) {
			case 1:
				makeData(selectMode, calendarYear);
				break;

			case 2:
				previewData(selectMode, calendarYear);
				break;

			case 3:
				System.out.println("アプリケーションを終了します。");
				return;
			}
		}
	}

	public static Map<Integer, Integer> makeMonthRandData() {
		int randNum; //月々に入る 0~999 のランダム値
		Map<Integer, Integer> calendarMonth = new HashMap<>();

		for (int i = 1; i <= 12; i++) {
			randNum = new Random().nextInt(1000);
			calendarMonth.put(i, randNum);
		}
		return calendarMonth;
	}

	public static void previewYearList(Map<Integer, Map<Integer, Integer>> calendarYear) {
		for (int cy : calendarYear.keySet()) {
			System.out.println("・" + cy);
		}
	}

	public static void displayYearData(Map<Integer, Map<Integer, Integer>> calendarYear, int selectYear) {
		
		for (int cm : calendarYear.get(selectYear).keySet()) {
			int value = calendarYear.get(selectYear).get(cm);
			System.out.println(cm + "月：" + value);
		}
	}

	public static void makeData(int selectMode, Map<Integer, Map<Integer, Integer>> calendarYear) {

		while (selectMode != 0) {
			System.out.print("何年度のデータを作成しますか(0:quit)>");
			selectMode = new Scanner(System.in).nextInt();

			if (selectMode == 0) {
				return;
			} else {
				calendarYear.put(selectMode, makeMonthRandData());
			}
		}

	}

	public static void previewData(int selectMode, Map<Integer, Map<Integer, Integer>> calendarYear) {

		while (selectMode != 0) {
			System.out.println("何年度のデータを閲覧しますか");
			previewYearList(calendarYear);

			System.out.println("年を4桁で入力してください(0:quit)>0");
			selectMode = new Scanner(System.in).nextInt();

			if (selectMode == 0) {
				return;
			} else {
				System.out.println("=====================================");
				System.out.println(selectMode + "年");
				displayYearData(calendarYear, selectMode);
				System.out.println("=====================================");
			}
		}
	}
}
