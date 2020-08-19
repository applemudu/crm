package com.tiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(name="user_name")
	private WebElement username;
	@FindBy(name="user_password")
	private WebElement password;
	@FindBy(id="submitButton")
	private WebElement login;
	public Login(WebDriver dr){
		PageFactory.initElements(dr,this);
		}
	public void setlogin(String un,String pw){
		username.sendKeys(un);
		password.sendKeys(pw);
		login.click();
	}

}
