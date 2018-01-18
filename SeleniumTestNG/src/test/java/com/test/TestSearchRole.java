package com.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.test.base.SeleniumUtil;
@Test(dependsOnGroups="roleManage")
public class TestSearchRole {

	/**
	 * 根据角色权限查询
	 */
	@Test
	public void searchByFunc() {
		// 循环选择查询条件【角色权限】中的权限
		for(int i=0;i<=40;i++) {
			String funcId="_easyui_combobox_i2_"+i;
			SeleniumUtil.inputSelect(By.xpath("//*[@id=\"toolbar\"]/span[2]/span/a"),
					By.id(funcId));
			// 点击查询按钮
			SeleniumUtil.clickByXpath("//*[@id=\"searchButton\"]/span");
		}	
	}
	/**
	 * 按照角色名模糊查询
	 */
	@Test(dependsOnMethods="searchByFunc")
	public void searchByRoleName() {
		//点击【重置】按钮
		SeleniumUtil.clickByXpath("//*[@id=\"resetButton\"]/span");
		//在【角色名】文本框输入查询条件
		SeleniumUtil.sendKeyById("_easyui_textbox_input1", "总");
		// 点击查询按钮
		SeleniumUtil.clickByXpath("//*[@id=\"searchButton\"]/span");
	}

}
