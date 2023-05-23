package pages;

import org.openqa.selenium.By;

public class RokomariHomePage extends BasePage{

	public String homePageURLString = "https://www.rokomari.com/";
	public String homePageTitle = "Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com";
	public By closePopUpButton = By.xpath("//button[contains(@class, 'popup-modal close')]");
}
