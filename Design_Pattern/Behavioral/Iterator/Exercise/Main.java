package Design_Pattern.Behavioral.Iterator.Exercise;

public class Main {
    public static void main(String[] args) {
        
        var products = new ProductCollection();
        products.add(new Product(0, "Product 1"));
        products.add(new Product(1, "Product 2"));
        products.add(new Product(2, "Product 3"));
        products.add(new Product(3, "Product 4"));
        products.add(new Product(4, "Product 5"));
        products.add(new Product(5, "Product 6"));

        products.createIterator();
        
        var iterator = new ListIterator(products);
        while(iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }

    }
}