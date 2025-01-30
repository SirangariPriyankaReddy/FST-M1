from selenium import webdriver 
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs")
   # Print the title of the page
        
    actual_second_heading = driver.find_element(By.XPATH,"//h2")
    actual_second_heading_verify = actual_second_heading.text

    
    # Verify the title 
    assert actual_second_heading_verify == 'Quia quis non', f"Expected title to be 'Quia quis non', but got '{actual_second_heading_verify}'" # type: ignore
    print("The Actual second heading is:", actual_second_heading_verify)