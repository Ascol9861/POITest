import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class POItest {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Workbook wb = new HSSFWorkbook();
        try  (FileOutputStream fileOut = new FileOutputStream("Javatpoint.xls")) {
            Sheet sheet1 = wb.createSheet("First Sheet");
            Sheet sheet2 = wb.createSheet("Second Sheet");
            wb.write(fileOut);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
