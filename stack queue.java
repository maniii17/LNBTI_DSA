import java.util.Stack;

class QueueStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int data) {
        stack1.push(data);
        System.out.println("Enqueued: " + data);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        int data = stack2.pop();
        System.out.println("Dequeued: " + data);
        return data;
    }

    public int peek() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueStacks queue = new QueueStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Peek: " + queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(40);
        System.out.println("Peek: " + queue.peek());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
