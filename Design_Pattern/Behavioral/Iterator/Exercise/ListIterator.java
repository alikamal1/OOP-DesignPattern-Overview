package Design_Pattern.Behavioral.Iterator.Exercise;

class ListIterator implements Iterator<Product> {

    private int index;
    private ProductCollection products;
  
    public ListIterator(ProductCollection products) {
      this.products = products;
    }
  
    @Override
    public boolean hasNext() {
      return index < products.getProducts().size() - 1;
    }
  
    @Override
    public Product current() {
      return products.getProducts().get(index);
    }
  
    @Override
    public void next() {
      index++;
    }
  
  }