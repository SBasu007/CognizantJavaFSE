package CognizantJavaFSE.Week1_DesignPatterns.FactoryMethodPatternExample.code;
public class ExcelDocument implements Document {
    public void open(){
        System.out.println("Excel doc opening.");
    }
}