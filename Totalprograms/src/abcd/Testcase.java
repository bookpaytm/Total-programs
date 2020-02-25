package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase {

	public static void main(String[] args) {
	
		
		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.gcrit.com/build3/admin/login.php");
Loginpagem abc=new Loginpagem(driver);
abc.typeuser("admin");
abc.typepass("admin@123");
abc.typebutton();

	}

}
