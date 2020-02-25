package abcd;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class APIcommands {

	public static void main(String[] args) throws InterruptedException   {
		
		
		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.id("tdb1")).click();
String url=driver.getCurrentUrl();
System.out.println(url);
System.out.println(driver.getTitle());
driver.navigate().to("http://www.gcrit.com/build3/admin/index.php");
System.out.println("another url");
String handle=driver.getWindowHandle();
System.out.println(handle);
driver.navigate().refresh();
System.out.println("refresh the page");
driver.navigate().forward();
System.out.println("forward the page");
driver.navigate().back();
System.out.println("back the page");
driver.findElement(By.name("username")).sendKeys("admin");
Thread.sleep(3000);
driver.findElement(By.name("username")).clear();
driver.navigate().to("https://www.google.com");
Boolean link=driver.findElement(By.linkText("Gmail")).isDisplayed();
System.out.println(link);
link=driver.findElement(By.linkText("Gmail")).isEnabled();
System.out.println(link);
driver.get("http://www.gcrit.com/build3/create_account.php");
//driver.findElement(By.name("newsletter")).click();
//driver.findElement(By.name("newsletter")).click();
//driver.findElement(By.name("newsletter")).isSelected();
WebElement checkbox=driver.findElement(By.name("newsletter"));
checkbox.click();
String browserhandle=driver.getWindowHandle();
System.out.println(browserhandle);
String pagesource=driver.getPageSource();
System.out.println(pagesource);

	}

}
