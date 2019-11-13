package lesson.five;

/**
 * @author lipc
 */
public class BinarySearchTree<T extends Comparable<T>> {
    private BinaryTree root;

    public boolean insert(T i) {
        if (root == null) {
            root = new BinaryTree(i);
            System.out.println("this is root == null");
            return true;
        }

        BinaryTree current = root;
        while (true) {
            // 如果 i 比当前的值小
            if (i.compareTo((T) current.data) < 0) {
                System.out.println("this is 如果 i 比当前的值小");
                if (current.left != null) {
                    current = current.left;
                } else {
                    current.left = new BinaryTree(i);
                    break;
                }
            } else {
                System.out.println("this is 如果 i 比当前的值大");
                if (current.right != null) {
                    current = current.right;
                } else {
                    current.right = new BinaryTree(i);
                    break;
                }
            }
        }
        System.out.println("this is end");
        return true;
    }
}
