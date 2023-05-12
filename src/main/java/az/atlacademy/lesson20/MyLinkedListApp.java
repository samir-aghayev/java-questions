package az.atlacademy.lesson20;

public class MyLinkedListApp {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(5);
        System.out.println(linkedList);
        linkedList.addTail(6);
        System.out.println(linkedList);
        linkedList.addTail(7);
        System.out.println(linkedList);
    }
}