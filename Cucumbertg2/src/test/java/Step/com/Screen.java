package Step.com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Screen {
	
		public WebDriver driver;

			
		@BeforeClass
		public void setUp() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\training\\eclipse-workspace\\Cucumbertg\\src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();  
		}
		
		
		@Test
		public void loginTest() {
                          
		driver.get("https://opensource-demo.orangehrmlive.com/");	
		
                          
		driver.manage().window().maximize();
		
                          
		driver.manage().deleteAllCookies();

                             
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

		String pageTitle = driver.getTitle();							 
		System.out.println("The title of this page is ===> " +pageTitle);
							

		driver.findElement(By.id("txtUsername")).clear();	

		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");		
		

		driver.findElement(By.id("txtPassword")).clear();
		

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");		
		

		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		
		try {

			FileUtils.copyFile(file, new File("./ScreenShot_Folder/Test1_Login.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("the login page screenshot is taken");

		driver.findElement(By.id("btnLogin")).click();
		
			
			
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			

        driver.findElement(By.linkText("Admin")).click();
			
        driver.findElement(By.xpath("//input[@id = 'searchSystemUser_userName']")).clear();
         driver.findElement(By.xpath("//input[@id = 'searchSystemUser_userName']")).sendKeys("Chris Evans");
			
        Select selectRole = new Select(driver.findElement(By.id("searchSystemUser_userType")));
        selectRole.selectByVisibleText("Admin");
        driver.findElement(By.id("searchSystemUser_employeeName_empName")).clear();
        driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Test 1");
			
        Select selectStatus = new Select (driver.findElement(By.id("searchSystemUser_status")));
        selectStatus.selectByVisibleText("Enabled");
        driver.findElement(By.id("searchBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
       TakesScreenshot ts1 = (TakesScreenshot)driver;
       File file1 = ts.getScreenshotAs(OutputType.FILE);
			
       try {
             FileUtils.copyFile(file1, new File("D:\\Screen\\Test2_SearchUser.png"));
	} catch (IOException e) {
	e.printStackTrace();
}
	System.out.println("the userStatus screenshot is taken");
			
}
		
	@AfterClass
	public void tearDown() {
	driver.quit();
		}		
}
