from selenium import webdriver 
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs")
   # Print the title of the page
        
    actual_job_link_text = driver.find_element(By.LINK_TEXT,"Jobs")
    actual_job_link_verify = actual_job_link_text.text
    actual_job_link_text.click()
    assert driver.current_url == 'https://alchemy.hguy.co/jobs/jobs/'
    print("The Actual browser title is:", actual_job_link_verify)
    # Search for job
    search_box = driver.find_element(By.CSS_SELECTOR,"input#search_keywords")
    search_box.send_keys('Test QA')
    search_box.send_keys(Keys.RETURN)

    #Wait
    driver.implicitly_wait(5)

    # Click on the first job listing 
    first_job = driver.find_element(By.XPATH, "(//h3)[1]") 
    first_job.click()

    #Wait
    driver.implicitly_wait(5)

    #Apply for job
    apply_job = driver.find_element(By.CSS_SELECTOR,"input.application_button.button")
    apply_job.click()

    get_email_id = driver.find_element(By.CSS_SELECTOR,"a.job_application_email")
    get_email_id_verify = get_email_id.text
    print("The Email Job :" + get_email_id_verify)
