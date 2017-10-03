package com.curso.microservicios._Seguridad;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ConfiguracionSeguridad extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//super.configure(http);
		
		//http.authorizeRequests().antMatchers("/**").authenticated();
		http.authorizeRequests().antMatchers("/").hasAnyRole("WRITE")
		.and()
		.httpBasic();
	}
	
	/*@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("victor").password("victor").roles("READ","WRITE").disabled(false)
			.and()
			.withUser("juan").password("juan").roles("READ").disabled(false);
	}*/
	
}
