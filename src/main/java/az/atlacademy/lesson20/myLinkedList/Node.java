package az.atlacademy.lesson20.myLinkedList;

final class Node<E> {
    private final E data;
    private Node<E> next;

    public Node(E data) {
        this(data, null);
    }

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "{data = %s}".formatted(data);
    }

    public E getData() {
        return data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
