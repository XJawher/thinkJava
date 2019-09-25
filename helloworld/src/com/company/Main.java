package com.company;

import lesson.two.LessonTwoDataStructureStack;

import java.io.IOException;

/**
 * @author lipc
 */
public class Main {

    public static void main(String[] args) throws IOException {
        byte[] buf = new byte[512];
        int length = System.in.read(buf);

        LessonTwoDataStructureStack s = new LessonTwoDataStructureStack(512);

        for (int i = 0; i < length; i++) {
            if (buf[i] == '(' || buf[i] == '[' || buf[i] == '{') {
                s.push(buf[i]);
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

        if (s.isEmpty()) {
            System.out.println("4 unmatched");
        } else {
            System.out.println("all matched");
        }
    }
}
