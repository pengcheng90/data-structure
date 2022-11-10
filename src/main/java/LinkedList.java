
//从尾部到头打印链表
public class LinkedList {

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

        reversePrint(listNode);
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
        }
        System.out.println(next);

        if (head == listNode) {
            System.out.println(head);
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
