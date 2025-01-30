from selenium import webdriver 
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs")
   # Print the title of the page
        
    actual_job_link_text = driver.find_element(By.LINK_TEXT,"Jobs")
    actual_job_link_verify = actual_job_link_text.text
    actual_job_link_text.click()
    assert driver.current_url == 'https://alchemy.hguy.co/jobs/jobs/'
    print("The Actual browser title is:", actual_job_link_verify)