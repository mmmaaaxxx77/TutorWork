package johnny.tutor.homework.service;

import johnny.tutor.homework.model.User;
import johnny.tutor.homework.model.UserModel;
import johnny.tutor.homework.model.UserModelImpl;

public class LoginServiceImpl implements LoginService{

	@Override
	public boolean login(String name, String pw) {
		UserModel model = UserModelImpl.getInstance();
		User user = model.getUser(name);
		if(user != null){
			if(user.getPassword().equals(pw))
				return true;
			else
				return false;
		}
		return false;
	}

}
