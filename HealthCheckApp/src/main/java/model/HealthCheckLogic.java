package model;

public class HealthCheckLogic {

	public void execute(Health health) {
		// BMI算出 → BMIに設定
		double weight = health.getWeight();
		double height = health.getHeight();
		double bmi = weight / (height /100.0 * height /100.0 );
		
		// 桁数指定メソッドの参考リンク
		// https://camp.trainocate.co.jp/magazine/java-double-int-string/#:~:text=%E3%82%8A%E3%81%BE%E3%81%99%E3%81%AD%E3%80%82-,%E2%91%A1double%E5%9E%8B%E3%81%AE%E5%9B%9B%E6%8D%A8%E4%BA%94%E5%85%A5,-Java%E3%81%A7%E5%9B%9B%E6%8D%A8%E4%BA%94%E5%85%A5
		bmi = Math.round(bmi*100.0)/100.0;
		
		health.setBmi(bmi);
		
		// BMI指数から体型判断 → 体型に設定
		String bodyType;
		
		if(bmi <18.5) {
			bodyType = "痩せ型";
		} else if (bmi < 25) {
			bodyType = "普通";
		} else {
			bodyType = "肥満";
		}
		
		health.setBodyType(bodyType);
	}

}
