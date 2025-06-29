package CognizantJavaFSE.Week1_DesignPatterns.FactoryMethodPatternExample.code;
public class PdfDocument implements Document {
    public void open(){
        System.out.println("Pdf doc opening.");
    }
}