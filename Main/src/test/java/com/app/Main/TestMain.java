package com.app.Main;


import static org.junit.Assert.assertTrue;


import org.testng.annotations.Test;


public class TestMain {

   @Test 
   public void testInputIsEven(){
	   assertTrue(Main.checkIfInputIsEvenNumber(23));
   }

}
