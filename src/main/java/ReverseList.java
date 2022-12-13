/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class ReverseList {

    /**
     * 方法一：迭代（双指针）
     * 考虑遍历链表，并在访问各节点时修改 next 引用指向，算法流程见注释
     *
     * @param listNode
     * @return
     */
    public ListNode reverse1(ListNode listNode) {
        ListNode cur = listNode, pre = null;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    /**
     * 方法二：递归
     * 考虑使用递归法遍历链表，当越过尾节点后终止递归，在回溯时修改各节点的 next 引用指向。
     *
     * @return
     */
    public ListNode reverse2(ListNode cur, ListNode pre) {
        if (cur == null) return pre;
        ListNode result = reverse2(cur.next, cur);
        cur.next = pre;
        return result;
    }

    static class ListNode {
        private Integer val;
        private ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        public ListNode getNext() {
            return next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {

//        ListNode listNode1 = new ListNode(1);
//        ListNode listNode2 = new ListNode(2);
//        ListNode listNode3 = new ListNode(3);
//        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//
//        ReverseList reverseList = new ReverseList();
//        ListNode result = reverseList.reverse1(listNode1);
//        System.out.println(result);

        ListNode listNodeA = new ListNode(1);
        ListNode listNodeB = new ListNode(2);
        ListNode listNodeC = new ListNode(3);
        listNodeA.next = listNodeB;
        listNodeB.next = listNodeC;

        ReverseList reverseList2 = new ReverseList();
        ListNode result2 = reverseList2.reverse2(listNodeA, null);
        System.out.println(result2);
    }

}