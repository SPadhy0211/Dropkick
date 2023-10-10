package GenericUtils;

import java.io.FileInputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;

public class ExcelUtility {
	
	public String readDataFromExcel(String sheetName, int rowNum, int cellNum) throws Throwable
	{
		FileInputStream fs = new FileInputStream(IPathConstants.EXCEL_PATH);
		Workbook book = WorkbookFactory.create(fs);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(book.getSheet(sheetName).getRow(rowNum).getCell(cellNum));
		return value;
	}
	
	public Map<String, String> readMultipleDataFromExcel(String sheetName, int keyColumn, int valueColumn) throws Throwable
	{
		FileInputStream fs = new FileInputStream(IPathConstants.EXCEL_PATH);
		Workbook book = WorkbookFactory.create(fs);
		Sheet sh = book.getSheet(sheetName);
		int count = sh.getLastRowNum();
		DataFormatter df = new DataFormatter();
		
		Map<String, String> map = new LinkedHashMap<String, String>();
		
		for(int i=1; i<=count; i++)
		{
			String key = df.formatCellValue(sh.getRow(i).getCell(keyColumn));
			String value = df.formatCellValue(sh.getRow(i).getCell(valueColumn));
			map.put(key, value);
		}
		return map;
	}

}
