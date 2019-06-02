package Programmes;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DupChar {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("maheshbabu436.appala@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@name,'email')]")).sendKeys("maheshbabu436.appala@gmail.com");
		

	}

}
