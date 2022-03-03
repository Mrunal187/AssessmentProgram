package testutil;

import base.Base;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestUtil extends Base {
    static Workbook book;
    static Sheet sheet;
    public static String TESTDATA_SHEET_PATH = "src/main/resources/Excel/LoginData1.xlsx";

    public TestUtil() throws IOException {
    }

    public static Object[][] getTestData(String path, String sheetname) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(TESTDATA_SHEET_PATH);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);
            System.out.println("name is:" + book);

        } catch (EncryptedDocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = book.getSheet(sheetname);
        System.out.println("sheet is : " + sheet);
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        System.out.println("data is:" + data);
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                try {
                    data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return data;
    }
}