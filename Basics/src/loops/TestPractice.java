package loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestPractice {
	

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver lavanya = new FirefoxDriver();
		lavanya.get("http://www.gmail.com");
		//System.out.println(driver.getTitle());
	}
}



