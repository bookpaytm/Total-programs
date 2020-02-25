package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
driver.findElement(By.linkText("Create account")).click();
String url=driver.getCurrentUrl();
if(!url.contains("https://en.wikipedia.org/")){
	System.out.println("wikipedia is sucess");
}
else{
	System.out.println("is failure");
}
driver.navigate().back();
driver.navigate().to("https://selenium.dev/");
String url2=driver.getCurrentUrl();
if(url2.contains("https://en.wikipedia.org/")){
	System.out.println("passed");
}
else{
	System.out.println("failed");
}
	}

}
