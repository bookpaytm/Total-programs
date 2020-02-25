package abcd;



import java.util.List;
import java.util.concurrent.SynchronousQueue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Elementhandling {

	public static void main(String[] args) {
		
		
		
		
System.setProperty("webdriver.chrome.driver","F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/create_account.php");
//driver.findElement(By.name("gender")).click();
driver.findElement(By.name("gender")).isDisplayed();
System.out.println("radion button displed" );
driver.findElement(By.name("gender")).isSelected();
WebElement radio=driver.findElement(By.name("gender"));
radio.click();
WebElement checkbox=driver.findElement(By.name("newsletter"));
checkbox.click();
boolean a=driver.findElement(By.name("country")).isDisplayed();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
Select dropdown=new Select(driver.findElement(By.name("country")));
dropdown.selectByVisibleText("Haiti");
List e=dropdown.getOptions();
System.out.println(e.size());





	}

}
