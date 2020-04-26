package Design_Pattern.Behavioral.ChainOfResponsibility.Exercise;

public class ExcelReader extends DataReader {

    @Override
    protected String getExtension() {
        return ".xls";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from a Excel spreadsheep: ");
    }

}