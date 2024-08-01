package AT_Project_Tricentis_Vechicle_Insurance;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automobile {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	
		
		driver.get("https://sampleapp.tricentis.com/101/index.php");
		driver.findElement(By.id("nav_automobile")).click();
		driver.findElement(By.id("make")).sendKeys("Audi");
		driver.findElement(By.id("engineperformance")).sendKeys("555");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("05/03/2024");
		driver.findElement(By.id("numberofseats")).sendKeys("4");
		driver.findElement(By.id("fuel")).sendKeys("Petrol");
		driver.findElement(By.id("listprice")).sendKeys("1080");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("MH 22 9749");
		driver.findElement(By.id("annualmileage")).sendKeys("1000");
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		driver.findElement(By.id("firstname")).sendKeys("Meghraj");
		driver.findElement(By.id("lastname")).sendKeys("Budhwant");
		driver.findElement(By.id("birthdate")).sendKeys("06/20/2000");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span")).click();
		driver.findElement(By.id("streetaddress")).sendKeys("Karve Nagar pune");
		driver.findElement(By.id("country")).sendKeys("india");
		driver.findElement(By.id("zipcode")).sendKeys("431501");
		driver.findElement(By.id("city")).sendKeys("Pune");
		driver.findElement(By.id("occupation")).sendKeys("Employee");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[5]/span")).click();
		driver.findElement(By.id("website")).sendKeys("www.google.com");
		driver.findElement(By.id("nextenterproductdata")).click();
		
		driver.findElement(By.id("startdate")).sendKeys("06/06/2024");
		driver.findElement(By.id("insurancesum")).sendKeys("7.000.000.00");
		driver.findElement(By.id("meritrating")).sendKeys("Super Bonus");
		driver.findElement(By.id("damageinsurance")).sendKeys("Full Coverage");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[2]/span")).click();
		driver.findElement(By.id("courtesycar")).sendKeys("Yes");
        driver.findElement(By.id("nextselectpriceoption")).click();
        
        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]/span")).click();
        driver.findElement(By.id("nextsendquote")).click();
        
        driver.findElement(By.id("email")).sendKeys("Budhwantm@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("8483819347");
        driver.findElement(By.id("username")).sendKeys("Meghraj");
        driver.findElement(By.id("password")).sendKeys("Meghraj@123");
        driver.findElement(By.id("confirmpassword")).sendKeys("Meghraj@123");
        driver.findElement(By.id("Comments")).sendKeys("No Something else");
        driver.findElement(By.id("sendemail")).click();
        
        Thread.sleep(10000);
       // File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      //  FileUtils.copyFile(srcfile, new File("D:\\Selenium software\\commons-io-2.16.1\\Screenshot1.jpg"));        
	}
	

}
