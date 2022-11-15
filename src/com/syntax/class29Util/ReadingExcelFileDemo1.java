package com.syntax.class29Util;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcelFileDemo1 {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+"/"+"utils"+"/"+"Test.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet 1");
        int noOfRows = sheet.getPhysicalNumberOfRows();
    }
}
