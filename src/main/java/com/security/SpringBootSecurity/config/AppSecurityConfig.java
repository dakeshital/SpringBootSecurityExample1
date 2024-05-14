package com.security.SpringBootSecurity.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	// In Memory Authentication
//	@Override
//	@Bean
//	protected UserDetailsService userDetailsService() {
//		List<UserDetails> users = new ArrayList<>();
//		users.add(User.withDefaultPasswordEncoder()
//				.username("Shital")
//				.password("Shital123")
//				.roles("USER")
//				.build());
//		return new InMemoryUserDetailsManager(users);
//		
//	}

	// ORM Authentication

//	@Autowired
//	private UserDetailsService userDetailsService;
//
//	@Bean
//	public AuthenticationProvider authProvider() {
//
//		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//		provider.setUserDetailsService(userDetailsService);
//		provider.setPasswordEncoder(new BCryptPasswordEncoder());
//		return provider;
//	}

	// Custom Login Form Authentication with mysql orm
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		http.csrf().disable()
//		.authorizeRequests().antMatchers("/login").permitAll()
//		.anyRequest().authenticated()
//		
//		.and()
//		.formLogin()
//		.loginPage("/login").permitAll()
//		
//		.and()
//		.logout()
//		.clearAuthentication(true)
//		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//		.logoutSuccessUrl("/login").permitAll();
//
//	}

	// OAuth2 Authentication
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable()
		.authorizeRequests()
		.antMatchers("/login").permitAll()
		.anyRequest().authenticated();

	}

}
