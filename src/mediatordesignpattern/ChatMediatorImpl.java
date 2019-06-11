package mediatordesignpattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
private List<User>user;
	

	public ChatMediatorImpl() {
		this.user=new ArrayList<>();	}
	@Override
	public void sendMessage(String msg, User uesr) {
		for(User user1:this.user) {
			if(user1!=user) {
				user1.recive(msg);
			}
		}
	}

	@Override
	public void addUser(User user) {
	this.user.add(user);
		
	}
	

}
