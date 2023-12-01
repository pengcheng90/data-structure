package tree;

/**
 * RED-BLACK tree红黑树
 */
public class RBTree {

    private static final boolean RED = true;
    private static final boolean BLACK = false;
    //根节点
    private RBNode root;

    public RBNode getRoot() {
        return root;
    }

    public void setRoot(RBNode root) {
        this.root = root;
    }

    /**
     * 实现左旋
     *     p             pr
     *    /\            /\
     *   pl pr  ==>    p rr
     *      /\        /\
     *     rl rr    pl rl
     *  左旋操作：
     *     p-pl 和 pr-rr 的关系不需要调整
     *     需要调整的情况
     *     1. pr-rl 调整为 p-rl
     *        将rl变为p的右子节点
     *        将p设置为rl的父节点
     *     2.判断p是否有父节点
     *       有
     *          pr.parent = p.parent
     *          pr为 p.parent的子节点，到底是 左子节点还是右子节点呢？
     *          if p.parent.left == p
     *              p.parent.left = r
     *           else
     *              p.parent.right = r
     *       没有
     *         直接把pr设置为 root节点
     *      3.最后 p和pr 交换
     *        p.parent = r
     *        r.left = p
     *
     * @param p
     */
    public void leftRotate(RBNode p) {

        //1
        RBNode r = p.right;
        p.right = r.left;
        r.left.parent = p;

        //2
        r.parent = p.parent;
        if (p.parent != null) {
            if (p.parent.left == p) {
                p.parent.left = r;
            }
            if (p.parent.right == p) {
                p.parent.right = r;
            }
        } else {
            root = r; //设置为root节点
        }
        //3
        p.parent = r;
        r.left = p;
    }


    /**
     * RBNode
     * static修饰内部类可以直接new RBTree.RBNode()创建使用，否则需要先new RBTree，再new RBNode使用
     */
    static class RBNode {
        private RBNode left;
        private RBNode right;
        private RBNode parent;

        public RBNode(RBNode left, RBNode right, RBNode parent) {
            this.left = left;
            this.right = right;
            this.parent = parent;
        }

        public RBNode getLeft() {
            return left;
        }

        public void setLeft(RBNode left) {
            this.left = left;
        }

        public RBNode getRight() {
            return right;
        }

        public void setRight(RBNode right) {
            this.right = right;
        }

        public RBNode getParent() {
            return parent;
        }

        public void setParent(RBNode parent) {
            this.parent = parent;
        }
    }
}
