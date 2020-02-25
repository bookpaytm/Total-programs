package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
System.setProperty("webdriver.chrome.driver","F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.gcrit.com/build3/admin/login");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.id("tdb1")).click();
String url=driver.getCurrentUrl();
System.out.println(url);
if(url.equals("http://www.gcrit.com/build3/admin/index.php")){
	System.out.println("sucess");
}
else{
	System.out.println("faill");
}
driver.close();
	}

}
