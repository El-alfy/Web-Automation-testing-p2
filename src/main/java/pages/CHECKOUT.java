package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CHECKOUT extends PagesBase {

	public CHECKOUT(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private By 	remove_saucebackpack = By.id("remove-sauce-labs-backpack");
	public void press_remove_saucebackpack() {
	driver.findElement(remove_saucebackpack).click();
	}
	
	private By 	remove_boltshirt = By.id("remove-sauce-labs-bolt-t-shirt");
	public void press_remove_boltshirt() {
	driver.findElement(remove_boltshirt).click();
	}
	
	private By 	remove_onesie = By.id("remove-sauce-labs-onesie");
	public void press_remove_onesie() {
	driver.findElement(remove_onesie).click();
	}
	
	private By 	checkoutbtn = By.id("checkout");
	public void press_checkoutbtn() {
	driver.findElement(checkoutbtn).click();
	}
	
	private By 	continuebtn = By.id("continue");
	public void press_continuebtn() {
	driver.findElement(continuebtn).click();
	}
	
	private By firstname = By.id("first-name");
	public void send_firstname() {
	driver.findElement(firstname).sendKeys("Mahmoud");	
	}
	
	private By lastname = By.id("last-name");
	public void send_lastname() {
	driver.findElement(lastname).sendKeys("EL-Alfy");	
	}
	
	private By postelcode = By.id("postal-code");
	public void send_postelcode() {
	driver.findElement(postelcode).sendKeys("2518");	
	}
	
	private By 	cancelbtn = By.id("cancel");
	public void press_cancelbtn() {
	driver.findElement(cancelbtn).click();
	}
	
	private By 	cart = By.className("shopping_cart_link");
	public void press_cart() {
	driver.findElement(cart).click();
	}
	
	private By 	finishbtn = By.id("finish");
	public void press_finishbtn() {
	driver.findElement(finishbtn).click();
	}
	
	private By 	backhomebtn = By.id("back-to-products");
	public void press_backhomebtn() {
	driver.findElement(backhomebtn).click();
	}
	
	private By 	menuBtn = By.id("react-burger-menu-btn");
	public void press_menuBtn() {
	driver.findElement(menuBtn).click();
	}
	private By 	logoutbtn = By.id("logout_sidebar_link");
	public void press_logoutbtn() {
	driver.findElement(logoutbtn).click();
	}
}
