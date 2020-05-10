package Design_Pattern.Structural.Proxy;

public class ReakEBook {
    
    private String fileName;

    public ReakEBook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loading the ebook " + fileName);
    }

}