package program17;

public class Person_17_11 {
	int age;
	
	public void setAge(int age) {
		
		if(age < 0) {
			throw new IllegalArgumentException("年齢は0以上の数を指定すべきです。指定値 =" + age);
		}
		
		this.age = age;
	}
	
}
