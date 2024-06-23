package functionaltesting;

import java.io.File;
import java.time.Duration;import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test1 {
	
	public static void main(String[] args) throws Throwable  {
		 
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.dealsdray.com/");
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Order\"]")).click();
		driver.findElement(By.xpath("(//span[@class=\"sidenavHoverShow MuiBox-root css-i9zxpg\"])[2]")).click();
		driver.findElement(By.xpath("//button[text()=\"Add Bulk Orders\"]")).click();
		WebElement uplod = driver.findElement(By.xpath("//input[@aria-invalid=\"false\"]"));
		uplod.sendKeys("C:\\Users\\DELL\\Desktop\\eizi project\\demo-data.xlsx");
		driver.findElement(By.xpath("//button[text()=\"Import\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Validate Data\"]")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Temp=ts.getScreenshotAs(OutputType.FILE);
		File per=new File("./screenshot/image.png");
		FileHandler.copy(Temp, per);
	}

}
