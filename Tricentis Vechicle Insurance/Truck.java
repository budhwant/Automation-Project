package AT_Project_Tricentis_Vechicle_Insurance;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Truck {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.id("nav_truck")).click();
		driver.findElement(By.id("make")).sendKeys("Audi");
		driver.findElement(By.id("engineperformance")).sendKeys("1000");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("04/10/2024");
		driver.findElement(By.id("numberofseats")).sendKeys("5");
		driver.findElement(By.id("fuel")).sendKeys("Diesel");
		driver.findElement(By.id("payload")).sendKeys("1000");
		driver.findElement(By.id("totalweight")).sendKeys("20000");
		driver.findElement(By.id("listprice")).sendKeys("10000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("MH21AL5555");
		driver.findElement(By.id("annualmileage")).sendKeys("800");
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		driver.findElement(By.id("firstname")).sendKeys("Krishna");
		driver.findElement(By.id("lastname")).sendKeys("Mahske");
		driver.findElement(By.id("birthdate")).sendKeys("01/10/2000");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span")).click();
		driver.findElement(By.id("streetaddress")).sendKeys("Shivaji nagar Manwath");
		driver.findElement(By.id("country")).sendKeys("india");
		driver.findElement(By.id("zipcode")).sendKeys("431505");
		driver.findElement(By.id("city")).sendKeys("Parbhani");
		driver.findElement(By.id("occupation")).sendKeys("Employee");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[5]/span")).click();
		driver.findElement(By.id("website")).sendKeys("www.google.com");
		driver.findElement(By.id("nextenterproductdata")).click();
		
		driver.findElement(By.id("startdate")).sendKeys("06/05/2024");
		driver.findElement(By.id("insurancesum")).sendKeys("700000000");
		driver.findElement(By.id("damageinsurance")).sendKeys("Full coverage");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[2]/span")).click();
		driver.findElement(By.id("nextselectpriceoption")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[4]/span")).click();
		driver.findElement(By.id("nextsendquote")).click();
		
		driver.findElement(By.id("email")).sendKeys("Budhwantm@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("8483819347");
        driver.findElement(By.id("username")).sendKeys("Meghraj");
        driver.findElement(By.id("password")).sendKeys("Meghraj@123");
        driver.findElement(By.id("confirmpassword")).sendKeys("Meghraj@123");
        driver.findElement(By.id("Comments")).sendKeys("No Something else");
        driver.findElement(By.id("sendemail")).click();
        
        Thread.sleep(10000);
        File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcfile, new File("D:\\Selenium software\\commons-io-2.16.1\\Screenshot2.jpg"));     
	}
 
}
