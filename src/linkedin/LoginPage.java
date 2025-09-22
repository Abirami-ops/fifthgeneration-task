package linkedin;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void emptyPassword() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");

		// Click Sign in
		driver.findElement(By.linkText("Sign in")).click();

		// Enter Username
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("testautomationlinkedin11@gmail.com");

		// Screenshot after entering username
		Utils.takeScreenshot(driver, "D:\\selenium-screenshots\\Empty\\step1-username.png");

		// Enter Password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("");

		// Screenshot after entering password
		Utils.takeScreenshot(driver, "D:\\selenium-screenshots\\Empty\\step2-password.png");

		// Click Sign in
		driver.findElement(By.xpath("//button[@data-litms-control-urn='login-submit']")).click();

		// wait for error message to appear
		Thread.sleep(2000);

		// Directly capture error message (no try-catch)
		WebElement errorMsg = driver.findElement(By.id("error-for-password"));
		System.out.println("Error Message Displayed: " + errorMsg.getText());

		// Screenshot after error
		Utils.takeScreenshot(driver, "D:\\selenium-screenshots\\Empty\\step3-error-message.png");

		driver.quit();
	}

	public static void invalidPassword() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");

		// Click Sign in
		driver.findElement(By.linkText("Sign in")).click();

		// Enter Username
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("testautomationlinkedin11@gmail.com");

		// Screenshot after entering username
		Utils.takeScreenshot(driver, "D:\\selenium-screenshots\\Invalidlogin\\step1-username.png");

		// Enter Password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Aadhivvbbb@123");

		// Screenshot after entering password
		Utils.takeScreenshot(driver, "D:\\selenium-screenshots\\Invalidlogin\\step2-password.png");

		// Click Sign in
		driver.findElement(By.xpath("//button[@data-litms-control-urn='login-submit']")).click();

		// wait for error message to appear
		Thread.sleep(2000);

		// Directly capture error message (no try-catch)
		WebElement errorMsg = driver.findElement(By.id("error-for-password"));
		System.out.println("Error Message Displayed: " + errorMsg.getText());

		// Screenshot after error
		Utils.takeScreenshot(driver, "D:\\selenium-screenshots\\Invalidlogin\\step3-error-message.png");

		driver.quit();
	}

	public static void validPassword() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");

		// Click Sign in
		driver.findElement(By.linkText("Sign in")).click();

		// Enter Username
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("testautomationlinkedin11@gmail.com");

		// Screenshot after entering username
		Utils.takeScreenshot(driver, "D:\\selenium-screenshots\\Validlogin\\step1-username.png");

		// Enter Password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Automation@!123");

		// Screenshot after entering password
		Utils.takeScreenshot(driver, "D:\\selenium-screenshots\\Validlogin\\step2-password.png");

		// Click Sign in
		driver.findElement(By.xpath("//button[@data-litms-control-urn='login-submit']")).click();
		Thread.sleep(5000);

		// Screenshot after login
		Utils.takeScreenshot(driver, "D:\\selenium-screenshots\\Validlogin\\step3-after-login.png");

		driver.quit();
	}

}
