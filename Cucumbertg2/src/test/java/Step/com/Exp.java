package Step.com;



import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Exp {
	
	@Test
	public static void captureScreenMethod() throws Exception{
                System.setProperty("webdriver.gecko.driver","B\\geckodriver.exe"); //wrong pathu extion will work
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	        try{
	            driver.get("https://www.softwaretestingmaterial.com");
		    driver.navigate().refresh();
		    //driver.findElement(By.xpath("//*[@id='cse-search-box']/div/input[4]")).sendKeys("agile"); //Statement with correct Xpath
		    driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile"); //Statement with incorrect Xpath	
                }catch(Exception e){
	            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(screenshotFile, new File("D:\\SoftwareTestingMaterial.png"));
		}
        driver.close();
	driver.quit();		
	}
}