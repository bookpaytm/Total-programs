package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws Exception {

		

		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.gcrit.com/build3/admin/login.php");

driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.id("tdb1")).click();

driver.findElement(By.linkText("Online Catalog")).click();
driver.findElement(By.linkText("create an account")).click();
WebElement  radiobutton=driver.findElement(By.name("gender"));
boolean pa=radiobutton.isDisplayed();
pa=radiobutton.isEnabled();
pa=radiobutton.isSelected();
radiobutton.click();
Thread.sleep(3000);
pa=radiobutton.isSelected();
radiobutton.click();


	}

}
