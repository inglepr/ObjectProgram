package addressbook;
/**
* 	@purpose     :  To hold address all the operation of address book  
*  @author       :  Priya ingle
*
***/
import com.bridgelabz.util.Utilityobject;
import addressbook.AddressBookManager;
public class Menu 
{
	public static void addressMenu(boolean value)
	{
	try {
		while(value)
		{
			System.out.println("Enter the choice:");
			System.out.println("1. Create New Address Book");
			System.out.println("2. Add Person");
			System.out.println("3. Edit Person");
			System.out.println("4. Remove Person");
			System.out.println("5. Sort entries by name");
			System.out.println("6. Sort entries by zip");
			System.out.println("7. Print entries");
			System.out.println("8. Save Address Book");
			System.out.println("9.Save As Address Book");
			System.out.println("10.Quit Program");
			
			int n=Utilityobject.getInteger();
			switch(n)
			{
				case 1:	AddressBookManager.addnewCustomerBook();
						break;
					
				case 2: AddressBookManager.addPersonInAddressBook();
						break;
						
				case 3:	AddressBookManager.updatePersonInAddressBook();
						break;						
						
				case 4: AddressBookManager.removePersonInAddressBook();
						break;
					
				case 5:	AddressBookManager.sortAddressBookByName();
						break;
						
				case 6: AddressBookManager.sortAddressBookByzipCode();;
						break;
					
				case 7: AddressBookManager.printAddressBook();
						break;
					
				case 8: AddressBookManager.saveAddressBook();
						break;
						
				case 9: AddressBookManager.saveAsAnotherAddressBook();		
						break;
						
				case 10: System.out.println("\nApplication stopped!\n"); 
						value = false;
						break;
						
						
				default: System.out.println("invalid choice... try again");
						
			}	
		}	
	}
	catch(NullPointerException e)
	{
		System.out.println("\nNo AddressBook opened currently!");
	}
	
}

}

