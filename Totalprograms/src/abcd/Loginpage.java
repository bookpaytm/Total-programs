package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
System.setProperty("webdriver.chrome.driver","F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/");
driver.findElement(By.linkText("login")).click();
driver.findElement(By.name("email_address")).sendKeys("parveena1@gamil.com");
driver.findElement(By.name("password")).sendKeys("parveena1");
driver.findElement(By.id("tdb5")).click();
String message=driver.getCurrentUrl();
System.out.println(driver.getCurrentUrl());
if(message.equals("http://www.gcrit.com/build3/index.php")){
	System.out.println("login is sucess");
}
else{
	System.out.println("login is failed");
}
driver.close();
	}

}
