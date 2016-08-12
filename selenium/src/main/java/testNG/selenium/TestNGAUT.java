package testNG.selenium;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAUT {

	@Test
	public void f() {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		driver.navigate().to("http://www.sohu.com");
		// input text
		WebElement element = driver.findElement(By.id("kw"));
		element.sendKeys("Selenium");
		element.getText();
		element.click();
		// dropdown, radio box, check box
//		Select select = (Select) driver.findElement(By.name("select"));
//		select.selectByIndex(1);
//		select.selectByValue("abc");
//		select.selectByVisibleText("abc");
//		// popup
//		WebDriver popup = null;
//		Iterator<String> windowIterator = (Iterator<String>) driver
//				.getWindowHandles();
//		while (windowIterator.hasNext()) {
//			String windowHandle = windowIterator.next();
//			popup = driver.switchTo().window(windowHandle);
//			if (popup.getTitle().equals("Google")) {
//				break;
//			}
//		}

	}
}
