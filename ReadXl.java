import java.io.FileInputStream;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;;
/** * This program read date values from XLSX file in Java using Apache POI. * * @author WINDOWS 8 * */
public class ReadXl
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		//writeIntoExcel("birthdays.xlsx"); 
		readFromExcel("book.xlsx");
	}
	public static void readFromExcel(String file) throws IOException
	{
		ArrayList data = new ArrayList();
		XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(file));
		XSSFSheet myExcelSheet = myExcelBook.getSheet("book");
		java.util.Iterator<Row> itr = myExcelSheet.iterator();
	    while (itr.hasNext()) {
	        Row rowitr = (Row) itr.next();
	        java.util.Iterator<Cell> cellitr = rowitr.cellIterator();
	        while(cellitr.hasNext()) {
	            Cell celldata = (Cell) cellitr.next();

	            switch(celldata.getCellType()) {
	            case STRING:
	                data.add(celldata.getStringCellValue());
	                break;
	            case NUMERIC:
	                data.add(celldata.getNumericCellValue());
	                break;
	            case BOOLEAN:
	                data.add(celldata.getBooleanCellValue());
	                break;
	            }
	        }
	        System.out.println(data);
	    }
		
	}
/*	@SuppressWarnings("deprecation")
	public static void writeIntoExcel(String file) throws FileNotFoundException, IOException
	{
		Workbook book = new XSSFWorkbook();
		Sheet sheet = book.createSheet("Birthdays");
		Row row = sheet.createRow(0);
		Cell name = row.createCell(0);
		name.setCellValue("Gokul");
		Cell birthdate = row.createCell(1);
		DataFormat format = book.createDataFormat();
		CellStyle dateStyle = book.createCellStyle();
		dateStyle.setDataFormat(format.getFormat("dd.mm.yyyy"));
		birthdate.setCellStyle(dateStyle);
		birthdate.setCellValue(new Date(115, 10, 10));
		sheet.autoSizeColumn(1);
		book.write(new FileOutputStream(file)); book.close();
	}*/
}