package az.atlacademy.lesson22.stack;

import java.util.Deque;
import java.util.LinkedList;

public class StackApp {
    private static final Deque<OperationEnum> stack = new LinkedList<>();

    public static void main(String[] args) {
        doOperations();
        doOperations();
        doOperations();
        doOperations();
        System.out.println(stack);
        ctrlZ();
        System.out.println(stack);
    }

    public static String doOperations() {
        int random = (int) (Math.random() * OperationEnum.values().length);
        stack.add(OperationEnum.values()[random]);
        return stack.peek().toString();
    }

    public static String ctrlZ() {
        OperationEnum operationEnum = stack.peek();
        stack.poll();
        return operationEnum.toString();
    }
}
