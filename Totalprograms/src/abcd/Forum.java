package abcd;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Forum {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//driver.manage().window().fullscreen();
driver.get("http://www.gcreddy.com/forum/");
driver.findElement(By.linkText("Register")).click();
driver.findElement(By.name("agreed")).click();
driver.findElement(By.name("username")).sendKeys("parveen1");
driver.findElement(By.name("email")).sendKeys("parveena12@gmail.com");
driver.findElement(By.name("new_password")).sendKeys("parveena12");
driver.findElement(By.name("password_confirm")).sendKeys("parveena12");
Select dropdown=new Select(driver.findElement(By.name("lang")));
dropdown.selectByVisibleText("British English");
Select dropdown1=new Select(driver.findElement(By.name("tz_date")));
dropdown1.selectByIndex(3);
//Select dropdown2=new Select(driver.findElement(By.name("tz")));
//dropdown2.selectByIndex(3);
System.out.println("enter captach");
Scanner scan=new Scanner(System.in);
String captcha=scan.nextLine();
driver.findElement(By.id("confirm_code")).sendKeys(captcha);
Thread.sleep(2000);
driver.findElement(By.id("submit")).click();
System.out.println("captcha is sucessfully submit");


	}
	

}
