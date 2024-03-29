package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Testbase {
	public WebDriverWait wait;
	
	FileInputStream file;
	public static Properties props;
	public static WebDriver driver;
	public String window1;

	public Testbase() {
		
		props = new Properties();

		try {
			file = new FileInputStream("./src/main/java/com/PropertiesConfig/Propfile");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			props.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Setup() {

		String browsername = props.getProperty("browser");

		if (browsername.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		}

		else if (browsername.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		}

		else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get(props.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.manage().deleteAllCookies();
		
		
	}
}
