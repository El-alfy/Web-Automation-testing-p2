package Tests;

import org.testng.annotations.Test;

import pages.Login;


public class LoginTEST extends TestsBase {
	
	
    @Test
    public void validlogin()throws InterruptedException{
		
	    Login Login_TC = new Login(driver) ;
	       
	    Login_TC.send_validUserName();
		Thread.sleep(2000);
		Login_TC.send_validPassword();
		Thread.sleep(2000);
		Login_TC.press_Btnlogin();
		Thread.sleep(2000);
}
}
