package repositories;

import domain.User;

public interface UserRepository {


	User checkEmail(String email);   
	User checkLogin(String login);	 
	void add(User user);
	;
	
}
