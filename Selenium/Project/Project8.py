from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains
import time

# Set up the WebDriver (Chrome)
with webdriver.Firefox() as driver:
# Open the site
    driver.get("https://alchemy.hguy.co/jobs/wp-admin")

    # Find the username field and enter the username
    username_field = driver.find_element(By.ID, "user_login")
    username_field.send_keys("root")

    # Find the password field and enter the password
    password_field = driver.find_element(By.ID, "user_pass")
    password_field.send_keys("pa$$w0rd")

    # Find the login button and click it
    login_button = driver.find_element(By.ID, "wp-submit")
    login_button.click()

    # Wait for the page to load
    time.sleep(3)  # Adjust the sleep time if needed

    # Verify that the login was successful by checking if the Dashboard is visible
    try:
        dashboard_header = driver.find_element(By.XPATH, "//h1[contains(text(),'Dashboard')]")
        print("Login successful! Dashboard is displayed.")
    except:
        print("Login failed: Dashboard is not displayed.")

    # Close the browser
    driver.quit()
