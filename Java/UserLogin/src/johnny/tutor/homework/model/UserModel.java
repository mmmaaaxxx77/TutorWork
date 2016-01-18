package johnny.tutor.homework.model;

import java.util.List;

public interface UserModel {
	public List<User> getUsers();
	public User getUser(String name);
	public void addUser(User user);
	public void deleteUser(String name);
}
