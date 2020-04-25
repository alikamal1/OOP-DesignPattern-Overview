package Design_Pattern.Behavioral.Strategy.Exercise;

public class DESEncription implements Encription {

    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using DES");
        System.out.println(message);
    }
}