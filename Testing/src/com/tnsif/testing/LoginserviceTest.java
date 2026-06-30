package com.tnsif.testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LoginserviceTest {

	@Test
	        void loginTest(){
	                Loginservice l=new Loginservice();
	                
	                boolean result= l.login("rashmi", "1234");
	                System.out.println("login status "+result);
	                
	               assertTrue(result);
	                
	        }
	}
	

