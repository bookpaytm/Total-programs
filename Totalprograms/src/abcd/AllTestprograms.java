package abcd;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllTestprograms {
	
	
	
	
	
public static WebDriver driver;
@Test(priority=1)
public void launchbrowser(){
	System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
	driver=new ChromeDriver();
	
}

@Test(priority=2)
public void Verifygoogle(){
driver.get("https://www.google.com/");
String page=driver.getTitle();
System.out.println(page);
Assert.assertEquals("Google", driver.getTitle());
}
@Test(priority=3)
public void closebrowser(){
driver.close();
}

}
