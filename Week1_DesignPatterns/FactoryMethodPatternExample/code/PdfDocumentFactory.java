package CognizantJavaFSE.Week1_DesignPatterns.FactoryMethodPatternExample.code;
public class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}