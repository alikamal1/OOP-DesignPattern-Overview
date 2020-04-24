package Design_Pattern.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        var encryptor = new Encryptor(null);
        var compressor = new Compressor(encryptor);
        var authenticator = new Authenticator(compressor);
        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "12345"));
    }
}