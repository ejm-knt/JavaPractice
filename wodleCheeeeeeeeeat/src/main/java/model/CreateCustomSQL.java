package model;

import java.util.List;

public class CreateCustomSQL{
	private String[] green;
	private List<YellowSpell> yellow;
	private String gray;
	
	public CreateCustomSQL(String[] green, List<YellowSpell> yellow,String gray) {
		this.green = green;
		this.yellow = yellow;
		this.gray = gray;
	}

	public String SeachSQL (String[] greens, List<YellowSpell> yellow,String gray) {
		// 最終的なSQL文になる変数を定義
		StringBuilder sql = new StringBuilder();
		
		// 黄色SQL文作成インスタンス
		LikeSwitchPattern likePattern = new LikeSwitchPattern();

		// 灰色SQL文作成インスタンス
		GrayRegexPattern regexPattern = new GrayRegexPattern();
		
		// 黄色SQL作成デバック
//				YellowSpell ys = new YellowSpell(1, "a");
//				yellow.add(ys);
		
		//SQL命令文 緑分(LIKE '_ _ _ _ _')
		sql.append("SELECT * FROM WORDLEWORDS WHERE WORD LIKE '");
		for(int i = 0; i <greens.length; i++) {
			if (greens[i].equals("_")) {
				sql.append("_");
			} else {
				sql.append(greens[i]);
			}
		}
		
		sql.append("'");
		
		// 黄色分がLISTに格納されていれば、黄色SQL作成
		sql.append(likePattern.execute(yellow));
		
		// 灰色分が存在すれば、灰色SQL作成
		sql.append(regexPattern.execute(gray));
		
		// 最後に未重複単語を降順で上に来るようDECSを付す
		sql.append(" ORDER BY ALL_SPELL_DIFFERENT DESC LIMIT 100");
	
		return sql.toString();
	}
	
	
	public String[] getGreen() {
		return green;
	}

	public void setGreen(String[] green) {
		this.green = green;
	}

	public List<YellowSpell> getYellow() {
		return yellow;
	}

	public void setYellow(List<YellowSpell> yellow) {
		this.yellow = yellow;
	}

	public String getGray() {
		return gray;
	}

	public void setGray(String gray) {
		this.gray = gray;
	}

}
