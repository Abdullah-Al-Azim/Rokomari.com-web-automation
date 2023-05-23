package pages;

import org.openqa.selenium.By;

public class SignupUsingGooglePage extends BasePage{
	public By hoverOnSignupBtn = By.xpath("//div[@class='dropdown user-menu']/a");
	public By googleBtnBy = By.xpath("//div[@class='login-dropdown']/div/button[2]");
	public By googleInputBy = By.xpath("//input[@type='email']");
	public By googleNextBtnBy = By.xpath("//div[@jsname='uybdVe']/div/div/div/div/div/div/button");
	public By googlePasswordBy = By.xpath("//input[@type='password']");
	public By googlePasswordNextBtnBy = By.xpath("//div[@id='passwordNext']/div/button");
	public By popUpClosingBy = By.xpath("//div[@id='js--notification-permission-modal']/button");
	
}
