package util;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {
    public static String getCellValue(String EXCEL_PATH , String sheet, int row , int column) throws IOException {
        String value="";
        try {
            Workbook wb = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
            value = wb.getSheet(sheet).getRow(row).getCell(column).toString();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return value;
    }
}
