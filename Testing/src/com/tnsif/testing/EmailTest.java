package com.tnsif.testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EmailTest {


@ParameterizedTest
        @ValueSource(strings= {
                        "usergamil.com",
                        "kumar@gmail.com",
                        "harish@gmail.com"
                        
        })
        void emailtest(String email) {
                boolean result=email.contains("@");
                
                System.out.println(email+" :"+result);
                
                assertTrue(result);
        }
        
        
}
