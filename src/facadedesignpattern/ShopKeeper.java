package facadedesignpattern;
/*
 * Create a ShopKeeper concrete class that will use MobileShop interface.
 */


public class ShopKeeper  {

	  private MobileShop iphone;  
	    private MobileShop samsung;  
	    private MobileShop blackberry;  
	      
	    public ShopKeeper(){  
	        iphone= new Iphone();  
	        samsung=new Samsung();  
	        blackberry=new Blackberry();  
	    }  
	    public void iphoneSale(){  
	        iphone.ModelNo();  
	        iphone.price();  
	    }  
	        public void samsungSale(){  
	        samsung.ModelNo();  
	        samsung.price();  
	    }  
	   public void blackberrySale(){  
	    blackberry.ModelNo();  
	    blackberry.price();  
	        }  
	}  