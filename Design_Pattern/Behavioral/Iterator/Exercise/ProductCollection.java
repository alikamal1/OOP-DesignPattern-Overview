package Design_Pattern.Behavioral.Iterator.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public List<Product> getProducts() {
    return products;
  }

  public Iterator<Product> createIterator() {
    return new ListIterator(this);
  }

  

}
