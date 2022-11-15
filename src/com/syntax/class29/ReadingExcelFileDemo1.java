package com.syntax.class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcelFileDemo1 {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+"/"+"utils"+"/"+"Test.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        int noOfRows = sheet.getPhysicalNumberOfRows();
        for(int i=0;i<noOfRows;i++){
            Row row = sheet.getRow(i); // get a row from sheet one by one through loop
            int noOfCells = row.getPhysicalNumberOfCells();
            for(int j=0;j<noOfCells;j++){
                System.out.print("| "+row.getCell(j)+" ");
            }
            System.out.println();
        }
    }
}
