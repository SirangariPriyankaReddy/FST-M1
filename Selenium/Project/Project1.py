from selenium import webdriver 
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs")
    Actualtitle = driver.title 
    assert Actualtitle == 'Alchemy Jobs – Job Board Application', f"Expected title to be 'Alchemy Jobs – Job Board Application', but got '{Actualtitle}'"
    print("The Actual Title is:", Actualtitle)
   





