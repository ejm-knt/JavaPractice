package program14;

public class P_Main_14_1 {

	public static void main(String[] args) {
		Account a1 = new Account("4649",1592);
		Account a2 = new Account(" 4649",1592);
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
		System.out.println(a1.equals(a2));
		
	}

}
