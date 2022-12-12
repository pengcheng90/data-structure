import java.util.LinkedList;

/**
 * 用两个栈实现队列
 */
public class Queue {
    LinkedList<Integer> a, b;

    public Queue() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }

    public void appendTail(int v) {
        a.addLast(v);
    }

    public Integer deleteHead() {
        if (!b.isEmpty()) return b.removeLast();

        while (!a.isEmpty()) {
            b.addLast(a.removeLast());
        }
        return b.removeLast();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.appendTail(1);
        queue.appendTail(2);

        System.out.println(queue.deleteHead());
    }


}

