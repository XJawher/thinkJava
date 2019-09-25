package lesson.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lipc
 * https://zhuanlan.zhihu.com/p/24457041
 * Java
 * decorator modal,a design pattern that adds additional capabilities to objecks
 */
public class LessonTwo {
    public static void lessonTwoInput(String args) {

        System.out.println("hey, may I have your name, please? ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputValue = "";
        try {
            inputValue = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("hello, " + inputValue);
    }
}
