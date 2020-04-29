package Design_Pattern.Structural.Decorator;

public class EncryptCloudStream implements Stream {

    private Stream stream;

    public EncryptCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        stream.write(encrypted);
    }

    private String encrypt(String data) {
        return "!*&*#@&!^$(&*!@&*#&";
    }

}