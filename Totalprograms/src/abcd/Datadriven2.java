package abcd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadriven2 {

	
	
	
	
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
	
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
FileReader f=new FileReader("C:/Users/salman/Desktop/webdriver.txt");
BufferedReader br=new BufferedReader(f);
int a=0;
int b=0;
String line;
while((line=br.readLine())!=null){
	a=a+1;
	b=b+1;
	if(a>0){
		String [] input=line.split(",",16);
		driver=new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys(input[0]);
		driver.findElement(By.name("password")).sendKeys(input[1]);
		driver.findElement(By.id("tdb1")).click();
		driver.navigate().to("http://www.gcrit.com/build3/create_account.php");
		WebElement radiobutton=driver.findElement(By.name(input[2]));
		radiobutton.click();
		driver.findElement(By.name("firstname")).sendKeys(input[3]);
		driver.findElement(By.name("lastname")).sendKeys(input[4]);
		driver.close();
	}
}

	}

}
