package objectsandmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage
{
	
	public HomePageObjects()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@title='Women'] [@class='sf-with-ul']")		//     "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement womantab;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dressestab; 
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement tshirtstab;
	
	@FindBy(xpath = "//ul[contains(@class, 'menu-content')]/li[2]/a")
	private WebElement dresseslink;
	
	@FindBy(xpath = "//input[@id='newsletter-input']")
	private WebElement newslettertab;
	
	@FindBy(name = "submitNewsletter")						//	(xpath = "//*[@name='submitNewsletter']")
	private WebElement iconclick;
	
	@FindBy(xpath = "//*[@class='alert alert-success']")
	private WebElement notification;
	
	public WebElement tabwoman()
	{
		return womantab;
	}
	
	public WebElement tabdresses()
	{
		return dressestab;
	}

	public WebElement tabtshirts()
	{
		return tshirtstab;
	}
	
	public void newsletter(String mail) 
	{
		 newslettertab.sendKeys(mail);
	}
	
	public WebElement emailclick() 
	{
		return iconclick;
		
	}
	
	public WebElement mailconfirm() 
	{
		return notification;
	
	}
	
}
