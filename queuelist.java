import java.util.LinkedList;
import java.util.List;

class QueueList {
    private List<Integer> queueList;

    public QueueList() {
        queueList = new LinkedList<>();
    }

    public void enqueue(int data) {
        queueList.add(data);
        System.out.println("Enqueued: " + data);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queueList.remove(0);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queueList.get(0);
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    public void display() {
        System.out.println("Queue: " + queueList);
    }

    public static void main(String[] args) {
        QueueList queue = new QueueList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        queue.dequeue();
        queue.display();

        System.out.println("Peek: " + queue.peek());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
