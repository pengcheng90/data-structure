import java.util.LinkedList;

//从尾部到头打印链表
public class LinkedListStruture {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(null);

        //方法1：递归法
        reversePrint(listNode);

        //方法2：辅助栈法
        assistStack(listNode);
    }

    //1,2,3 -> 3,2,1
    public static void reversePrint(ListNode head) {
        //递归打印
        recursion(head, null);
    }

    //方法一：递归打印
    public static void recursion(ListNode listNode, ListNode head) {
        if (head == null) {
            head = listNode;
        }

        ListNode next = listNode.next;
        if (next != null) {
            recursion(next, head);
            System.out.println(next);
        }
        if (head == listNode) {
            System.out.println(head);
        }
    }

    //方法一：辅助栈，利用栈的先入后出特点
    public static void assistStack(ListNode listNode) {
        LinkedList<Integer> linkedList = new LinkedList();

        linkedList.add(listNode.val);

        ListNode next = listNode.next;

        while (next != null) {
            linkedList.add(next.val);
            next = next.next;
        }

        while (linkedList.peek() != null) {
            System.out.println(linkedList.removeLast());
        }
    }

    static class ListNode {
        private int val;
        private ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }
    }

}