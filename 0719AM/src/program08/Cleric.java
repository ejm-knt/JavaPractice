package program08;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;
	
	
	public void selfAid() {
		System.out.println(this.name + "は「セルフエイド」を唱えた。");
		
		if (this.mp < 5) {	
		System.out.println("MPが足らない！！！！");
		System.out.println("");
		} else {
		this.mp -= 5;
		this.hp = this.MAXHP;
		System.out.println("HPを最大まで回復した。(MP:" + this.mp +"/"+ this.MAXMP+")");
		System.out.println("");
		}
		
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "はここが戦場にも関わらず祈り始めた。");
		
		
		int heel = new Random().nextInt(3)+sec;
		this.mp += heel;
		
		if (this.mp >= this.MAXMP) {
			this.mp = this.MAXMP;
		}
		
		System.out.println(sec + "秒祈ったため、MPを" + heel + "回復します。(MP:" + this.mp + "/" + this.MAXMP + ")");
		System.out.println("");
		
		return heel;
	}
}
