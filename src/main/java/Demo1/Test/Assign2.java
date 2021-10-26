package Demo1.Test;

import java.awt.Desktop.Action;
import java.awt.Window;

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
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assign2 {
	
	public static void main(String[] args) {

System.setProperty("webdriver.gecko.driver" , "D:\\Drivers\\gecko.driver.exe");

WebDriver driver = new FirefoxDriver();
driver.get("http://www.allmovie.com/");	
WebElement a = null;
driver.findElement(By.xpath("//input[@type='search']")).click();
driver.findElement(By.xpath("//input[@type='search']")).sendKeys("The Godfather");
driver.findElement(By.xpath("//input[@type='submit']")).click();


String  Genres = driver.findElement(By.xpath("(//span[@class='header-movie-genres']/a")).getText();
String ExpectedTitle = "Crime";
SoftAssert softAssert = new SoftAssert();
softAssert.assertEquals(Genres, ExpectedTitle);

String  MPAA = driver.findElement(By.xpath("(//span[contains(text(),'MPAA Rating - ')]")).getText();
String ExpectedResult = "A";
SoftAssert softAssert1 = new SoftAssert();
softAssert.assertEquals(MPAA, ExpectedResult);


String  director = driver.findElement(By.xpath("(//div[@class='director_container']/div[2]/dl/dt/a")).getText();
String Name = "Francis Ford Coppola";
SoftAssert softAssert2 = new SoftAssert();
softAssert.assertEquals(director, Name);


String  Al_pacino = driver.findElement(By.xpath("(//div/a[contains(text(),'Al Pacino')]/parent::div//following-sibling::div")).getText();
String CharName = "Francis Ford Coppola";
SoftAssert softAssert3 = new SoftAssert();
softAssert.assertEquals(Al_pacino, CharName);

	}

}


