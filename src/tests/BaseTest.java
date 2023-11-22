package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utils.utils;

public class BaseTest {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
    	//System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(utils.readProperty("url"));

}
	
	@AfterClass
	public void tearnDown () {
	driver.quit();
}
}