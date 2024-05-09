package Basic;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Trial {

	public static void main(String[] args) throws Exception {
		ScreenRecorderUtil.startRecord("main");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("instagram");
	
		driver.manage().window().setSize(new Dimension(100, 20));
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
		TakesScreenshot ts = (TakesScreenshot) driver; // typecasting
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src= new File("./errorShots/sample" + "-" + dateFormat.format(new Date())+".jpeg");
		FileHandler.copy(temp, src);
		
        System.out.println("DONE TAKING SCREENSHOT OF SITE");
	    
		driver.close();
		ScreenRecorderUtil.stopRecord();
	}
}
