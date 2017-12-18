package web.mapper;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import web.domain.User;
@Repository
public class UserLogin implements UserLoginMapper{

	@Override
	public User loginName(String username) {
		// TODO Auto-generated method stub
		User user = new User() ;
		user.setUsername(username);
		String password = "123";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);
		user.setPassword(hashedPassword);
		return user;
	}

}
