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

import lesson.five.BinarySearchTree;
import lesson.five.BinaryTree;

import java.io.IOException;

/**
 * @author lipc
 * link is like this firstNode => secondNode => thirdNode => fourthNode
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BinaryTree a = new BinaryTree(1);
        BinaryTree b = new BinaryTree(2);
        BinaryTree c = new BinaryTree(3);
        a.left = b;
        a.right = c;
        System.out.println(a.left.left);
        BinarySearchTree lsInsert = new BinarySearchTree();
        System.out.println(lsInsert.insert(1));
        System.out.println(lsInsert.insert(6));
    }
}
