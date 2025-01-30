from selenium import webdriver 
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs")
    actual_heading = driver.find_element(By.CLASS_NAME,"entry-title");
    actual_heading_text = actual_heading.text

    
    # Verify the title 
    assert actual_heading_text == 'Welcome to Alchemy Jobs', f"Expected title to be 'Welcome to Alchemy Jobs', but got '{actual_heading_text}'"
    print("The Actual Heading is:", actual_heading_text)
   