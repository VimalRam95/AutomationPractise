package objectsandmethods;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressesPageObjects extends BasePage
{
	public DressesPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement smalltxt;
	
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement mediumtxt;
	
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
	private WebElement largetxt;
	
	@FindBy(xpath = "//*[@class='columns-container']/div/div[3]/div[2]/h1/span[2]")
	private WebElement number;
	
	@FindBy(xpath = "//*[@class='columns-container']/div/div[3]/div[2]/ul/li")
	private List<WebElement> count;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
	private WebElement firstitem;
	
	@FindBy(xpath = "//*[@name='Submit']/span")
	private WebElement addcartclick;
	
	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	private WebElement check;
	
	@FindBy(xpath = "//*[@id='product_3_13_0_0']/td[2]/p/a")
	private WebElement checkout;
	
	public WebElement small()
	{
		return smalltxt;
	}

	public WebElement medium()
	{
		return mediumtxt;
	}
	
	public WebElement large()
	{
		return largetxt;
	}
	
	public int numberfromdisplay()
	{
		String positions = number.getText();
		String[] v = positions.split(" ");
		positions = v[2];
		int value = Integer.parseInt(positions);
		return value;
	}
	
	public int getcount()
	{
		return count.size();
	}
	
	public WebElement addtocart()
	{
		return firstitem;
	}
	
	public WebElement clickaddcart()
	{
		return addcartclick;
	}
	
	public WebElement outcheck()
	{
		return check;
	}
	
	public WebElement check()
	{
		return checkout;
	}
}
