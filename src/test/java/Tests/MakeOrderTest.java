package Tests;

import org.testng.annotations.Test;

import pages.MakeOrder;

public class MakeOrderTest extends TestsBase {

	
	@Test
	public void order()throws InterruptedException{
		
		MakeOrder item = new MakeOrder(driver) ;
		
		item.press_menuBtn();
		Thread.sleep(2000);
		item.press_crossBtn();
		Thread.sleep(2000);
		item.press_item1fromdiscreption();
		Thread.sleep(2000);
		item.press_ADDITEM1();
		Thread.sleep(2000);
		item.press_backtoproductsbtn();
		Thread.sleep(2000);
		item.press_bikelight();
		Thread.sleep(2000);
		item.press_boltshirt();
		Thread.sleep(2000);
		item.press_fleecejacket();
		Thread.sleep(2000);
		item.press_onesieshirt();
		Thread.sleep(2000);
		item.press_redshirt();
		Thread.sleep(2000);
		item.press_cart();
		Thread.sleep(2000);
		item.press_continueshoppingbtn();
		Thread.sleep(2000);
		item.press_cart();
		Thread.sleep(2000);
		
	}
}
