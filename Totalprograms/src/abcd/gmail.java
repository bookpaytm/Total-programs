package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.google.com");

//driver.findElement(By.linkText("Gmail")).click();
//driver.findElement(By.partialLinkText("G")).click();
String ab=driver.findElement(By.linkText("Gmail")).getText();
if(ab.equals("Gmail")){
	System.out.println("sucessfully");
}
else{
	System.out.println("fail");
}
//driver.close();
	}

}
