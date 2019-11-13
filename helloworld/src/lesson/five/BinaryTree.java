package lesson.five;

/**
 * @author lipc
 * @describe Data structure binary tree
 * 当数据量很大的时候,怎么才能不进行比较,直接返回 false
 * 由于 hook 是没有 SCU 方法的,因此就不能直接做 false 返回中断比较,直接让程序不走 diff 的流程
 */
public class BinaryTree {
    public Object data;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(Object d) {
        this.data = d;
        this.left = null;
        this.right = null;
    }
}


