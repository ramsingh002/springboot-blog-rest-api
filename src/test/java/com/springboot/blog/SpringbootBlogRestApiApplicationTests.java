package com.springboot.blog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class SpringbootBlogRestApiApplicationTests {

	@Test
	void contextLoads() {
		//PasswordEncoder encoder = new BCryptPasswordEncoder();
		//System.out.println("User : "+encoder.encode("ramsingh"));
		//System.out.println("Admin : "+encoder.encode("admin"));
	}

}
