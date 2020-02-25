package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Testcase1 {
	
	
	
	
	
	
public static void main(String[] args){
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
Pageobject login=PageFactory.initElements(driver, Pageobject.class);
driver.get("https://www.gcrit.com/build3/admin/login.php");
login.startapplication("admin", "admin@123");


}


}
