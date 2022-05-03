package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitewait {

	public static void main(String[] args) {
		
		String path = "D:\\javaE\\selenium\\Executable\\chromedriver.exe";
		System.setProperty("webdrive.chrome.driver", path);
		WebDriver dc = new ChromeDriver();
		dc.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dc.get("https//demo.actitime.com/login.do");
		String expectedTitle = "actiTime - Login";
		String actualTitle = dc.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("login page Displayed");
		}
		else {
			System.out.println("Login not displayed");
		}
		dc.findElement(By.id("username")).sendKeys("admin");
		dc.findElement(By.name("pwd")).sendKeys("manager");
		dc.findElement(By.id("loginButton")).click();
		WebElement logoutButton = dc.findElement(By.id("logoutLink"));
		WebDriverWait wait = new WebDriverWait(dc,20);
		wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
		String ActualCurrentPageTitle = dc.getTitle();
		System.out.println("Home Page" +ActualCurrentPageTitle);
		String ExpectedHomeTitle = "actiTIME - Enter Time-Track";
		if(ActualCurrentPageTitle.equals(ExpectedHomeTitle))
		{
			System.out.println("Sucessfull");
			
		}
		else
		{
			System.out.println("Fsiled");
			
		}

		//dc.findElement(By.linkText("logout"));

		dc.findElement(By.id("logoutLink")).click();
		
	}

}
