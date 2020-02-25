package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pageobject {
	
	
	
	
WebDriver driver;
public Pageobject(WebDriver driver){
	this.driver=driver;
	
}
@FindBy(name="username") WebElement user;
@FindBy(name="password") WebElement pass;
@FindBy(id="tdb1") WebElement button;
public  void startapplication(String uname,String upass){
	user.sendKeys(uname);
	pass.sendKeys(upass);
	button.click();
}



}
