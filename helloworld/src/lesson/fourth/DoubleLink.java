package lesson.fourth;

/**
 * DoubleLink firstNode = new DoubleLink("firstNode");
 * DoubleLink secondNode = new DoubleLink("secondNode");
 * DoubleLink thirdNode = new DoubleLink("thirdNode");
 * DoubleLink fourthNode = new DoubleLink("fourthNode");
 * <p>
 * firstNode.next = secondNode;
 * secondNode.next = thirdNode;
 * secondNode.previous = firstNode;
 * thirdNode.next = fourthNode;
 * thirdNode.previous = secondNode;
 * fourthNode.previous = thirdNode;
 * <p>
 * String queryIndex = DoubleLink.queryNode(secondNode);
 * System.out.println(String.format("the query is %s", queryIndex));
 * System.out.println(DoubleLink.queryNode(firstNode));
 * System.out.println(DoubleLink.queryNode(fourthNode));
 * <p>
 * Generic<Integer> ci = new Generic<>(1);
 * System.out.println(ci.data);
 * System.out.println(ci.getClass().getName());
 * <p>
 * Generic<String> cs = new Generic<>("this is String data");
 * System.out.println(cs.getClass().getName());
 * System.out.println(cs.data);
 *
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
