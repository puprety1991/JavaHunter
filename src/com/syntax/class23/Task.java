package com.syntax.class23;

public class Task {
    /*
    Create a class File that will have the following behaviors:
    open, edit, close. Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
    implementation of open behaviour: Example: to open .java file we need notepad++ or
    sublime text, to open .doc file we need Microsoft Word to be installed etc
     */
    public static void main(String[] args) {
        File[] reader = {new JavaFile(),new WordFile(),new PdfFile()};
        for(File file:reader){
            file.open();
        }
    }
}
abstract class File{
    abstract void open();
     void edit(){
         System.out.println("Editing the file");
    }
    void close(){
         System.out.println("Closing the file");
    }
}
class JavaFile extends File{
    void open(){
        System.out.println("To open .java file will need to have Notepad++ or sublime text.");
    }
}
class WordFile extends File{
    void open(){
        System.out.println("To open .doc file will need have MsWord or need to be installed.");
    }
}
class PdfFile extends File{
    void open(){
        System.out.println("To open .pdf file will need to have Adobe Acrobat.");
    }
}
