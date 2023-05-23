
# Rokomari.com Automation using using Page object Model

Live Allure Report: https://gleeful-concha-84e4da.netlify.app/

Project Video: https://www.youtube.com/watch?v=a6gno9j5qqo&t=68s

## Technology used

* Test tool: Selenium Webdriver
* Language: Java
* Architecture: POM
* Framework: TestNG
* IDE: Eclipse

## Pre Requisites:
* Open/install Java JDK 16 version on your PC
* Install Maven on your PC
* Install TestNG on your IDE
* Install Eclipse/STS or any other IDE
* Setup Java, Maven environment on your PC
* Chrome Browse

## Requirements:
* Set Configure build path libraries with JRE System Library 1.8 or above
* Create a .env file in home directory and write...


```bash
    email = "Enter your G-suit gmail address"  
    pass = "Enter your email password"  
    name = "Enter your gmail name"  
    coustomer_name = "Enter Product recipients name"  
    number = "Enter Product recipients phone number"
```
    
 ## The Steps executed in these Automation are:
 ### TestCase 01: HomePage   
* Open the chrome browser
* Go to Rokomari Web Site
* Maximize the browser window
* Wait for complete Pageload
* verify site url and site title
* Take a screenshot

### TestCase 02: SignUpWithGoogle
* Hover on Sign In button
* click on Sign up with Google button
* Perform testng
* Provide gmail credential and complete Sign up/ Sign IN
* Take a screenshot

### TestCase 03: Select product, add to cart and sign out
* Hover on লেখক & click-on রবীন্দ্রনাথ ঠাকুর 
* Wait for Complete Pageload
* Fileter Category by selecting চিরায়ত উপন্যাস
* Scroll down and and click on next for move to nextpage
* Wait for Complete Pageload
* Select the fourth book on the page to add-to-card
* Perform testng
* Take screenshot
* Click cart icon to go-to My-cart page
* Wait for Complete Pageload
* Take screenshot
* Click on Go to Shipping Page Button
* Wait for Complete Pageload
* Select COD as payment option
* Take screenshot
* Click on User Name Button
* Click on User sign Out Button from drop-down
* Take Screenshot
* Close browser

## Run the script:
* Right Click on testng.xml file
* Then select Run as TestNG
* Run the Cases
* Close the program

## Authors

- [@Azim](https://github.com/Abdullah-Al-Azim)

