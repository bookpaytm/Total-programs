package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpagem {

	
	
	

WebDriver driver;
By user=By.name("username");
By pass=By.name("password");
By button=By.id("tdb1");
public  Loginpagem(WebDriver driver){
	this.driver=driver;
}
public void typeuser(String uname){
	driver.findElement(user).sendKeys(uname);
}
public void typepass(String upass){
	driver.findElement(pass).sendKeys(upass);
}
public void typebutton(){
	driver.findElement(button).click();
}

}
