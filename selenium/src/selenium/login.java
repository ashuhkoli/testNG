package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String path ="D:\\javaE\\selenium\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver cd = new ChromeDriver();
		//WebDriverManeger.ChromeDriver().setup();
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cd.get("https://demo.actitime.com/login.do");
		String expectedTitle = "actiTIME - Login";
		String actualtitle = cd.getTitle();
		if(actualtitle.equals(expectedTitle))
		{
			System.out.println("login sucessfully");
		}
		else {
			System.out.println("not sucessfully Login");
		}
		//Thread.sleep(2000);
	     cd.close();
	}
	

}
