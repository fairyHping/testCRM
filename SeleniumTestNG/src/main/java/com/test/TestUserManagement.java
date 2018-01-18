package com.test;

import org.testng.annotations.Test;

import com.selenium.test.base.SeleniumUtil;

@Test(groups="userManage")
public class TestUserManagement {
	/**
	 * 进入用户管理
	 */
	@Test(dependsOnGroups="login")
	public void userManage() {
		//展开系统管理菜单，加载用户管理菜单
		SeleniumUtil.clickByXpath("//*[@id=\"_easyui_tree_1\"]/span[1]");
		//等待两秒，避免元素还未来得及出现
		WaitTime.waitMillis(2000);
		//点击用户管理菜单，出现用户管理页面
		SeleniumUtil.clickByXpath("//*[@id=\"_easyui_tree_10\"]/span[4]");//*[@id="_easyui_tree_10"]/span[4]	
		//切换窗口至用户管理页面
		SeleniumUtil.toFrameByXpath("//*[@id=\"tabs\"]/div[2]/div[2]/div/iframe");
		
	}

}
