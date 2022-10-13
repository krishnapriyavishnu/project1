package junitdemo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wappalyzer_exm {
WebDriver driver;
@Before
public void setup() {
WebDriverManager.chromedriver().setup();

driver=new ChromeDriver();
}
@Test
public void test() {
	driver.get("https://www.wappalyzer.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();
	driver.findElement(By.xpath("//*[@id=\"list-item-49\"]/div/div[1]")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
	driver.findElement(By.xpath("//*[@id=\"input-594\"]")).sendKeys("shopify");
	driver.findElement(By.xpath("//*[@id=\"list-item-591-0\"]/div/div[1]")).click();
	

	}

}
