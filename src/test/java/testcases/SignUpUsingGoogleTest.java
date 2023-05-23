package testcases;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.RokomariHomePage;
import pages.SignupUsingGooglePage;
import utilities.BaseDriverSetup;

public class SignUpUsingGoogleTest extends BaseDriverSetup{
	RokomariHomePage rokomariHomePage = new RokomariHomePage();
	SignupUsingGooglePage signupusinggoogle = new SignupUsingGooglePage();
	
	@Test
	public void signUpWithGoogle() {
		getDriver().get(rokomariHomePage.homePageURLString);
		rokomariHomePage.hover(signupusinggoogle.hoverOnSignupBtn);
		rokomariHomePage.clickOnElement(signupusinggoogle.googleBtnBy);
		rokomariHomePage.writeText(signupusinggoogle.googleInputBy, "17182103074@cse.bubt.edu.bd");
		rokomariHomePage.clickOnElement(signupusinggoogle.googleNextBtnBy);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		rokomariHomePage.writeText(signupusinggoogle.googlePasswordBy, "iloveutillidie");
		rokomariHomePage.clickOnElement(signupusinggoogle.googlePasswordNextBtnBy);
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		rokomariHomePage.clickOnElement(signupusinggoogle.popUpClosingBy);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		rokomariHomePage.takeScreenShot("Rokomari After Login");
	}
}
