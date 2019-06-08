package facadedesignpattern;
/*
 * Create a Blackberry implementation class that will implement Mobileshop interface .
 */
public class Blackberry implements MobileShop{

	@Override
	public void ModelNo() {
		
		System.out.println("Blackberry Z 10 ");
			
	}

	@Override
	public void price() {
	System.out.println("50000 ");
		
		
	}

}
