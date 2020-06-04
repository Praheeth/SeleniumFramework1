package test;

import utils.excelUtils;

public class excelUtilsDemo 
{
	static String projectpath = System.getProperty("user.dir");

	public static void main(String[] args) 
	{
		excelUtils excel = new excelUtils(projectpath +"/excel/Data.xlsx", "Sheet1"); 	 
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
		excel.getColCount();
	}
}
