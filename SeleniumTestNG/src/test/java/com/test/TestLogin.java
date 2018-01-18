package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.selenium.test.base.SeleniumUtil;

@Test(groups="login")
public class TestLogin {
	WebDriver driver=null;	
	/**
	 * 进入对应的系统
	 */
	@BeforeSuite
	public void getdriver() {
		driver=SeleniumUtil.getDriver("chrome",".//driver/chromedriver.exe");
		
		SeleniumUtil.openBrowser("http://localhost:8080/CRM/");
		
	}
	
	/**
	 * 登录操作
	 */
	@Test
	public void loginCRM() {
		SeleniumUtil.sendKeyByCss("input[name='username']", "zhangsan001");
		SeleniumUtil.sendKeyByCss("input[name='password']", "zhangsan001");
		SeleniumUtil.clickByCss("#loginForm > p.submit > input[type=\"submit\"]");
	}
	
	
	
}
