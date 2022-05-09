public class Immutable<T> implements ListNodeImmutable<T> {

     private final ListNodeImmutable<T> next;
     private final T value;

    public Immutable(T newVal, ListNodeImmutable<T> newNext) {

        next = newNext;
        value = newVal;
    }

    public T data() {

        return value;
    }

    public ListNodeImmutable<T> next() {
        return next;
    }

    public boolean hasCycle(ListNodeImmutable<T> head){

        ListNodeImmutable<T> fast = head;
        ListNodeImmutable<T> slow = head;

        if(head == null)
            return false;

        if(head.next() == null)
            return false;

        while(fast != null && fast.next() != null){
            slow = slow.next();
            fast = fast.next().next();

            if(slow == fast)
                return true;
        }

        return false;
    }

    public boolean isEmpty() {

        return next == null;

    }

}
