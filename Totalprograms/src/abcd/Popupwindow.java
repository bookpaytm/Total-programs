package abcd;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupwindow {

	public static void main(String[] args) throws Exception {
		// TODO 

		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.findElement(By.name("proceed")).click();
Alert pop=driver.switchTo().alert();
System.out.println(pop);
String error=pop.getText();
System.out.println(error);
Thread.sleep(5000);
pop.accept();
	}
}
