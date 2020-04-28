package Design_Pattern.Structural.Adapter;

import Design_Pattern.Structural.Adapter.FilterFramwork.Caramel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelAdatper1(new Caramel()));
    }
}