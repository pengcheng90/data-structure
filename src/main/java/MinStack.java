import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
 * 调用 min、push 及 pop 的时间复杂度都是 O(1)。
 *
 * 解决：使用辅助栈使min时间复杂的为O(1)
 */
public class MinStack {

    Stack<Integer> a, b;

    MinStack() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("min:" + stack.min());

        System.out.println("pop:" + stack.pop());
        System.out.println("pop:" + stack.pop());
        System.out.println("pop:" + stack.pop());

    }

    public void push(Integer v) {
        a.add(v);
        if (b.isEmpty() || b.peek() > v) {
            b.add(v);
        }
    }

    public Integer min() {
        return b.pop();
    }

    public Integer pop() {
        return a.pop();
    }

}
