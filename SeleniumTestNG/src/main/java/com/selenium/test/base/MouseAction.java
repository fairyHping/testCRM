package com.selenium.test.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction extends SeleniumUtil{
	/*
	 * 鼠标操作对象
	 */
	static Actions action=new Actions(driver);;
	/**
	 * 返回一个鼠标操作对象
	 * @return
	 */
	public static Actions getActions() {
		return action;
	} 
	/**
	 * 鼠标左键在当前停留的位置做单击操作
	 */
	public static void leftClick() {
		action.click();
		
	}
	/**
	 * 鼠标左键点击指定的元素 
	 * @param element  WebElement页面元素对象
	 */
	public static void leftClick(WebElement element) {
		action.click(element);
		
	}
	/**
	 * 鼠标右键在当前停留的位置做单击操作
	 */
	public static void rightClick() {
		action.contextClick();
	}
	/**
	 * 鼠标右键点击指定的元素 
	 * @param element WebElement页面元素对象
	 */
	public static void rightClick(WebElement element) {
		
		action.contextClick(element);
	}
	/**
	 * 鼠标双击操作
	 */
	public static void doubleClick() {
		action.doubleClick();
	}
	/**
	 * 鼠标双击指定元素
	 * @param element WebElement页面元素对象
	 */
	public static void doubleClick(WebElement element) {
		action.doubleClick(element);
	}
	
	/**
	 * 鼠标拖拽操作,从一个元素拖拽到另一个元素的位置
	 * @param source 被拖拽的元素
	 * @param target 目标位置的元素
	 */
	public static void dragDrop(WebElement source,WebElement target){
		//将source元素拖放到target元素的位置
		 action.dragAndDrop(source, target);
	}
	
	/**
	 * 将source元素拖放到 (xOffset, yOffset) 位置，其中 xOffset 为横坐标，yOffset 为纵坐标
	 * @param source  被拖拽的元素
	 * @param xOffset  xOffset为横坐标
	 * @param yOffset  yOffset为纵坐标
	 */
	public static void dragDrop(WebElement source,int xOffset,int yOffset){
		action.dragAndDropBy(source, xOffset, yOffset);
	}
	/**
	 * 鼠标悬停在当前位置，既点击并且不释放
	 */
	public static void clickAndHold() {
		 action.clickAndHold();
	}
	/**
	 * 鼠标事件释放
	 */
	public static void release() {
		action.release();
	}
	/**
	 * 鼠标悬停在 element 元素的位置 
	 * @param element WebElement页面元素对象
	 */
	public static void clickAndHold(WebElement element) {
		action.clickAndHold(element);
	}
	/**
	 * 将鼠标移到target元素中点
	 * @param target
	 */
	public static void moveToElement(WebElement target) {
		action.moveToElement(target);
	}
	/**
	 * 将鼠标移到target元素的 (xOffset, yOffset) 位置，这里的 (xOffset, yOffset) 是以元素 target的左上角为 (0,0) 开始的 (x, y) 坐标轴
	 * @param target WebElement页面元素对象，目标元素
	 * @param xOffset 以元素 target的左上角为 (0,0) 开始的横坐标
	 * @param yOffset 以元素 target的左上角为 (0,0) 开始的纵坐标
	 */
	public static void moveToElement(WebElement target,int xOffset,int yOffset){
		action.moveToElement(target, xOffset, yOffset);
	}
	/**
	 * 以鼠标当前位置或者 (0,0) 为中心开始移动到 (xOffset, yOffset)坐标位置
	 * 如果 xOffset 为负数，表示横坐标向左移动，yOffset 为负数表示纵坐标向上移动。
	 * 而且如果这两个值大于当前屏幕的大小，鼠标只能移到屏幕最边界的位置同时抛出 MoveTargetOutOfBoundsExecption 的异常
	 * @param xOffset  以(0,0)为中心的坐标轴的横坐标
	 * @param yOffset  以(0,0)为中心的坐标轴的纵坐标
	 */
	public static void moveToElement(int xOffset,int yOffset){
		action.moveByOffset(xOffset, yOffset);
	}

}
