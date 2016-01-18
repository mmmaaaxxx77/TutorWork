package johnny.tutor.homework.model;

import java.util.ArrayList;
import java.util.List;

public class UserModelImpl implements UserModel{

	private List<User> users = new ArrayList<User>();
	private static UserModel instance = new UserModelImpl();
	
	public static UserModel getInstance() {
		return instance;
	}
	
	public UserModelImpl() {
		super();
		this.users.add(new User("johnny", "pwd1"));
		this.users.add(new User("candy", "pwd2"));
		this.users.add(new User("rainie", "pwd3"));
	}

	@Override
	public List<User> getUsers() {
		return this.users;
	}

	@Override
	public User getUser(String name) {
		for(User u : users){
			if(u.getName().equals(name))
				return u;
		}
		return null;
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public void deleteUser(String name) {
		for(User u : users){
			if(u.getName().equals(name))
				users.remove(u);
		}
	}

}
