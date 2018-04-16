package com.example.learn_project.utils;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.learn_project.errors.MyAccesDenienHandler;

@Configuration
public class LoginHandler extends WebSecurityConfigurerAdapter {

	@Autowired
	private MyAccesDenienHandler accessDeniedHandler;

	@Autowired
	private DataSource dataSource;

	
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
				.authorizeRequests()
					.antMatchers("/*").fullyAuthenticated()
				.and()
				.formLogin()
					.loginPage("/")
					.defaultSuccessUrl("/main", true)
					.usernameParameter("user_name").passwordParameter("user_password")
					.permitAll()
				.and()
				.logout()
					.invalidateHttpSession(true)
					.clearAuthentication(true)
					.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
					.logoutSuccessUrl("/?logout")
					.permitAll()
				.and()
				.exceptionHandling().accessDeniedHandler(accessDeniedHandler).accessDeniedPage("/");
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery("SELECT user_name, user_password, 1 AS ENABLED FROM app_user WHERE user_name = ?")
				.authoritiesByUsernameQuery("SELECT user_name, role_id FROM app_user WHERE user_name = ?");
	}

}