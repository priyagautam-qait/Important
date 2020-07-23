package LearningBasics.Important;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningWebdriverManager {
	WebDriver driver;

	//@Test
	public void Step01() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
}
