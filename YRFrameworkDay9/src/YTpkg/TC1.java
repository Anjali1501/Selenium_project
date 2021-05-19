package YTpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
	public ChromeDriver driver;
	
	@BeforeMethod
	
	public void BrowserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}
	
	/*@Test
	
	public void YTClick() throws InterruptedException 
	{
		WebElement Trending=driver.findElement(By.xpath("//tp-yt-paper-button[@aria-label='Sign in']"));
		Trending.click();
		
		WebElement Email=driver.findElement(By.xpath("//input[@type='email']"));
	    Email.sendKeys("anjalitest15@gmail.com");
	    
	    WebElement Next=driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
	    Next.click();
	    Thread.sleep(3000);
	    WebElement Password=driver.findElement(By.xpath("//input[@type='password']"));
	    Password.sendKeys("Anjali12345");
	    
	    WebElement NextB=driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
	    NextB.click();
	    
	    Thread.sleep(3000);
	    WebElement Explore=driver.findElement(By.xpath("//a[@title='Explore']"));
	    Explore.click();
	    
	    Thread.sleep(3000);
	    WebElement TrendingTab=driver.findElement(By.xpath("//*[(text()='Trending')]"));
	    TrendingTab.click();
	   
	    Thread.sleep(3000);
	    WebElement B2=driver.findElement(By.xpath("//img[@alt='Avatar image']"));
	    B2.click();
	    
	    Thread.sleep(3000);
	    WebElement Signout=driver.findElement(By.xpath("//*[(text()='Sign out')]"));
	    Signout.click();
	}
	
	@AfterMethod
	
	public void closeBrowser()
	{
		driver.close();
	}*/
}


