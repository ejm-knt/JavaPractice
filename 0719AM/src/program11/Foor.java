package program11;

public class Foor extends Character implements Human {
	
	public Foor(String name) {
		super(name);
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わず遊んでいる");
	}

	public void talk() {
	
	}

	@Override
	public void watch() {
		
	}

	@Override
	public void hear() {
			
	}
	
	
	
}
