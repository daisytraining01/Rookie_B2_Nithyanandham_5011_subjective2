package Step.com;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\training\\eclipse-workspace\\Cucumbertg\\src\\main\\resources\\chromedriver.exe");
       WebDriver x=new ChromeDriver();
       x.get("http://demo.guru99.com/test/newtours/register.php");
       x.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       Thread.sleep(3000);
       

       System.out.println("CONTACT INFORMATION");
       WebElement element1=x.findElement(By.name("firstName"));
       element1.sendKeys("Nithi");
       String a=element1.getAttribute("value");
       System.out.println("First Name: "+a);
       Thread.sleep(1000);

       WebElement element2=x.findElement(By.name("lastName"));
       element2.sendKeys("Palani");
       String b=element2.getAttribute("value");
       System.out.println("Last Name: "+b);
       Thread.sleep(1000);

       WebElement element3=x.findElement(By.name("phone"));
       element3.sendKeys("9600785160");
       String c=element3.getAttribute("value");
       System.out.println("Phone: "+c);
       Thread.sleep(1000);

       WebElement element4=x.findElement(By.name("userName"));
       element4.sendKeys("Nithi@gmail.com");
       String d=element4.getAttribute("value");
       System.out.println("Email: "+d);

       System.out.println("----------------------------------");

       System.out.println("MAILING INFORMATION");
       WebElement element5=x.findElement(By.name("address1"));
       element5.sendKeys("Pratap Nagar Near Police Lines Ghaziabad");
       String e=element5.getAttribute("value");
       System.out.println("Address: " +e);

       Thread.sleep(1000);
       WebElement element6=x.findElement(By.name("city"));
       element6.sendKeys("Tripattur");
       String f=element6.getAttribute("value");
       System.out.println("City: "+f);
       Thread.sleep(1000);

       WebElement element7=x.findElement(By.name("state"));
       element7.sendKeys("Tamil Nadu");
       String g=element7.getAttribute("value");
       System.out.println("State/Province: "+g);
       Thread.sleep(1000);

       WebElement element8=x.findElement(By.name("postalCode"));
       element8.sendKeys("635 602");
       String h=element8.getAttribute("value");
       System.out.println("Postal Code: "+h);
       Thread.sleep(1000);

       Select drpcountry=new Select(x.findElement(By.name("country")));
       List<WebElement> el=drpcountry.getOptions();
       int iListsize=el.size();
       System.out.println("Total no. of Countries: "+iListsize);
       for(int i=0;i<iListsize;i++)
       {
           String cntry=drpcountry.getOptions().get(i).getText();
       System.out.println("Country "+(i+1)+" :"+cntry);
       }
       drpcountry.selectByVisibleText("INDIA");
       Thread.sleep(1000);

       System.out.println("----------------------------------");

       System.out.println("USER INFORMATION");
       WebElement element9=x.findElement(By.name("email"));
       element9.sendKeys("Nithi");
       String i=element9.getAttribute("value");
       System.out.println("User Name: "+i);

       Thread.sleep(1000);
       WebElement element10=x.findElement(By.name("password"));
       element10.sendKeys("Nithi@17");
       String j=element10.getAttribute("value");
       System.out.println("Password: "+j);
       Thread.sleep(1000);

       WebElement element11=x.findElement(By.name("confirmPassword"));
       element11.sendKeys("Nithi@17");
       String k=element11.getAttribute("value");
       System.out.println("Confirm Password: "+k);
       Thread.sleep(2000);

       //Click Submit button
       x.findElement(By.name("submit")).click();
       System.out.println("Registration form is submitted successfully");
       
       //ScreenShot 
              	
       
       
       
		}
    }





