package ProjectJob;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Project1Test {
    	WebDriver driver;
   
    	@BeforeClass
    	public void setUp() {
    		// Initialize Webdriver
    		driver = new FirefoxDriver();
    		// Open the page
    		driver.get("http://alchemy.hguy.co/jobs");
    		driver.manage().window().maximize();
    	}

    	@Test(priority = 1)
    	public void pageTitleTest() {
    		// Get the page title and verify it
    		Assert.assertEquals(driver.getTitle(), "Alchemy Jobs – Job Board Application", "Wrong Website");
    		
    	}
    	@AfterClass
    	public void browserClose() {
    		// close the browser
    		driver.quit();

    	}
    }
    	
    	




