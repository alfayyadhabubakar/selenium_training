package TestNG_Examples;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class softAssertion {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void hardAssertion()
	{
		Assert.assertEquals("pass", "pass");
		
		System.out.println("This line is executed because assertEquals " 
			    + "passed as both the strings are same"); 
		
		Assert.assertNull("assertion"); 
	    System.out.println("Since the object under assertion" 
	    + " is not null, the assertion will fail. " 
	    + "This line will not be executed"); 
	}
	
	@Test 
    public void softAsssertion(){ 
     
    softAssert.assertNull("assertion"); 
    System.out.println("We are using Soft assertion in this method," 
    + " so this line of code will also be executed even if " 
    + "the assetion fails.Wherever we want to execute full " 
    + "testcase/method, we should use SoftAssertion"); 
    softAssert.assertAll(); 
    } 


}
