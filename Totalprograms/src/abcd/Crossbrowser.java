package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrowser {

	
	
	
	
public static WebDriver starapp(WebDriver driver,String browser,String appurl){
	if(browser.equals("Chrome")){
	System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
	driver=new ChromeDriver();
	
	}
 else if(browser.equals("Firefox")){
	System.setProperty("webdriver.gecko.driver", "F:/geckodriver.exe");
	driver=new FirefoxDriver();
		
	}
 else{
	 System.out.println("it is not other browser");
 }
driver.get(appurl);
return driver;
	
}
}
