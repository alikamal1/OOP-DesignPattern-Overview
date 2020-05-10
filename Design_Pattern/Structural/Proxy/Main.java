package Design_Pattern.Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = { "a", "b", "c" };
        for (var fileName : fileNames)
            library.add(new EbookProxy(fileName));
        library.openEbook("a");
        library.openEbook("b");

        library.add(new LoggingEbookProxy(fileNames[2]));
        library.openEbook("c");
    }
}