package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MakeOrder extends PagesBase {

	public MakeOrder(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	private By 	menuBtn = By.id("react-burger-menu-btn");
	public void press_menuBtn() {
	driver.findElement(menuBtn).click();
	}
	
	private By 	crossBtn = By.id("react-burger-cross-btn");
	public void press_crossBtn() {
	driver.findElement(crossBtn).click();
	}
	
	private By 	item1fromdiscreption = By.className("inventory_item_name");
	public void press_item1fromdiscreption() {
	driver.findElement(item1fromdiscreption).click();
	}
	

	private By 	ADDITEM1 = By.id("add-to-cart-sauce-labs-backpack");
	public void press_ADDITEM1() {
	driver.findElement(ADDITEM1).click();
    }
	
	private By 	backtoproductsbtn = By.id("back-to-products");
	public void press_backtoproductsbtn() {
	driver.findElement(backtoproductsbtn).click();
	}
	
	private By 	bikelight = By.id("add-to-cart-sauce-labs-bike-light");
	public void press_bikelight() {
	driver.findElement(bikelight).click();
	}
	
	private By 	boltshirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	public void press_boltshirt() {
	driver.findElement(boltshirt).click();
	}
	
	private By 	fleecejacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
	public void press_fleecejacket() {
	driver.findElement(fleecejacket).click();
	}
	
	private By 	onesieshirt = By.id("add-to-cart-sauce-labs-onesie");
	public void press_onesieshirt() {
	driver.findElement(onesieshirt).click();
	}
	
	private By 	redshirt = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	public void press_redshirt() {
	driver.findElement(redshirt).click();
	}
	
	private By 	cart = By.className("shopping_cart_link");
	public void press_cart() {
	driver.findElement(cart).click();
	}
	
	private By 	continueshoppingbtn = By.id("continue-shopping");
	public void press_continueshoppingbtn() {
	driver.findElement(continueshoppingbtn).click();
	}
}