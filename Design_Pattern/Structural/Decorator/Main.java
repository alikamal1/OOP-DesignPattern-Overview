package Design_Pattern.Structural.Decorator;


public class Main {
    public static void main(String[] args) {
        storeCreditCard(new CloudStream());
        storeCreditCard(new EncryptCloudStream(new CloudStream()));
        storeCreditCard(new CompressedCloudStream(new CloudStream()));
        storeCreditCard(new EncryptCloudStream(new CompressedCloudStream((new CloudStream()))));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1264-345345-123424");
    }
}