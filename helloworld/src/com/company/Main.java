package com.company;

import test.input.LessonOneJavaTaste;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

;

/**
 * @author lipc
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(LessonOneJavaTaste.test);
        System.out.println(LessonOneJavaTaste.funcTest("this is you input"));
        LessonOneJavaTaste.tasteFinal("");
        char[] chineseBuf = new char[256];
        System.out.println("hey, may I have your name, please? ");
        int n = 0;
        Reader r = new InputStreamReader(System.in);
        try {
            n = r.read(chineseBuf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("hello, Mr. " + chineseBuf[0]);
    }
}