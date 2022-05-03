package selenium;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1 = "D:\\javaE\\selenium\\Executable\\geckodriver.exe";
		//String path2=".\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.gecko.driver", path1);
		new FirefoxDriver();
        //Driver.close();
	}

}
