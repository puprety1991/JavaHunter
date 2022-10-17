package com.syntax.class23;

public abstract class DataBase {
    abstract void openData();
    abstract void readData();
    abstract void writeData();
    abstract void closeDatabase();
}
// hover over the error and click on the implement method option and select the method and click OK,
class MicrosoftDatabase extends DataBase{
    @Override
    void openData() {
        System.out.println("Opening the Microsoft Database.");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from Microsoft Database.");
    }

    @Override
    void writeData() {
        System.out.println("Writing the data in the Microsoft Database.");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the Microsoft Database.");
    }
} class Oracle extends DataBase{

    @Override
    void openData() {
        System.out.println("Opening the Oracle Database.");
    }

    @Override
    void readData() {
        System.out.println("Reading the data Oracle Database.");
    }

    @Override
    void writeData() {
        System.out.println("Writing the data in the Oracle Database.");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the Oracle Database.");
    }
}