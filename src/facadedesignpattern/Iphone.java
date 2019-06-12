package facadedesignpattern;
/*
 * Create a Iphone implementation class that will implement Mobileshop interface.
 */
public class Iphone implements MobileShop{

	@Override
	public void modelNo() {
	System.out.println("iphone6");
		
	}

	@Override
	public void price() {
		System.out.println("10000");
		
	}

}