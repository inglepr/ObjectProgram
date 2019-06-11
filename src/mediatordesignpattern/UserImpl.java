package mediatordesignpattern;

public class UserImpl extends User {

	public UserImpl(ChatMediator med, String name) {
		super(med, name);
	
	}

	@Override
	public void send(String msg) {
		System.out.println("send  massege"+this.name);
		
	}

	@Override
	public void recive(String msg) {
	System.out.println("recive massege"+this.name);	
		
	}

}
