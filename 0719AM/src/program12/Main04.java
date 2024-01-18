package program12;

public class Main04 {
	
	public static void main(String[] args) {
		
		Monster[] monsters = new Monster[3];
		
		monsters[0] = new Slime(100,'A');
		monsters[1] = new Goblin(100,'A');
		monsters[2] = new DeathBat(100,'A');
		
		for (Monster m : monsters) {
			m.run();
		}
		
	}
}
