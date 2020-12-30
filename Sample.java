package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) throws InterruptedException  {
		System.out.println("sample");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.qtreetechnologies.in/");
		driver.manage().window().maximize();
		ContactUs Contact=new ContactUs();
		driver.findElement(Contact.ContactUs).click();
		System.out.println(browserURL(driver));
		driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul/li[6]/a")).getText();
		String actualURL=browserURL(driver);
		String expectedURL="https://www.qtreetechnologies.in/contact.php";
		if(expectedURL.equals(actualURL))
		{
			System.out.println("URL have match");
		}
		else
		{
			throw new AssertionError("URL does not match");
		}
		driver.findElement(Contact.HomePage).click();
		driver.navigate().back();
		//driver.findElement(Contact.Phone).click();
		//driver.findElement(Contact.Email).click();
		
		driver.findElement(Contact.Facebook).click();
		Thread.sleep(2000);
	    driver.navigate().back();
		driver.findElement(Contact.Twitter).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(Contact.LinkedIn).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(Contact.Instagram).click();
		Thread.sleep(2000);
		driver.navigate().back();
		//driver.findElement(Contact.GoogleMap).click();
		//driver.navigate().back();
		driver.findElement(Contact.Name).click();
		driver.findElement(Contact.Name).sendKeys("abc");
		driver.findElement(Contact.MobileNumber).click();
		driver.findElement(Contact.MobileNumber).sendKeys("9334579767");
		driver.findElement(Contact.Mail).click();
		driver.findElement(Contact.Mail).sendKeys("abc@gmail.com");
	    driver.findElement(Contact.course).click();
	 
	   // WebElement element=driver.findElement(By.xpath("//select[@id='contactcf']"));
	   // driver.findElement(Contact.course).click();
	   // Select sel=new Select(element);
	    //sel.selectByValue("CSS Training");
	    //element.click();
	    
		//driver.findElement(Contact.course).sendKeys
		//driver.findElement(Contact.submit).click();
		
		
		

	}

	public static String browserURL(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl();
	}

}