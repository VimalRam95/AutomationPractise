package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import objectsandmethods.BasePage;
import objectsandmethods.DressesPageObjects;
import objectsandmethods.HomePageObjects;

public class DressPageTest {
	
	HomePageObjects hp;
	DressesPageObjects dp;
	BasePage bp;
	
	public DressPageTest()
	{
		hp = new HomePageObjects();
		dp = new DressesPageObjects();
		bp = new BasePage();
	}

	@Test
	public void clickdresses()
	{
		hp.tabdresses().click();
		String d1 = hp.tabdresses().getText();
		Assert.assertTrue(d1.contains("DRESSES"), "Failed");
	}
	
	@Test
	public void small()
	{
		Assert.assertTrue(bp.elementFound(dp.small()),"Failed");
	}
	
	@Test
	public void medium()
	{
		Assert.assertTrue(bp.isElementVisible(dp.medium()), "Failed");
	}
	
	@Test
	public void large()
	{
		Assert.assertTrue(bp.isElementVisible(dp.large()), "Failed");
	}
	
	@Test
	public void verifycount() 
	{
		Assert.assertTrue(dp.numberfromdisplay() == dp.getcount(), "Failed: Not Equal");
	}
	
	@Test
	public void zverifyaddtocart()
	{
		dp.addtocart().click();
		dp.clickaddcart().click();
		dp.outcheck().click();
		String atc = dp.check().getText();
		Assert.assertTrue(atc.contains("Printed Dress"), "Failed to add ");
	}
}
