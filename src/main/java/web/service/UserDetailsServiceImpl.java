package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import static java.util.Collections.emptyList;

import web.domain.User;
import web.mapper.UserLogin;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
    private UserLogin userLogin;

    // 通过构造器注入MyUserRepository
    public UserDetailsServiceImpl(UserLogin userLogin) {
        this.userLogin = userLogin;
    }
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User myUser = userLogin.loginName(username);
        if(myUser == null){
            throw new UsernameNotFoundException(username);
        }
        return new org.springframework.security.core.userdetails.User(myUser.getUsername(), myUser.getPassword(), emptyList());
    }
}
