package ProjectJob;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Project3Test {
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
	public void homePageTest() {
		WebElement headerImage = driver.findElement(By.xpath("//div/img")); 
    	String imageUrl = headerImage.getAttribute("src");
    	System.out.println("Header Image URL: " + imageUrl);
        
        // Assert page title
        Assert.assertEquals(imageUrl, "https://alchemy.hguy.co/jobs/wp-content/uploads/2019/09/career-corporate-job-776615-e1569782235456-1024x271.jpg");
		
	}
	@AfterClass
	public void browserClose() {
		// close the browser
		driver.quit();

	}
}




