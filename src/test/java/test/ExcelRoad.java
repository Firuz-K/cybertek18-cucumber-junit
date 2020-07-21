package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelRoad {

    public static void main(String[] args) throws Exception {


        //opn the file
        File file = new File("src/SampleData.xlsx");
        System.out.println(file.exists());

        //load the file in to our Java Memory
        FileInputStream fileInputStream = new FileInputStream(file);

        // load the excel workbook int to the java class
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //getting the sheet from the workbook
        XSSFSheet sheet = workbook.getSheet("Employees");

        System.out.println("sheet.getRow(2).getCell(1) = " + sheet.getRow(2).getCell(1));

        int usedRows = sheet.getPhysicalNumberOfRows();
       //will count only the used cells
        //if if there rae some cells that not used, they not will be counted

        int lastUsedRow = sheet.getLastRowNum();
        // will count form top to bottom
        // does not care if empty cell or used cell
        //this starts from 0

        for(int rowNum =0; rowNum<usedRows; rowNum++){
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Neena")){
                System.out.println("Neena's name " + sheet.getRow(rowNum).getCell(0));
            }
        }

        for(int rowNum =0; rowNum<usedRows; rowNum++){
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Adam")){
                System.out.println("Adam's name is "+sheet.getRow(rowNum).getCell(1));
            }
        }

    }
}