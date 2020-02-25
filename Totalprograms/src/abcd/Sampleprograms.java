package abcd;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleprograms {

public static void main(String[] args) throws Exception {
		      
		
		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.get("http://www.google.com");
//driver.findElement(By.linkText("Gmail")).click();
String url=driver.getCurrentUrl();
System.out.println(url);
String title=driver.getTitle();
System.out.println(title);
driver.navigate().to("https://www.gcrit.com/build3/admin/login.php");
System.out.println(driver.getCurrentUrl());
driver.navigate().back();
driver.navigate().forward();
System.out.println("forward is completed");
Thread.sleep(1000);
driver.close();


	}

}

