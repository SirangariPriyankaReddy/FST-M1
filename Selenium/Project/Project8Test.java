package ProjectJob;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Project8Test {
    WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new FirefoxDriver();
    }

    @Test
    public void loginToBackend() {
        // Open the website backend
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

        // Find the username field and enter the username
        WebElement usernameField = driver.findElement(By.id("user_login"));
        usernameField.sendKeys("root");

        // Find the password field and enter the password
        WebElement passwordField = driver.findElement(By.id("user_pass"));
        passwordField.sendKeys("pa$$w0rd");

        // Find the login button and click it
        WebElement loginButton = driver.findElement(By.id("wp-submit"));
        loginButton.click();

        // Verify that the login is successful by checking if the Dashboard is visible
        WebElement dashboardHeader = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
        Assert.assertTrue(dashboardHeader.isDisplayed(), "Login failed: Dashboard is not displayed.");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
