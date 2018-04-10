package repositories;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.User;

public class DummyUserRepository implements UserRepository{

	private static List<User> db = new ArrayList<User>();
	
	private void println(String string) {
		}
	

	@Override
	public User checkEmail(String email) {
		for(User user: db){
			println("An account with this e-mail address already exists!!!");
		}
		return null;
	}

	

	@Override
	public User checkLogin(String login) {
		for(User user: db){
			println("This user already exists!!!");
		}
		return null;
	}
	


	@Override
	public void add(User user) {
		db.add(user);
		
	}

	
}
