package TestNGTestCases;

import org.testng.annotations.Test;
import BasePack.BaseClass;

public class GoogleSearchTestCases extends BaseClass {
	
	@Test(invocationCount = 10, threadPoolSize = 4)
	public void enterText()
	{
		System.out.println("Text Entered in Thread = " + Thread.currentThread().getId());
	}
	
	@Test
	public void enterText_01()
	{
		System.out.println("Text Entered in Thread = " + Thread.currentThread().getId());
	}

}
