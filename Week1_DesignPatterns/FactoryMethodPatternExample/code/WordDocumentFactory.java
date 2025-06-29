package CognizantJavaFSE.Week1_DesignPatterns.FactoryMethodPatternExample.code;
public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}