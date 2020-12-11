package TestNG_Examples;

import org.testng.annotations.Test;

public class groups {
	
	@Test(groups= {"Software Company"})
	public void infosys()
	{
		System.out.println("Infosys");
	}
	
	@Test(groups= {"Telecommunication Company"})
	public void technip()
	{
		System.out.println("Technip India Ltd");
	}
	
	@Test(groups= {"Software Company"})
	public void wipro()
	{
		System.out.println("Wipro");
	}

}
