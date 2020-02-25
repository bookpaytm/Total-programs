package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrowser1 {

	
	
public static WebDriver driver;
public static int browser;
public static String browsername;
public static void main(String[] args){
	for(browser=1;browser<=2;browser++){
		if(browser==1){
			System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
			driver=new ChromeDriver();
			browsername="Chrome";
		}
		else if(browser==2){
			System.setProperty("webdriver.gecko.driver", "F:/geckodriver.exe");
			driver=new FirefoxDriver();
			browsername="Firefox";
		}
	driver.get("https://www.google.com");
	String page=driver.getTitle();
	System.out.println(page);
		
	}
}
	

	}


