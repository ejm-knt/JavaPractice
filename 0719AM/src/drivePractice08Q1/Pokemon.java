package drivePractice08Q1;

public class Pokemon {
	private String name;
	private int hp;

	public Pokemon(String name , int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
