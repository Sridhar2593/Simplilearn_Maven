package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {

	
	@Test
	public void Testcase1() {
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.simplilearn.com/");
		
	}
	
	@Test
	public void Testcase2() {
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.saucedemo.com/");
		
	}
}

