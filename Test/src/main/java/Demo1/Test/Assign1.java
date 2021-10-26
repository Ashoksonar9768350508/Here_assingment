package Demo1.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.security.KeyStore.TrustedCertificateEntry;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;

import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assign1 {

	public static void main(String[] args) throws IOException, Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/maps/"); 
		driver.manage().window().maximize();  
		WebDriverWait wait = new WebDriverWait(driver,30);
	    WebElement element = wait.until(
	                        ExpectedConditions.elementToBeClickable(By.xpath("//input[@autofocus=\"autofocus\"]")));
	    driver.findElement(By.xpath("//input[@autofocus=\"autofocus\"]")).click();
	    driver.findElement(By.xpath("//input[@autofocus=\"autofocus\"]")).sendKeys("Wankhede Stadium");
	    driver.findElement(By.xpath("//button[@id=\"searchbox-searchbutton\"]")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File("C://Ashok_PD//Screenshot.png"));
	   String  reviews = driver.findElement(By.xpath("//span[text()='वानखेडे स्टेडियम (क्रिकेट स्टेडियम)']//parent::h2//following-sibling::div/div/div[1]/div[2]/span/span/span[1]")).getText();
	   String  reviews1 = driver.findElement(By.xpath("//span[text()='वानखेडे स्टेडियम (क्रिकेट स्टेडियम)']//parent::h2//following-sibling::div/div/div[1]/span/span/span/span[2]/span/button")).getText();
	   System.out.println(reviews+" "+reviews1);
	   Thread.sleep(3000);
	   String  Link = driver.findElement(By.xpath("(//div[@class=\"QSFF4-text gm2-body-2\"])[3]")).getText();
	   String ExpectedTitle = "mumbaicricket.com";
	   System.out.println(Link);
	   SoftAssert softAssert = new SoftAssert();
	   softAssert.assertEquals(Link, ExpectedTitle);
	   String  address = driver.findElement(By.xpath("(//div[@class=\"QSFF4-text gm2-body-2\"])[1]")).getText();
	   System.out.println(address);
	   
	   File scrFile_01 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileHandler.copy(scrFile_01, new File("C://Ashok_PD//Screenshot1.png"));
	   
	   
	  	  
	}
	   	 

}
