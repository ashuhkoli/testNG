package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) throws InterruptedException {
		 
		String path = "D:\\javaE\\selenium\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver dc = new ChromeDriver();
		dc.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dc.get("https://demo.actitime.com/login.do");
		String expectedTitle = "actiTIME - Login";
		String ActualTitle = dc.getTitle();
		if(ActualTitle.equals(expectedTitle))     
		{
			System.out.println("Login page Displayed");
			System.out.println("Login page Displayed");
		}
		else {
			System.out.println("Not Displayed");
			
		}
		dc.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dc.findElement(By.id("username")).sendKeys("admin");
		dc.findElement(By.name("pwd")).sendKeys("manager");
		dc.findElement(By.id("loginButton")).click();
		dc.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		dc.close();
		//dc.findElement(null);
		

		
		
		

	}

}
