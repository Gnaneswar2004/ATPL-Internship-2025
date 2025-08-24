package com.aaslin.SpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String hash = encoder.encode("admin123");
		System.out.println(hash);
		String s = encoder.encode("user123");
		System.out.println(s);
		SpringApplication.run(SpringSecurityApplication.class, args);
	}
}