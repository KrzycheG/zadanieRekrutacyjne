interface ListNode<T>  {

    ListNode<T> setNext(ListNode<T> next);
    T data();

    ListNode<T> next();

    boolean hasCycle (ListNode<T> node);

    boolean isEmpty();

}