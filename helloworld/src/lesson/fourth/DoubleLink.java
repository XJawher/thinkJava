package lesson.fourth;

/**
 * @author lipc
 */
public class DoubleLink {
    public String data;
    public DoubleLink next;
    public DoubleLink previous;

    public DoubleLink(String data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public static String queryNode(DoubleLink paramLink) {
        if (paramLink.previous == null) {
            return "first link node";
        } else if (paramLink.next == null) {
            return "last link node";
        } else {
            return paramLink.data;
        }
    }
}
