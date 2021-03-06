package web.filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;  


@Configuration  
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired 
	private UserDetailsService userDetailsService;  
	@Autowired 
	private BCryptPasswordEncoder bCryptPasswordEncoder;  
	
	public WebSecurityConfig(UserDetailsService userDetailsService, BCryptPasswordEncoder bCryptPasswordEncoder) {  
	        this.userDetailsService = userDetailsService;  
	        this.bCryptPasswordEncoder = bCryptPasswordEncoder;  
	}  
    @Override  
    protected void configure(HttpSecurity http) throws Exception {  
        http.cors().and().csrf().disable().authorizeRequests()  
                .antMatchers("/", "/**").permitAll()  
                .anyRequest().authenticated()  
                .and()  
                .addFilter(new JWTLoginFilter(authenticationManager()))  
                .addFilter(new JWTAuthenticationFilter(authenticationManager()));  
    }  
  
    @Override  
    public void configure(AuthenticationManagerBuilder auth) throws Exception {  
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);  
    } 	

}
