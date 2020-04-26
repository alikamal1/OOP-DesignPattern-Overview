package Design_Pattern.Behavioral.ChainOfResponsibility.Exercise;

public class QuickBooksReader extends DataReader {

    @Override
    protected String getExtension() {
        return ".qbw";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from a QuickBook file: ");
    }

}