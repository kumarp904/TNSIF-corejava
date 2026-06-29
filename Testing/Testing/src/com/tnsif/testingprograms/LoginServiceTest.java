package com.tnsif.testingprograms;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LoginServiceTest {
@Test
	void loginTest() {
	LoginService I=new LoginService();
	boolean result=I.login("Kumar", "1234");
	System.out.println("login ststus "+result);
	
	assertTrue(result);
}
}
