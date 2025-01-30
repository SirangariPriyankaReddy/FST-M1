from selenium import webdriver 
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs")
    actual_image_src = driver.find_element(By.CSS_SELECTOR,"img.attachment-large.size-large.wp-post-image");
    actual_image_src_verify = actual_image_src.get_attribute('src')

    
    # Verify the title 
    assert actual_image_src_verify == 'https://alchemy.hguy.co/jobs/wp-content/uploads/2019/09/career-corporate-job-776615-e1569782235456-1024x271.jpg', f"Expected title to be 'https://alchemy.hguy.co/jobs/wp-content/uploads/2019/09/career-corporate-job-776615-e1569782235456-1024x271.jpg', but got '{actual_image_src_verify}'"
    print("The Actual image src is:", actual_image_src_verify)