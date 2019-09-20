package lesson.two;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author lipc
 * https://zhuanlan.zhihu.com/p/24457041
 * Java
 * decorator modal,a design pattern that adds additional capabilities to objecks
 */
public class LessonTwo {

	public static void lessonTwoInput(String args) {
		char[] inputBuffer = new char[256];
		System.out.println("hey, may I have your name, please? ");
		int n = 0;
		Reader r = new InputStreamReader(System.in);
		try {
			n = r.read(inputBuffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("hello, Mr. " + inputBuffer[0]);
	}
}
