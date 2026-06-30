package com.tnsif.testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

//UPI or payment gateway testing
public class PaymentTest {

	        @RepeatedTest(5)
	        
	        void paymentTest() {
	                
	                boolean server=true;
	                System.out.println("payment server :"+server);
	                
	                assertTrue(server);
	        }
}
