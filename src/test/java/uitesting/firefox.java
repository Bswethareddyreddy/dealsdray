package uitesting;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class firefox {
	public static void main(String[] args) throws IOException, Throwable {

		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://app.getcalley.com/dashboard.aspx#");
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Swethacamma@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Bswetha@1994");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		driver.findElement(By.xpath("//button[text()='Later']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"close\"]")).click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Temp=ts.getScreenshotAs(OutputType.FILE);
		File per=new File("\"./screenshot/image2.png\"");
		FileHandler.copy(Temp,per);
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}


