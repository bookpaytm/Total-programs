package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Batchtesting {
	
	
	
	
public static WebDriver driver;
public  void launchbrowser(){
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
}
public   void closebrowser(){
	driver.close();
}
public void adminlogin(String uname,String upwd){
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys(uname);
driver.findElement(By.name("password")).sendKeys(upwd);
driver.findElement(By.id("tdb1")).click();
}
public static void main(String[] args) {
	Batchtesting obj=new Batchtesting();
	obj.launchbrowser();
	obj.adminlogin("admin", "admin@123");
	obj.closebrowser();
		
	}

}
