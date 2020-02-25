package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chromeprogram {
	
	
	
	

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.id("tdb1")).click();
String url=driver.getCurrentUrl();
if(url.equals("http://www.gcrit.com/build3/admin/index.php")){
	System.out.println("program is sucessfully run");
}

else{
	System.out.println("program is not run");
}

		
driver.close();	

	}
	

}
