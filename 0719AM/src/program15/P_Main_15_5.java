package program15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class P_Main_15_5 {

	public static void main(String[] args) {
		
		//現在時刻の取得
		LocalDateTime now = LocalDateTime.now();
		
		//日付を100日後にする
		LocalDateTime future = now.plusDays(100);
		
		//指定された書式に変換する
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(future.format(fmt));
	}
}
