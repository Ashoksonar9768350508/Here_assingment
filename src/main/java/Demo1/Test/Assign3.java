package Demo1.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign3 {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com"); 
		driver.manage().window().maximize();  
		WebDriverWait wait = new WebDriverWait(driver,10);
	    WebElement element = wait.until(
	                       ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")));
	    driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	    { 
	    	WebElement as =driver.findElement(By.xpath("//div[@class=\"xtXmba\"]"));
	    	Actions action = new Actions(driver);
	    action.moveToElement(as).build().perform();
	    }
	    
	    driver.findElement(By.xpath("//a[contains(text(),'ALL')])[1])")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'Electronics')]")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'Mi')])]")).click();
	    WebElement scroll =driver.findElement(By.xpath("//div[@class=\"HQL4QS WC_zGJ\"]"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;  
	    js.executeScript("window.scrollBy(250,0)", "");
	    Select sc= new Select(driver.findElement(By.xpath("//select[@class=\\\"_2YxCDZ\\\"]")));
	    sc.selectByValue("13000");
	    driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("redmi go black 8 GB");
	    driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
	    driver.findElement(By.xpath("//div[contains(text(),'Redmi Go (Black, 8 GB)')]")).click();
	    String mainWindowHandle = driver.getWindowHandle();
	    String child_window=driver.getTitle();
	    driver.switchTo().window(child_window);
	    for (String childWindowHandle : driver.getWindowHandles()) {
	    	  if(!childWindowHandle.equals(mainWindowHandle)){
	    	  driver.switchTo().window(childWindowHandle);
	    	  }
	    String  Price = driver.findElement(By.xpath("(//div[@class=\"_30jeq3 _16Jk6d\"]")).getText();
	    String ExpectedTitle = "100";
	    driver.switchTo().frame("a077aa5e");
	    driver.findElement(By.xpath("//span[contains(text(),'Cart')]")).click();
	    driver.close();
	    
	    }
	}
	    	     
	    
	}