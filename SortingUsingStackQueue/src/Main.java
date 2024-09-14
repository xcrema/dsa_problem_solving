import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> inputQueue = new LinkedList<>();
        inputQueue.add(5);
        inputQueue.add(1);
        inputQueue.add(2);
        inputQueue.add(6);
        inputQueue.add(3);
        inputQueue.add(4);

        Stack<Integer> stack = new Stack<>();

        Queue<Integer> outputQueue = new LinkedList<>();

        while (!inputQueue.isEmpty()) {
            int inputElem = inputQueue.poll();
            while (!stack.isEmpty() && stack.peek() < inputElem) {
                outputQueue.add(stack.pop());
            }
            stack.add(inputElem);
        }

        while (!stack.isEmpty()) {
            outputQueue.add(stack.pop());
        }

        System.out.println(outputQueue);
    }
}