package Design_Pattern.Structural.Adapter;

public class VividFilter implements Filter {

    @Override
    public void apply(Image image) {
        System.out.println("Apply Vivid Filter");
    }

}