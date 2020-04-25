package Design_Pattern.Behavioral.Iterator.Exercise;

public interface Iterator<T> {

    boolean hasNext();
    T current();
    void next();

}