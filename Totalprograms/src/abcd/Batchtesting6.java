package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Batchtesting6 {
	
	
	
	
	
public static WebDriver driver;
public void lunchbrowser(){
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
}
public void closebrowser(){
	driver.close();
}
public void adminlogin(String uname,String upass){
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys(uname);
driver.findElement(By.name("password")).sendKeys(upass);
driver.findElement(By.id("tdb1")).click();
}
public static void main(String[] args) {
Batchtesting6 obj=new Batchtesting6();
obj.lunchbrowser();
obj.adminlogin("admin", "admin@123");
obj.closebrowser();
System.out.println("batchtesting program is sucessfully completed");

	}

}
