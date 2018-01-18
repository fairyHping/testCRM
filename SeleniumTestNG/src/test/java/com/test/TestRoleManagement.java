package com.test;

import org.testng.annotations.Test;

import com.selenium.test.base.SeleniumUtil;

@Test(groups="roleManage")
public class TestRoleManagement {
	
	@Test(dependsOnGroups= "assignRole")
	public void roleManage() {
		SeleniumUtil.toParentWindow();
		//点击【角色管理】菜单
		SeleniumUtil.clickByXpath("//*[@id=\"_easyui_tree_11\"]/span[4]");
		//切换到角色管理页面
		SeleniumUtil.toFrameByXpath("//*[@id=\"tabs\"]/div[2]/div[3]/div/iframe");
		
	}

}
