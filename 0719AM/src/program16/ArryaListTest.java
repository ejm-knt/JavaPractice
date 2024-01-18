package program16;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryaListTest {

	public static void main(String[] args) {
		
	String[] namesArray = new String[3];
	
	namesArray[0] = "えじま";
	namesArray[1] = "たなか";
	namesArray[2] = "ニャホニャホタマクロー";
	
	System.out.println(namesArray[1]);
	
	ArrayList<String> names = new ArrayList<String>();
	
	names.add("えじま");
	names.add("たなか");
	names.add("ニャホニャホタマクロー");
	
	System.out.println(names.get(2));
	
	ArrayList<Integer> points = new ArrayList<Integer>();
	points.add(10);
	points.add(80);
	points.add(75);
	
	for (int i : points) {
		System.out.println(i);
	}
	
	System.out.println(points.size());
	
	ArrayList<String> testNames = new ArrayList<String>();
	testNames.add("湊");
	testNames.add("朝香");
	testNames.add("菅原");
	
	Iterator<String> it = testNames.iterator();
	while (it.hasNext()) {
		String e = it.next();
		System.out.println(e);
	}
	
	}
}
