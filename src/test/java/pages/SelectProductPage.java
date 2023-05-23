package pages;

import org.openqa.selenium.By;

public class SelectProductPage extends BasePage{

	public By authorHover = By.xpath("//a[@id='js--authors']");
	public By authorName = By.xpath("//a[text()=' রবীন্দ্রনাথ ঠাকুর ']");
	public By bookCategory = By.xpath("//label[@for='rok-filter-categoryIds-678']");
	public By forScroll = By.xpath("//div[@class='pagination']");
	public By forNextPageBy = By.xpath("//a[text()='Next']");
	public By addToCartBtn = By.xpath("//div[@class='cart-btn-area']/button");
	public By hoverOnBooks = By.xpath("//div[@class='book-list-wrapper ']");
	public By cartBtn = By.xpath("//a[@id='js-cart-menu']");
	public By proccedToBuyBy = By.xpath("//a[@id='js-continue-to-shipping']");
	public By inputPhone = By.xpath("//input[@id='phone-number']");
	public By sendPin = By.xpath("//input[@value='Send PIN']");
	public By submitPin = By.xpath("//input[@value='Submit PIN']");
	public By poopUpBy = By.xpath("//div[@id='js--entry-popup']/div/button");
	public By cod = By.xpath("//label[@for='cod']");
	public By googleSignBtn = By.xpath("//div[@class='btn-wrapper']/button[2]");
	public By dropDown = By.xpath("//a[@id='dropdownMenu2']");
	public By signOut = By.xpath("//a[text()=' Sign Out ']");
	
	
}
