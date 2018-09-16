package testSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void testApp(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		System.out.println();
		
		driver.findElement(By.xpath("//*[@id='nav-link-shopall']/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone");
		
	}

}
