package org.basee;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasss {
	
public static WebDriver driver;
	
	public static WebDriver chromeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		return driver;	
		
	}
	
	public static String currentUrl() {
		
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	
	public static void launchUrl(String url) {
		
		driver.get(url);

	}
	
	public static void maximise(int sec) {
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

	}
	
	public static void sendkeys(WebElement e, String value) {
		
		e.sendKeys(value);
		
		

	}
	
	public static void click(WebElement e) {
		
		e.click();

	}
	
	public static String gettext(WebElement e) {
		
		String text = e.getText();
		return text;
	
	}
	
	public static String getattribute(WebElement e) {
		
		String attribute = e.getAttribute("value");
		return attribute;

	}
	
		public static String  currenturl() {
		
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	
	    public static String gettitle() {
		
		String title = driver.getTitle();
		return title;
		
		

	}
	
        public static void movetoElements(WebElement e) {
		
		Actions a = new Actions(driver);
		
		a.moveToElement(e);

	}
        
        
	
	public static void dragandDrop(WebElement target,WebElement e) {
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(e, target).perform();
		
	}
	
	public static void scrolldown(WebElement e) {
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)",e);
		
		

	}
	
	public static void scrollup(WebElement e) {
		
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(false)",e);
		


	}
	
	public static void selectbyIndex(WebElement e,int index) {
		
		Select s = new Select(e);
		
		s.selectByIndex(index);
		

	}
	
	public static void selectbyVisibletext(WebElement e,String a) {
		
		Select s = new Select(e);
		
		s.selectByVisibleText(a);

	}
	
	public static void screenShot(WebElement e,String location) throws IOException {
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = e.getScreenshotAs(OutputType.FILE);
		File des = new File(location);
		FileUtils.copyFile(src, des);

	}


}
