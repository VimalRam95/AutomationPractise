package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import objectsandmethods.BasePage;
import objectsandmethods.HomePageObjects;

public class HomePageTest {
	
	HomePageObjects hp;
	BasePage bp;
	
	public HomePageTest()
	{
		hp = new HomePageObjects();
		bp = new BasePage();
	}
	
	@Test
	public void verifywomantab()
	{
		Assert.assertTrue(bp.elementFound(hp.tabwoman()), "Failed");;
	}

	@Test
	public void verifydressestab()
	{
		Assert.assertTrue(bp.elementFound(hp.tabdresses()), "Failed");
	}
	
	@Test
	public void verifytshirttab()
	{
		Assert.assertTrue(bp.elementFound(hp.tabtshirts()), "Failed");
	}
	
	@Test
	public void verifywomanlink()
	{
		hp.tabwoman().click();
		String w = hp.tabwoman().getText();
		Assert.assertTrue(w.contains("WOMEN"), "Failed");
	}
	
	@Test
	public void verifydresseslink()
	{
		hp.tabdresses().click();
		String d = hp.tabdresses().getText();
		Assert.assertTrue(d.contains("DRESSES"), "Failed");
	}
	
	@Test
	public void verifytshirtlink()
	{
		hp.tabtshirts().click();
		String ts = hp.tabtshirts().getText();
		Assert.assertTrue(ts.contains("T-SHIRTS"), "Failed");
	}
	
	@Test
	public void verifynewsletteremailtab() 
	{
		hp.newsletter("mnopqr1374@yahoo.com");
		hp.emailclick().click();
		String email = hp.mailconfirm().getText();
		Assert.assertTrue(email.contains("successfully"), "Failed: Not valid email id");
	}
	
	
}
