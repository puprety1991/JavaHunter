package com.syntax.randomPractice.exercise;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        String path="/Users/puskaruprety/Desktop/demo.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row=sheet.getRow(1);
        System.out.println(row.getCell(1));
    }
}
