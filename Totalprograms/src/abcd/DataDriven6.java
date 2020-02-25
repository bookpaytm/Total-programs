package abcd;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven6 {
	public WebDriver driver;
@Test
public void adminlogin(String username,String password){
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys(username);
driver.findElement(By.name("password")).sendKeys(password);
driver.findElement(By.id("tdb1")).click();
String url=driver.getCurrentUrl();
Assert.assertEquals(url, "https://www.gcrit.com/build3/admin/index.php");
driver.close();

}
	
	

@DataProvider(name="testdata")
public Object[][] readExcel()  throws BiffException, IOException{	
File f=new File("C:\\Users\\salman\\Desktop\\exceldata.xlsx");
Workbook w=Workbook.getWorkbook(f);
Sheet s=w.getSheet("login");
int colums=s.getColumns();
int rows=s.getRows();
System.out.println(colums);
System.out.println(rows);
String inputData[][]=new String[rows][colums];
for(int i=0;i<rows;i++){
	for(int j=0;j<colums;j++){
		Cell c=s.getCell(j,i);
		inputData [i][j]=c.getContents();
		System.out.println(inputData[i][j]);
		
		
		
	}
}
return inputData;

}
}
