package Step.com;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;
 
public class Ex88 {
 public WebDriver driver;
 @Test
  public void FirefoxTest() { 
	 final String URL1 = "http://www.amazon.com";
	    
//Initializing the firefox driver (Gecko)
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\training\\eclipse-workspace\\Cucumbertg\\src\\main\\resources\\geckodriver.exe");
   driver = new FirefoxDriver();   
   driver.get("https://www.google.com"); 
   driver.get(URL1);
   driver.quit();
 
  }
 
        @Test
 public void ChromeTest()
 { 
 
   //Initialize the chrome driver
   System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\CucumberTest\\src\\main\\resources\\chromedriver.exe");
   driver = new ChromeDriver();
   driver.get("https://www.google.com"); 
   driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
   driver.quit();
 
 }
 
}










