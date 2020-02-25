package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Accountprogram {

	public static void main(String[] args) {


		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/");
driver.findElement(By.linkText("create an account")).click();
driver.findElement(By.name("gender")).click();
driver.findElement(By.name("firstname")).sendKeys("parveena");
driver.findElement(By.name("lastname")).sendKeys("mogall");
driver.findElement(By.name("dob")).sendKeys("09/09/1995");
driver.findElement(By.name("email_address")).sendKeys("parveena1@gamil.com");
driver.findElement(By.name("company")).sendKeys("google1");
//driver.findElement(By.tagName("Your Address")).getText();
driver.findElement(By.name("street_address")).sendKeys("k.k.peta1");
driver.findElement(By.name("suburb")).sendKeys("hyderabad1");
driver.findElement(By.name("postcode")).sendKeys("517172");
driver.findElement(By.name("city")).sendKeys("banglore1");
driver.findElement(By.name("state")).sendKeys("Andhrapradesh1");
Select dropdown=new Select(driver.findElement(By.name("country")));
dropdown.selectByVisibleText("India");
driver.findElement(By.name("telephone")).sendKeys("9989999999");
driver.findElement(By.name("fax")).sendKeys("123456");
WebElement checkbox=driver.findElement(By.name("newsletter"));
checkbox.click();
driver.findElement(By.name("password")).sendKeys("parveena1");
driver.findElement(By.name("confirmation")).sendKeys("parveena1");
driver.findElement(By.id("tdb4")).click();
String message=driver.findElement(By.tagName("h1")).getText();
if(message.equals("Your Account Has Been Created!")){
	System.out.println("passed");
}
else{
	System.out.println("failed");
}



	}

}
