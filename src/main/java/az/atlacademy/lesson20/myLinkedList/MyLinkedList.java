package az.atlacademy.lesson20.myLinkedList;

import java.util.Optional;

public class MyLinkedList<E> {
    private Node<E> head;

    public MyLinkedList(E data) {
        this.head = new Node<>(data);
    }

    public void addTail(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<E> curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(newNode);
    }

    public void addHead(E data) {
        head = new Node<>(data, head);
    }

    public void clear() {
        head = null;
    }

    public int getSize() {
        int size = 0;
        Node<E> cur = head;
        while (cur != null) {
            cur = cur.getNext();
            size++;
        }
        return size;
    }

    public Optional<E> findByIndex(int index) throws MyLinkedListOutOfBoundException {
        if (index < 0 || index >= getSize()) {
            throw new MyLinkedListOutOfBoundException(index + " is wrong");
        }
        Node<E> curr = head;
        int counter = 0;
        while (curr != null) {
            if (index == counter++) {
                return Optional.of(curr.getData());
            }
            curr = curr.getNext();
        }
        return Optional.empty();
    }

    /**
     * homework
     */
    public void deleteTail() {
        Node<E> curr = head;
        if (curr.getNext() == null) {
            head = null;
        }
        while (curr.getNext() != null) {
            if (curr.getNext().getNext() == null) {
                curr.setNext(null);
            } else {
                curr = curr.getNext();
            }
        }
    }

    public void deleteHead() {
        head = head.getNext();
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= getSize()) {
            throw new MyLinkedListOutOfBoundException(index + " is wrong");
        }
        if (index == 0) {
            deleteHead();
        } else {
            Node<E> curr = head;
            for (int i = 1; i <= index; i++) {
                if (i == index) {
                    curr.setNext(curr.getNext().getNext());
                } else {
                    curr = curr.getNext();
                }
            }
        }
    }

    @Override
    public String toString() {
        String result = "[";
        Node<E> cur = head;
        while (cur != null) {
            result = result.concat(cur.toString()).concat(" -> ");
            cur = cur.getNext();
        }
        return result.concat("{null}]");
    }
}
