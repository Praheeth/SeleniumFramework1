package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtils 
{
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;


	public excelUtils(String excelPath,String sheetName)
	{
		try
		{
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

	public static int getRowCount()

	{

		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("The total no of rows : " + rowcount);
        return rowcount;
	}
	public static int getColCount()

	{

		int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("The total no of Columns : " + colcount);
        return colcount;
	}

	public static String getCellDataString(int rowNum , int colNum)
	{

		String celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println("The first cell data is: " + celldata);
        return celldata;
	}

	public static void getCellDataNumber(int rowNum , int colNum)
	{

		int celldata = (int) sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		//System.out.println("The second cell data is: " + celldata);

	}
}
