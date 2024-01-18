package program13;

public class P_Wizard_13 {
	private int hp;
	private int mp;
	private String name;
	private P_Wand_13 wand;
	                
	public void heal (P_Hero_13 h) {
		int basePoint = 10;	//基本回復ポイント
		
		int recovPoint = (int)(basePoint * this.getWand().getPower());	//杖による増幅
		
		h.setHp(h.getHp() + recovPoint);	//勇者のHPを回復する
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name.length() < 3 || name == null) {
			throw new IllegalArgumentException("3文字以上入力してください");
		}		
		
		this.name = name;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		
		if(hp < 0) {
			hp=0;
		}
		
		this.hp = hp;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		
		if(mp < 0) {
			throw new IllegalArgumentException("mpが0以下だぜ");	
		}
		
		this.mp = mp;
	}

	public P_Wand_13 getWand() {
		return wand;
	}


	public void setWand(P_Wand_13 wand) {
		if(wand == null) {
			throw new IllegalArgumentException("wand がnullだぜ");
		}
		
		this.wand = wand;
	}
	
	
}
