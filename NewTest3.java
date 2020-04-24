package program3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest3 {
	WebDriver driver;
  @Test
  public void validate() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	    WebDriver  driver=new ChromeDriver();
	    driver.get("http://uitestpractice.com/");
  WebElement Action=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[6]/a"));
  Action.click();
  WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
  WebElement drop=driver.findElement(By.id("droppable"));
  Actions act=new Actions(driver);
  act.dragAndDrop(drag, drop).perform(); 

  WebElement no1=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
  no1.click();
  WebElement no6=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]"));
  no6.click();
  WebElement no11=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[11]"));
  no11.click();
  
  driver.close();
  
  }
}
