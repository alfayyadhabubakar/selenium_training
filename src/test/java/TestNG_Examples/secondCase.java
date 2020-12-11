package TestNG_Examples;

import org.testng.annotations.Test;

//Depends_On_Groups
public class secondCase {
	
	@Test(dependsOnMethods={"testcase3","testcase2"})
	public void testcase1()
	{
		System.out.println("This is test case1");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("This is test case2");
	}
	
	@Test
	public void testcase3()
	{
		System.out.println("This is test case3");
	}
	
	

}
