package Design_Pattern.Behavioral.ChainOfResponsibility.Exercise;

public class DataReaderFactory {
    public static DataReader getDataReaderChain() {
        var excelReader = new ExcelReader();
        var numberReader = new NumbersReader();
        var quickBooksReader = new QuickBooksReader();

        quickBooksReader.setNext(numberReader);
        numberReader.setNext(excelReader);

        return quickBooksReader;
    }
}