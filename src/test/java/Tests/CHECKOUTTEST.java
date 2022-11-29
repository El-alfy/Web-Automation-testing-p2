package Tests;

import org.testng.annotations.Test;

import pages.CHECKOUT;


public class CHECKOUTTEST extends TestsBase{

	@Test
	public void checkout()throws InterruptedException{
		
		CHECKOUT check =new CHECKOUT(driver);
		
		check.press_remove_saucebackpack();
		Thread.sleep(2000);
		check.press_remove_boltshirt();
		Thread.sleep(2000);
		check.press_remove_onesie();
		Thread.sleep(2000);
		check.press_checkoutbtn();
		Thread.sleep(2000);
		check.press_continuebtn();
		Thread.sleep(2000);
		check.send_firstname();
		Thread.sleep(2000);
		check.send_lastname();
		Thread.sleep(2000);
		check.send_postelcode();
		Thread.sleep(2000);
		check.press_continuebtn();
		Thread.sleep(2000);
		check.press_cancelbtn();
		Thread.sleep(2000);
		check.press_cart();
		Thread.sleep(2000);
		check.press_checkoutbtn();
		Thread.sleep(2000);
		check.send_firstname();
        Thread.sleep(2000);
		check.send_lastname();
		Thread.sleep(2000);
		check.send_postelcode();
		Thread.sleep(2000);
		check.press_continuebtn();
		Thread.sleep(2000);
		check.press_finishbtn();
		Thread.sleep(2000);
		check.press_backhomebtn();
		Thread.sleep(2000);
		check.press_menuBtn();
		Thread.sleep(2000);
		check.press_logoutbtn();
	}
}
