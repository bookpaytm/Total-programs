package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagefactorytestcase {

	public static void main(String[] args) {
		//
		
		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
Pagefactory login=new Pagefactory();
login.admin("admin");
login.passwor("admin@123");
login.login();

	}

}
