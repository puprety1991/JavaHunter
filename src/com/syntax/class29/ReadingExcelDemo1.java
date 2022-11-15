package com.syntax.class29;

import com.syntax.utils.ExcelReader;

import java.io.IOException;

public class ReadingExcelDemo1 {
    public static void main(String[] args) throws IOException {
        var excelData = ExcelReader.read("/Users/puskaruprety/eclipse_workplace/JavaBasics/src/com/syntax/utils/Test.xlsx");
        System.out.println(excelData);
    }
}
