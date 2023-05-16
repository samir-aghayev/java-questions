package az.atlacademy.lesson22.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Optional;

public class StackApp {
    private static final Deque<Operation> stack = new LinkedList<>();

    public static void main(String[] args) {
        doOperation();
        System.out.println(stack);
        doOperation();
        System.out.println(stack);
        doOperation();
        System.out.println(stack);
        doOperation();
        System.out.println(stack);
        ctrlZ();
        System.out.println(stack);
    }

    public static String doOperation() {
        int random = (int) (Math.random() * Operation.values().length);
        stack.add(Operation.values()[random]);
        return stack.peek().toString();
    }

    public static Optional<Operation> ctrlZ() {
        if (!stack.isEmpty()) {
            Operation operationEnum = stack.peek();
            stack.poll();
            return Optional.of(operationEnum);
        }
        return Optional.empty();
    }
}
