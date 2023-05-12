package az.atlacademy.lesson20;

import az.atlacademy.lesson20.linkedlist.MyLinkedListIndexOutOfrBoundException;

public class MyLinkedList<E> {

    public MyNode<E> head;
    public int size = 0;

    public MyLinkedList(E data) {
        this.head = new MyNode<>(data);
        this.size = 1;
    }

    public void addTail(E data) {
        if (head == null) {
            head = new MyNode<>(data);
            return;
        }
        MyNode<E> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new MyNode<>(data);
        this.size++;
    }

    public void addHead(E data) {
        // MyNode<E> newHead = new MyNode<>(data, head);
        // this.head = newHead;
        this.head = new MyNode<>(data, head);
        this.size++;
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public String toString() {
        String result = "[";
        MyNode<E> curr = head;
        while (curr != null) {
            result = result.concat(curr.toString()).concat(" -> ");
            curr = curr.next;
        }
        return result.concat("null]");
    }

    public MyNode<E> search(int index){
        MyNode<E> curr = head;
        int counter=0;
        if(index<0 || index>this.size){
            throw new MyLinkedListIndexOutOfrBoundException("Wrong Index");
        }else{
            while(true){
                if(counter==index){
                    return curr.next;
                }else{
                    curr=curr.next;
                    counter++;
                }
            }
        }
    }

}