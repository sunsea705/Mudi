package br.com.alura.mvc.mudi.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
@SuppressWarnings("deprecation")
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		.antMatcher("/**")
        .authorizeRequests()
        .antMatchers("/", "/login**","/callback/", "/webjars/**", "/css/**", "/error**")
        .permitAll()
        .anyRequest()
        .fullyAuthenticated()
        .and()
        .formLogin().loginPage("/login")
        .defaultSuccessUrl("/home")
        .usernameParameter("username")
        .passwordParameter("password");
	}
	
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {	 
		System.out.println("AAA");
		UserDetails user = User.withDefaultPasswordEncoder()
				.username("root")
				.password("root")
				.roles("ADM")
				.build();
		System.out.println("bbb");
		return new InMemoryUserDetailsManager(user);
	}
}