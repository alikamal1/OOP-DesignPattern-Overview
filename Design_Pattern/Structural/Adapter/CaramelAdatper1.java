package Design_Pattern.Structural.Adapter;

import Design_Pattern.Structural.Adapter.FilterFramwork.Caramel;

public class CaramelAdatper1 implements Filter {

    private Caramel caramel;

    public CaramelAdatper1(Caramel caramel) {
        this.caramel = caramel;
    }
    
    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }

}