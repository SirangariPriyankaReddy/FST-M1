package ProjectJob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.Random;
import java.time.Duration;

public class Project9Test {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {

        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));  // Increased timeout to 20 seconds
    }

    @Test
    public void createJobListing() {
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        
        WebElement usernameField = driver.findElement(By.id("user_login"));
        usernameField.sendKeys("root");

        WebElement passwordField = driver.findElement(By.id("user_pass"));
        passwordField.sendKeys("pa$$w0rd");

        WebElement loginButton = driver.findElement(By.id("wp-submit"));
        loginButton.click();

        WebElement jobListingsMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#menu-posts-job_listing")));
        jobListingsMenu.click();

        WebElement addNewButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".page-title-action")));
        addNewButton.click();
        WebElement close_button = driver.findElement(By.xpath("//button[@type='button' and @aria-label='Close dialog']"));
        close_button.click();

        wait = new WebDriverWait(driver, Duration.ofSeconds(120));
    	WebElement jobTitle1 = driver.findElement(By.cssSelector("textarea.editor-post-title__input"));
    	String jobCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    	StringBuilder jobTitle = new StringBuilder(); 
    	Random random1 = new Random(); 
    	for (int i = 0; i < 10; i++) 
    	{ // Generate random string of 10 characters 
    		jobTitle.append(jobCharacters.charAt(random1.nextInt(jobCharacters.length()))); 
    		} 
    	String AppendText = "TestQA_";
    	String finalJobTitle = AppendText + jobTitle;
    	String jobTitle3 = finalJobTitle.toString();
    	
    	jobTitle1.sendKeys(jobTitle3);
		/*
		 * //Email id String characters =
		 * "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		 * StringBuilder email = new StringBuilder(); Random random = new Random(); for
		 * (int i = 0; i < 10; i++) { // Generate random string of 10 characters
		 * email.append(characters.charAt(random.nextInt(characters.length()))); }
		 * email.append("@example.com"); String emailInput = email.toString();
		 * 
		 * WebElement emailLocator = driver.findElement(By.id("create_account_email"));
		 * emailLocator.sendKeys(emailInput);
		 */
    	//company Website
    	WebElement companyWebsite = driver.findElement(By.name("_company_website"));
    	companyWebsite.click();
    	companyWebsite.sendKeys("ibm.com");
    	
    	WebElement companyName = driver.findElement(By.name("_company_name"));
    	companyName.click();
    	companyName.sendKeys("IBM");
    	
    	
    	//Publish
    	WebElement Publish = driver.findElement(By.cssSelector("a.components-button.editor-post-preview.is-secondary"));
    	Publish.click();
    	wait = new WebDriverWait(driver, Duration.ofSeconds(120));
    	
    	
		
		/*
		 * WebElement viewJob = driver.findElement(By.linkText("View Job"));
		 * viewJob.click(); wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 * WebElement verifyJobTitle = driver.findElement(By.xpath("//h1"));
		 */
    	
    	WebElement homePage = driver.findElement(By.xpath("//a[@aria-label='View Posts']"));
		homePage.click(); 
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement verifyJobTitle = driver.findElement(By.xpath("(//a[@class='tips job_title'])[1]"));
		 
    	String actualJobTitle = verifyJobTitle.getText();
    	System.out.println("Jobs Page Title is: " + actualJobTitle);	
    
        
        Assert.assertEquals(actualJobTitle, jobTitle3);
    }
   

    @AfterClass
    public void tearDown() {
        // Close the browser after the test
        driver.quit();
    }
}
