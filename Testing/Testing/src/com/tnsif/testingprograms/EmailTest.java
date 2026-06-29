package com.tnsif.testingprograms;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EmailTest {
	@ParameterizedTest
	@ValueSource(strings= {
			"user@gmail.com",
			"kumar@gmail.com",
			"abhi@gmail.com",
			"harish@gmail.com"
			})
	void emailtest(String email) {
		boolean result=email.contains("@");
		System.out.println("Email "+result);
		
		assertTrue(result);
	}

}
