package mipt.sbt;


/**
 * Created by Violetta on 05/10/2018.
 */
public class LinkedList<E> {

    private LinkedListNode<E> first = null;
    private int size = 0;

    public void add(LinkedListNode<E> node) {
        node.setNext(first);
        first = node;
        size ++;
    }

    public void add(LinkedListNode<E> node, int index) {
        LinkedListNode<E> tmp = first;
        int i = 0;
        checkElementIndex(index);
        while (i < index-1) {
            tmp = tmp.getNext();
            i++;
        }
        node.setNext(tmp.getNext());
        tmp.setNext(node);
        size ++;
    }

    public E get(int index) {
        checkElementIndex(index);
        LinkedListNode<E> tmp = first;
        int i = 0;
        while (i < index)) {
            tmp = tmp.getNext();
            i++;
        }
        return tmp.getValue();
    }

    public E remove(int index) {
        checkElementIndex(index);
        LinkedListNode<E> tmp = first;
        int i = 0;
        while (tmp.hasNext()) {
            tmp = tmp.getNext();
            i++;
        }
        if ((tmp.hasNext())&&(tmp.getNext().hasNext())){
            tmp.setNext(tmp.getNext().getNext());
        } else {
            tmp.setNext(null);
        }
        return first.getValue();
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException();
    }

    class LinkedListNode<E> {
        private E value;
        private LinkedListNode<E> next = null;

        public LinkedListNode(E value) {
            this.value = value;
        }

        public void setNext(LinkedListNode<E> next) {
            this.next = next;
        }

        public LinkedListNode<E> getNext() {
            return next;
        }

        public boolean hasNext() {
            return next!=null;
        }

        public E getValue() {
            return value;
        }
    }
}

