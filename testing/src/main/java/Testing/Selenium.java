package Testing;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium {
	@BeforeTest
	public void Before(){
		System.out.println("Before Mathod ");
	}
	
	
	@Test
	public void Main3(){
		
		System.out.println("Selenium ");
	}
	
	
	@AfterTest
	public void After(){
		System.out.println("After Mathod ");
	}

}
