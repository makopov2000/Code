package com.example.unix.junit;

//import static org.junit.Assert.assertEquals;
///*from  ww  w .j  av  a 2  s .  c om*/
//import java.util.Arrays;
//import java.util.Collection;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//@RunWith(Parameterized.class)
//public class TestJunit {
//     private Integer inputNumber;
//     private Boolean expectedResult;
//     private BusinessLogic logic;
//
//     @Before
//     public void initialize() {
//        logic = new BusinessLogic();
//     }
//
//     public TestJunit(Integer inputNumber, 
//        Boolean expectedResult) {
//       System.out.println("TestJunit-> inputNumber:"+inputNumber+" expectedResult:"+expectedResult);
//        this.inputNumber = inputNumber;
//        this.expectedResult = expectedResult;
//     }
//
//     @Parameterized.Parameters
//     public static Collection primeNumbers() {
//       System.out.println("primeNumbers() is called");
//        return Arrays.asList(new Object[][] {
//           { 2, true },
//           { 6, false },
//           { 19, true },
//           { 22, false },
//           { 23, true }
//        });
//     }
//
//     @Test
//     public void testPrimeNumberChecker() {
//        System.out.println("Parameterized Number is : " + inputNumber);
//        assertEquals(expectedResult, logic.validate(inputNumber));
//     }
//
//}
//
// class BusinessLogic {
//	  public Boolean validate(final Integer primeNumber) {
//		  System.out.println("BusinessLogic() is called: "+primeNumber);
//	    for (int i = 2; i < (primeNumber / 2); i++) {
//	      if (primeNumber % i == 0) {
//	        return false;
//	      }//from   w w  w .ja v a 2  s.  c  o  m
//	    }
//	    return true;
//	  }
//	}