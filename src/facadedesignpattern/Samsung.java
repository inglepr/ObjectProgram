package facadedesignpattern;
/*
 * Create a Samsung implementation class that will implement Mobileshop interface.
 */
public class Samsung implements MobileShop {

	@Override
	public void ModelNo() {
		System.out.println("Samsung galaxy tab 3 ");
		
	}

	@Override
	public void price() {
		System.out.println("Rs45000.00");
		
	}

}
