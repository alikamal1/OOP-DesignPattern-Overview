package Design_Pattern.Behavioral.ChainOfResponsibility.Exercise;

public class NumbersReader extends DataReader {

    @Override
    protected String getExtension() {
        return ".numbers";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from a Numbers spreadsheep: ");
    }
    
}