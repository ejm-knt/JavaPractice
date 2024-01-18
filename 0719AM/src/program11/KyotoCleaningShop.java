package program11;

public class KyotoCleaningShop implements CleaningService {
	String ownername;
	String address;
	String phone;
	
	public Shirt washShirt(Shirt s) {
		return s;
	}
	
	public Towl washTowl(Towl t) {
		return t;
	}
	
	public Coat washCoat(Coat c) {
		return c;
	}
}
