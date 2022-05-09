public class Mutable <T> implements ListNode<T>{


    ListNode<T> next;
    T value;

    public Mutable(T newVal, ListNode<T> newNext) {

        next = newNext;
        value = newVal;

    }


    public T data() {

        return value;

    }


    public ListNode<T> next() {
        return next;
    }


    public ListNode<T> setNext(ListNode<T> newNext) {
        if(this.next == null){

            next = newNext;
            }else {
            System.out.println("Not the end of the list");

        }

        return next;

    }

    public boolean isEmpty() {

        return next == null;

    }

     public boolean hasCycle(ListNode<T> head){

        ListNode<T> fast = head;
        ListNode<T> slow = head;

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

}
