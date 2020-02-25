package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Secondtestng {
	
	
	
	
	
public static WebDriver driver;
@Test(priority=1)
public void launchbrowser(){
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
driver=new ChromeDriver();

}
@Test(priority=3)
public void closebrowser(){
	driver.close();
}
@Test(priority=2)
public void Verifygoogle(){
	driver.get("https://www.google.com");
	Assert.assertEquals("Google", driver.getTitle());
}

}
