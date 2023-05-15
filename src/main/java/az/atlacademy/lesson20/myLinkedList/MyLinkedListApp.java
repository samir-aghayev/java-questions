package az.atlacademy.lesson20.myLinkedList;

public class MyLinkedListApp {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(15);
        System.out.println(linkedList);

        linkedList.addTail(5);
        System.out.println(linkedList);

        linkedList.addTail(6);
        System.out.println(linkedList);

        linkedList.addTail(7);
        System.out.println(linkedList);

        linkedList.addTail(8);
        System.out.println(linkedList);

        linkedList.addHead(9);
        System.out.println(linkedList);

        System.out.println(linkedList.getSize());

        System.out.println(linkedList.findByIndex(5));
        System.out.println(linkedList);

        linkedList.deleteHead();
        System.out.println(linkedList);

        linkedList.deleteTail();
        System.out.println(linkedList);

        linkedList.deleteAtIndex(2);
        System.out.println(linkedList);
    }
}
