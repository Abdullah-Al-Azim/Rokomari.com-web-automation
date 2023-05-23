package testcases;

import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

import pages.RokomariHomePage;
import pages.SelectProductPage;
import pages.SignupUsingGooglePage;
import utilities.BaseDriverSetup;

public class SelectProductTest extends BaseDriverSetup{

	RokomariHomePage rokomariHomePage = new RokomariHomePage();
	SignupUsingGooglePage signupusinggoogle = new SignupUsingGooglePage();
	SelectProductPage selectproductpage = new SelectProductPage();
	
	
	@Test
	public void selectProdctTest() {
		getDriver().get(rokomariHomePage.homePageURLString);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		rokomariHomePage.clickOnElement(selectproductpage.poopUpBy);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		rokomariHomePage.hover(selectproductpage.authorHover);
		rokomariHomePage.clickOnElement(selectproductpage.authorName);
		rokomariHomePage.clickOnElement(signupusinggoogle.popUpClosingBy);
		rokomariHomePage.clickOnElement(selectproductpage.bookCategory);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		rokomariHomePage.takeScreenShot("Select a book category");
		rokomariHomePage.scrollToElemnt(selectproductpage.forScroll);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		rokomariHomePage.clickOnElement(selectproductpage.forNextPageBy);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		rokomariHomePage.hover(selectproductpage.hoverOnBooks);
		rokomariHomePage.clickOnElement(selectproductpage.addToCartBtn);
		rokomariHomePage.takeScreenShot("Add To Cart");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		rokomariHomePage.clickOnElement(selectproductpage.cartBtn);
		rokomariHomePage.clickOnElement(selectproductpage.proccedToBuyBy);
		rokomariHomePage.clickOnElement(selectproductpage.googleSignBtn);
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
		rokomariHomePage.takeScreenShot("Sending Pin");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		rokomariHomePage.clickOnElement(selectproductpage.cod);
		rokomariHomePage.takeScreenShot("Details Page");
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		rokomariHomePage.clickOnElement(selectproductpage.dropDown);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		rokomariHomePage.clickOnElement(selectproductpage.signOut);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		rokomariHomePage.takeScreenShot("Final Page");
	}
	
}
