package com.loggers;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {
	public static WebDriver driver;
	public static org.apache.logging.log4j.Logger log;
	public static void main(String[] args) {
		
		
		
			
			log = LogManager.getLogger(Login.class);
			
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			log.info("Implicit wait is applied for 10 seconds");
			driver.get("https://www.myntra.com/");
			log.info("Logged into Myntra");
			
			try {
				boolean text = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/a")).isDisplayed();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				log.error("Exception occured",new Exception("Element Not Found"));
			}
			finally {
				driver.quit();
				log.info("Quitted the driver");
			}
		}

	

}
