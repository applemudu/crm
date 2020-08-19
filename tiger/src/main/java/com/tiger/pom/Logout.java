package com.tiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
@FindBy(xpath="(//td[@valign='bottom' and @class='small'])[1]")
private WebElement administrator;
@FindBy(xpath="//a[text()='Sign Out']")
private WebElement signout;
public Logout(WebDriver dr){
	PageFactory.initElements(dr, this);
}
public void setlogout(){
	administrator.click();
	signout.click();
}
}
