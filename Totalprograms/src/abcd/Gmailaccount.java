package abcd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Drm%26ogbl&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
//driver.findElement(By.name("firstName")).sendKeys("mogal");
driver.findElement(By.name("lastName")).sendKeys("paranavi");
driver.findElement(By.id("username")).sendKeys("mparanavi@gmail.com");
driver.findElement(By.name("Passwd")).sendKeys("parveen123");
driver.findElement(By.name("ConfirmPasswd")).sendKeys("parveen123");
driver.findElement(By.xpath("//*[@id='accountDetailsNext']")).click();
WebElement a=driver.findElement(By.name("firstName"));
a.sendKeys("parveen");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

}
