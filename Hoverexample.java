package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("mousehover");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.cardekho.com/?utm_campaign=SER-Mob-Brand-Nonm&utm_device=c&utm_term=%2Bcardekho&network=g&utm_medium=cpc&utm_source=google&agid=44536557720&ap=&aoi=&ci=321014222&cre=354929124701&fid=&lop=1007810&ma=b&mo=&pl=&ti=kwd-300887364138&gclid=CjwKCAiAxKv_BRBdEiwAyd40NxrbqbxoMZxoIV4GamjmuiOTSScv_2XXhlEjFxzmrbyITVybY2tgYxoCt8UQAvD_BwE");
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		WebElement more=driver.findElement(By.xpath("//*[@id=\"rf01\"]/header/div[2]/div/div/nav/ul/li[7]/span/span"));
		act.moveToElement(more).build().perform();
		Thread.sleep(3000);
		WebElement carloan=driver.findElement(By.xpath("//a[@href='https://loan.cardekho.com']"));	
		act.moveToElement(carloan).build().perform();
		Thread.sleep(3000);
		carloan.click();
		System.out.println("done");
		

	}

}
