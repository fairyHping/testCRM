package com.test;

import org.testng.annotations.Test;

import com.selenium.test.base.SeleniumUtil;

public class TestAssignRole {

	/**
	 * 进行角色分配操作
	 */
	@Test(groups="assignRole",dependsOnGroups= {"login","userManage"})
	public void assignRole() {
		//选择要分配角色的用户
		SeleniumUtil.clickByXpath("//*[@id=\"datagrid-row-r1-2-5\"]");
		//点击【分配角色】按钮
		SeleniumUtil.clickByXpath("//*[@id=\"assignButton\"]/span");
		//切换至父窗口
		SeleniumUtil.toParentWindow();
		//切换至分配角色弹出窗口
		SeleniumUtil.toFrameByXpath("//*[@id=\"topWindow\"]/iframe");
		//
		SeleniumUtil.clickByXpath("//*[@id=\"datagrid-row-r1-2-2\"]/td[1]/div/input");
		SeleniumUtil.clickByCss("body > div:nth-child(3) > a");
	}

}
