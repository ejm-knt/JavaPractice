package program16;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黃");
		colors.add("赤");
		System.out.println("色は" + colors.size() + "種類");
		
		for (String c : colors) {
		System.out.print(c + "→");	
		}
		
		System.out.println("");
		
		Set<String> words = new TreeSet<String>();
		words.add("cinder");
		words.add("dead");
		words.add("apple");
		words.add("easy");
		words.add("blue");
		
		for (String w : words) {
			System.out.print(w + "→");	
		}
	}

}
