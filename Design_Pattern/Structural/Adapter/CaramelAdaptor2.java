package Design_Pattern.Structural.Adapter;

import Design_Pattern.Structural.Adapter.FilterFramwork.Caramel;

public class CaramelAdaptor2 extends Caramel implements Filter {

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }

}