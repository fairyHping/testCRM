package com.selenium.test.base;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelTableToArray {
	/**
	 * 从Excel(.xls)文件中读取数据(read data from excel file(only for .xls)
	 * 
	 * @param xlFilePath
	 *            工作簿文件位置
	 * @param sheetName
	 *            Excel中的工作表名
	 * @param cellName
	 *            起始单元格
	 * @return 返回值为String[][]类型
	 * @throws Exception
	 *             读取文件过程中抛出的异常
	 */
	public static String[][] getTableArray(String xlFilePath, String sheetName, String cellName) throws Exception {
		String[][] tabArray = null;
		// 起始行号（0开始）
		int startRow;
		// 起始列号（0开始）
		int startCol;
		// 结束行号（0开始）
		int endRow;
		// 结束列号（0开始）
		int endCol;
		// 二维数组的行
		int ci;
		// 二维数组的列
		int cj;

		// 获取工作簿
		Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
		// 读取工作表
		Sheet sheet = workbook.getSheet(sheetName);
		// 读取起始单元格
		Cell cellStart = sheet.findCell(cellName);

		startRow = cellStart.getRow();
		startCol = cellStart.getColumn();

		// 结束的单元格
		Cell cellEnd = sheet.findCell(cellName, startCol + 1, startRow + 1, 100, 64000, false);

		endRow = cellEnd.getRow();
		endCol = cellEnd.getColumn();
		System.out.println(
				"startRow=" + startRow + ", endRow=" + endRow + ", " + "startCol=" + startCol + ", endCol=" + endCol);
		tabArray = new String[endRow - startRow - 1][endCol - startCol - 1];
		ci = 0;

		for (int i = startRow + 1; i < endRow; i++, ci++) {
			cj = 0;
			for (int j = startCol + 1; j < endCol; j++, cj++) {
				tabArray[ci][cj] = sheet.getCell(j, i).getContents();
			}
		}
		return (tabArray);
	}


}
