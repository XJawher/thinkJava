/*
package com.company;

import lesson.two.LessonTwoDataStructureStack;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author lipc
 */
/*
public class Main {

	public static void main(String[] args) throws IOException {
		byte[] buf = new byte[10];
		int length = System.in.read(buf);

		LessonTwoDataStructureStack s = new LessonTwoDataStructureStack(10);
		System.out.println("length is : " + length);

		for (int i = 0; i < length; i++) {
			if (buf[i] == '(' || buf[i] == '[' || buf[i] == '{') {
				s.push(buf[i]);
				System.out.println(Arrays.toString(s.returnData()));
			} else if (buf[i] == ')') {
				if (s.getTop() == '(') {
					s.pop();
				} else {
					System.out.println("1 unmatched");
					System.exit(1);
				}
			} else if (buf[i] == ']') {
				if (s.getTop() == '[') {
					s.pop();
				} else {
					System.out.println("2 unmatched");
					System.exit(1);
				}
			} else if (buf[i] == '}') {
				if (s.getTop() == '{') {
					s.pop();
				} else {
					System.out.println("3 unmatched");
					System.exit(1);
				}
			}
		}

		if (!s.isEmpty()) {
			System.out.println("4 unmatched");
		} else {
			System.out.println("all matched");
		}
	}
}
*/
package com.company;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author lipc
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String s = "Hello World";
        try {
            // create a new stream at specified file
            PrintWriter pw = new PrintWriter(System.out);
            // write the string in the file
            pw.write(s);
            // flush the writer
            pw.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
//        Server.test();
    }

}
