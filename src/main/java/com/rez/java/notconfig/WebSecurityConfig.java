//package com.rez.java.notconfig;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.rez.java.config.util.CustomPasswordEncoder;
//
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled=true)
////@Profile("prod")
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	private static final String PATH_IGNORED = "/v2/**";
//
//
////	@Autowired
////	private CustomGmailAuthenticationProvider gmailAuthenticationProvider;
////
////	@Override
////	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////		auth.authenticationProvider(gmailAuthenticationProvider);
////	}
//
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//
//		web
//		.ignoring()
//		.antMatchers(PATH_IGNORED,"/public/**");
//	}
//
//	@Override
//	@Bean
//	public AuthenticationManager authenticationManagerBean() throws Exception {
//		return super.authenticationManagerBean();
//	}
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new CustomPasswordEncoder();
//	}
//	
//	@Bean
//	public ObjectMapper mapper() {
//		return new ObjectMapper();
//	}
//	
//}
