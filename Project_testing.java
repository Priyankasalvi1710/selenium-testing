package seleprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_testing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\pawan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
//		Launch chrome browser
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("file:///C:/Users/pawan/OneDrive/Desktop/Priyanka%20salvi/software%20testing/Priyanka%20Salvi_Shopping%20website_7670/shoppingwebsite.html");
        Thread.sleep(2000);
        
// Registration 
        driver.findElement(By.xpath("/html/body/div[1]/div/nav/ul/li[4]/a")).click();
//        Navigate to sign-in
        driver.findElement(By.xpath("/html/body/div/div[1]/div/span/label")).click();
//        email 
        driver.findElement(By.xpath("/html/body/div/div[2]/form/input[1]")).sendKeys("salvipriyanka@gamil.com");
//        password
        driver.findElement(By.xpath("/html/body/div/div[2]/form/input[2]")).sendKeys("Priyanka");
//        Confirm password
        driver.findElement(By.xpath("/html/body/div/div[2]/form/input[4]")).sendKeys("Priyanka");
//        sign-up
        driver.findElement(By.xpath("/html/body/div/div[2]/form/input[4]")).click();
        
//        Login
        driver.findElement(By.xpath("/html/body/div/div[2]/div/span/label")).click();
//       username 
        driver.findElement(By.xpath("/html/body/div/div[1]/form/input[1]")).sendKeys("salvipriyanka@gmail.com");
//        password
        driver.findElement(By.xpath("")).sendKeys("Priyanka");
//  Login button
        driver.findElement(By.xpath("/html/body/div/div[1]/form/input[3]")).click();
        
//        search
//       WebElement search= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/input")).sendKeys("Dress");
//        search = driver.click();
        
//        About Us
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/a[1]")).click();
//   shipping and policy     
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/a[2]")).click();
//        help centre
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/a[3]")).click();
//        term & condition
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/a[4]")).click();
//        privacy & policy
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/a[5]")).click();
//        Resposible and disclouser
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/a[6]")).click();
        
//        
        driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("")).click();

	}

}
