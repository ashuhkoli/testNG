package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chrom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//	String path = "D:\\javaE\\selenium\\Executable\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", path);
	//	WebDriver dc=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver dc = new ChromeDriver();
		dc.manage().window().maximize();
		
		dc.get("https://www.google.com/" );
		String Pagesource = dc.getPageSource();
		System.out.println("Application source code =" +Pagesource);
		System.out.println("Applicstion sourcecode lenght:" +Pagesource.length());
		System.out.println("Application current Url:" +dc.getCurrentUrl());
		System.out.println("Application title:" +dc.getTitle());
		if(dc.getTitle().equals("Google")) {
			System.out.println("Google search page opened successfully...");
		}else {
			System.out.println("Either google search page not opened or its title got changed");
		}
		Thread.sleep(2000);
		dc.close();
		
	}

}
