package screenshotts;

import java.awt.font.OpenType;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class takesceenshot {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\scrollupdwn\\driver\\chromedriver.exe");
		
		//upcasting
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("java");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("selenium");
		
		takesceenshot ts=(takesceenshot)driver;
		File src = ts.getScreenshotAs(OpenType.FILE);
		 File dest = new File("C:\\Users\\welcome\\eclipse-workspace\\day7selenium\\screenshot\\output.jpeg");
		 FileUtils.copyFile(src, dest);

	}

}
