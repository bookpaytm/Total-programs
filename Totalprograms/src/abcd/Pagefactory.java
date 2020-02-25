package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pagefactory {
	
	
	
WebDriver driver;
By user=By.name("username");
By pass=By.name("password");
By button=By.id("tdb1");
public void statrtapp(WebDriver driver){
	this.driver=driver;
	
}
public void admin(String uname){
driver.findElement(user).sendKeys(uname);
}
public void passwor(String upass){
	driver.findElement(pass).sendKeys(upass);
}
public void login(){
	driver.findElement(button).click();
}

}
