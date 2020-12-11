package TestNG_Examples;

import org.testng.annotations.Test;

public class enabled {
	
	@Test(enabled=false)
	public void c_language()
	{
		System.out.println("C Language");
	}
	
	@Test(enabled=false)
	public void jira()
	{
		System.out.println("JIRA is a testing tool");
	}
	
	@Test
	public void java()
	{
		System.out.println("Java Language");
	}

}
