package SumaIzExcelaDomaci;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelSuma {
        File file;
        FileInputStream fis;
        XSSFWorkbook wb;
        XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;

    public ExcelSuma(String filePath) throws IOException {
        file = new File(filePath);
        fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
    }
    public int getIntegerData(int sheetIndex, int rowNumber, int cellNumber) {
        sheet = wb.getSheetAt(sheetIndex);
        row = sheet.getRow(rowNumber);
        cell = row.getCell(cellNumber);
        return (int) cell.getNumericCellValue();
    }

   /* public int getIntegerDataName(String sheetName, int rowNumber, int cellNumber) {
        sheet = wb.getSheet(sheetName);
        row = sheet.getRow(rowNumber);
        cell = row.getCell(cellNumber);
        return (int) cell.getNumericCellValue();
    } */

    public int getLastRow(int sheetIndex){
        sheet = wb.getSheetAt(sheetIndex);
        return this.sheet.getLastRowNum();
    }
}