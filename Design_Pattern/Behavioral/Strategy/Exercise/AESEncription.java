package Design_Pattern.Behavioral.Strategy.Exercise;

public class AESEncription implements Encription {

    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using AES");
        System.out.println(message);
    }

}