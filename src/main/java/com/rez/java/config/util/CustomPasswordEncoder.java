package com.rez.java.config.util;

import org.springframework.security.crypto.password.PasswordEncoder;

//Spring forces us to use atleast one password encoder during authentication but we are authenticating using third party.
//So, this encoder is just a placeholder and does nothing but its existence is important. 
public class CustomPasswordEncoder implements PasswordEncoder {

	@Override
	public String encode(CharSequence rawPassword) {
		return rawPassword.toString();
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		return rawPassword.equals(encodedPassword);
	}

}
