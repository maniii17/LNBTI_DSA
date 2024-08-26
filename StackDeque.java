import java.util.Deque;
import java.util.ArrayDeque;

public class StackDeque<T> {

    private Deque<T> deque;

    public StackDeque() {
        deque = new ArrayDeque<>();
    }

    public void push(T element) {
        deque.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return deque.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return deque.peekFirst();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public int size() {
        return deque.size();
    }

    public static void main(String[] args) {
        StackDeque<Integer> stack = new StackDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());

        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());
    }
}
