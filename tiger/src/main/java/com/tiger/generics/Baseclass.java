package com.tiger.generics;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Baseclass {
	static{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}
	public WebDriver dr;
	@BeforeClass
	public void openBrowser(){
		System.out.println("open browsr");
		dr=new ChromeDriver();
		
	}
	@AfterClass
	public void closeBrowser(){
		System.out.println();
		dr.close();
	}
	@BeforeMethod
	public void login(){
		dr.get("http://localhost:8888/index.php?action=Login&module=Users");
		System.out.println("login");
		dr.findElement(By.name("user_name")).sendKeys("admin");
		dr.findElement(By.name("user_password")).sendKeys("manager");
		dr.findElement(By.id("submitButton")).click();
		dr.manage().window().maximize();
		}
	@AfterMethod
	public void logout(){
		System.out.println("logout");
		dr.findElement(By.xpath("(//td[@valign='bottom' and @class='small'])[1]")).click();
		dr.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}
