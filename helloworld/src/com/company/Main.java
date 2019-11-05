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

import lesson.fourth.DoubleLink;

import java.io.IOException;

/**
 * @author lipc
 * link is like this firstNode => secondNode => thirdNode => fourthNode
 */
public class Main {
    public static void main(String[] args) throws IOException {
        DoubleLink firstNode = new DoubleLink("firstNode");
        DoubleLink secondNode = new DoubleLink("secondNode");
        DoubleLink thirdNode = new DoubleLink("thirdNode");
        DoubleLink fourthNode = new DoubleLink("fourthNode");

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        secondNode.previous = firstNode;
        thirdNode.next = fourthNode;
        thirdNode.previous = secondNode;
        fourthNode.previous = thirdNode;

        String queryIndex = DoubleLink.queryNode(secondNode);
        System.out.println(String.format("the query is %s", queryIndex));
        System.out.println(DoubleLink.queryNode(firstNode));
        System.out.println(DoubleLink.queryNode(fourthNode));
    }
}
