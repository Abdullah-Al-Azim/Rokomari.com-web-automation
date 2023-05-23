package testcases;

import static org.testng.Assert.assertEquals;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.RokomariHomePage;
import utilities.BaseDriverSetup;

public class RokomariHomePageTest extends BaseDriverSetup{

	RokomariHomePage rokomariHomePage = new RokomariHomePage();
	
	@Test
	public void homePageTitle() throws InterruptedException {
		getDriver().get(rokomariHomePage.homePageURLString);
		assertEquals(getDriver().getTitle(), rokomariHomePage.homePageTitle);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 try {
	            getDriver().findElement(By.xpath("//div[@id='js--entry-popup']/div/button")).click(); // replace with the actual popup close button locator
	        } catch (Exception e) {
	            System.out.println("Popup not found!");
	        }
		 Thread.sleep(3000);
		 
		 rokomariHomePage.takeScreenShot("Rokomari Home Page");
	}
	
}
