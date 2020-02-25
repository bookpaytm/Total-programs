package abcd;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Firsttestng {
	
	
	
	
	
	
public static WebDriver driver;	
@Test
public void verifygoogle(){
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
 driver=new ChromeDriver();
driver.get("https://www.google.com/");
Assert.assertEquals("Google", driver.getTitle());



}

}
