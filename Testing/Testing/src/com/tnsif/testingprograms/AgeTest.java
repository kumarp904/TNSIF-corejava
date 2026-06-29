package com.tnsif.testingprograms;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



public class AgeTest {
	@ParameterizedTest
	@ValueSource(ints= {18,49,8,21,56})
	
	void agetest(int age) {
		boolean result=age >=18;
		
		System.out.println(age+" Eligiable: "+ result);
		
		//assertTrue(result);
		assertFalse(result);
	}
}
