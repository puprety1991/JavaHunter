package com.syntax.class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ExcelListMap {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+"/"+"utils"+"/"+"Test.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        int noOfRows = sheet.getPhysicalNumberOfRows();

        //getting the first row that we can use it as keys for our map
        Row headerRow = sheet.getRow(0);

        //the Map that will store the data for each row
        ArrayList<LinkedHashMap<String,String>> excelData = new ArrayList<>();// a list can hold maps

        // A loop that goes through all the rows that contain the data.
        for(int rowNo=1;rowNo<noOfRows;rowNo++){
            LinkedHashMap<String,String>rowMap=new LinkedHashMap<>();
            // get a row from sheet one by one through loop
            Row dataRow = sheet.getRow(rowNo);
            int noOfCells = dataRow.getPhysicalNumberOfCells();
            for(int cellNo=0;cellNo<noOfCells;cellNo++){

                // getting keys from header row and values from data row
                String key = headerRow.getCell(cellNo).toString();
                String value = dataRow.getCell(cellNo).toString();

                rowMap.put(key,value);
            }
            excelData.add(rowMap);
            //System.out.println(rowMap);
        }
        System.out.println(excelData);
    }
}
