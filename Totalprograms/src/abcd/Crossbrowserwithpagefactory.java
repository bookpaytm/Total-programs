package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrowserwithpagefactory {
	
	
	
	
	
public static WebDriver driver;
public static void startapp(WebDriver driver,String browser,String appurl){
	if(browser.equals("Chrome")){
		System.setProperty("webdriver.chrome.driver","F:/chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	else if(browser.equals("Firefox")){
		System.setProperty("webdriver.chrome.driver", "F:/Firefoxdriver.exe");
		driver=new FirefoxDriver();
		
	}
	driver.get(appurl);
}

}
