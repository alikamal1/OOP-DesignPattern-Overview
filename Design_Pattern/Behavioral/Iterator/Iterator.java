package Design_Pattern.Behavioral.Iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}