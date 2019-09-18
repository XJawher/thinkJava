package test.input;

/**
 * @author lipc
 */
public class LessonOneJavaTaste {
    public static String test = "this is test !";

    public static String funcTest(String parma) {
        return parma;
    }

    public static void tasteFinal(String param) {
        String a = "go die, ";
        final String b = "final";
        String c = "go die, " + b;
        String d = a + b;
        String e = "go die, final";
        Boolean res1 =
                e == c;
        System.out.println("compare e = 'go die,final' and c = 'do die' + b is point to same object: %s", String.valueOf(e == c));
        System.out.println(e == c);
        System.out.println(e == d);
        System.out.println(c.equals(d));
        String message = String.format("您好%s，晚上好！您目前余额：%.2f元，积分：%d", "张三", 10.155, 10);
        System.out.println(message);
    }
}