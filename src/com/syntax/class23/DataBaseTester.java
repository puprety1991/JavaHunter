package com.syntax.class23;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase=new Oracle();
        dataBase.openData();
        dataBase.readData();
        dataBase.writeData();
        dataBase.closeDatabase();
    }
}
