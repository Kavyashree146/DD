package UtilityPackage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class conatins method related to Excel file
 * 
 * @author Kavyashree
 *
 */
public class ExcelFileUtility {
	/**
	 * This method is used to read data from Excel sheet 
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws Exception
	 */
	public String toReadDataFromExcelFile(String sheetName, int row, int cell) throws Exception {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Sitemap.xls");
		Workbook workbook = WorkbookFactory.create(fis);
		String value = workbook.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}
