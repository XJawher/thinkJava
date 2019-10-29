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

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lipc
 */
/*public class Main {

    public static void main(String[] args) throws IOException {
        String readInput;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        readInput = br.readLine();
        PostfixExpression pe = new PostfixExpression();
        pe.consoleLog("this is args");
        pe.getParameterFromMain(readInput);
    }
}*/

/*public class Main {
	private static int a = 1;
	private static int b = 2;

	public static void main(String[] args) {
		swap(a, b);
		System.out.println("a is " + a + ", b is " + b);
	}

	private static void swap(int j, int i) {
		a = i;
		b = j;
	}
}*/

/*public class Main {
	public static void main(String args[]) {
		int n = 10;
		int t = fact(n);
		System.out.println(t);
	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}
}*/

public class Main {
    public static void main(String[] args) throws IOException {
//        new Client();
//        new Server();
//        new Client();
        Server.test();
        Client.test();
    }
}

/**
 * @author lipc
 */
class Server {
    static void test() throws IOException {
        main();
    }

    private static void main() throws IOException {

        ServerSocket ss = new ServerSocket(8080);
        Socket conn = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
        String s = br.readLine();
        while (s != null) {
            System.out.println(s);
            bw.write(s.toUpperCase() + "\n");
            bw.flush();
            s = br.readLine();
        }
        br.close();
        bw.close();
        conn.close();
        System.out.println("this is Serve over");
    }
}

class Client {

    static void test() throws IOException {
        main();
    }

    private static void main() throws IOException {
        Socket conn = new Socket("127.0.0.1", 8080);
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
        bw.write("hello\n");
        bw.flush();
        String s = br.readLine();
        System.out.println(s);

        bw.write("world\n");
        bw.flush();
        s = br.readLine();
        System.out.println(s);


        br.close();
        bw.close();
        conn.close();
        System.out.println("this is Client over");
    }
}