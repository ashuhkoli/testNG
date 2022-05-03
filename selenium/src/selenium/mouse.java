package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mouse {
	
	public static void main(String[] args)
	{
	    String path = "D:\\javaE\\selenium\\Executable\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", path);
	    WebDriver cd = new ChromeDriver();
	    cd.get("https://www.makemytrip.com");
	    cd.findElement(By.cssSelector("li[data-cy='account']")).click();
	    cd.findElement(By.cssSelector("label[for='departure']")).click();
	    cd.findElement(By.cssSelector("div.daypicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>div>p")).click();
	}

}
