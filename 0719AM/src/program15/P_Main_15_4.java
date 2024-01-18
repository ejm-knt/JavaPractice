package program15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P_Main_15_4 {

	public static void main(String[] args) {
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		
		c.setTime(d);
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		day += 100;
		c.set(Calendar.DAY_OF_MONTH,day);
		
//		d = c.getTime();
		Date future = c.getTime();
		
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(future));
	}

}
