package facadedesignpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {
	public static int choice;
public static void main(String args[]) throws NumberFormatException, IOException {
do {
	System.out.println("=========MobileShop=========");
	System.out.println("1.Iphone           \n");
	System.out.println("2.Samsung           \n ");
	System.out.println("3.BlackBerry          \n ");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    choice=Integer.parseInt(br.readLine());  
    ShopKeeper sk=new ShopKeeper();  

	switch(choice) {
	case 1:{
		sk.iphoneSale();
	
		}	
	break;
	
	case 2:
	{
		sk.blackberrySale();
	
		}
		break;
	case 3:{
			sk.samsungSale();
			}
		break;
	
default:  
{    
    System.out.println("Nothing You purchased");  
}         
    return;  
}  
  }while(choice!=4);
}}
