public interface ListNodeImmutable<T> {

    T data();

    ListNodeImmutable<T> next();

    boolean hasCycle (ListNodeImmutable<T> node);

    boolean isEmpty();

}
