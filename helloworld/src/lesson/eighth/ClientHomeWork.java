package lesson.eighth;

import java.io.*;
import java.net.Socket;

/**
 * @author lipc
 */
public class ClientHomeWork {
    public static void main(String[] args) throws IOException {
        Socket conn = new Socket("127.0.0.1", 8080);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("hei,may i have you name please??");
        String s = br.readLine();
        System.out.println("hey ," + s + " please go to Server and take look you name");
        bw.write(s);
        bw.flush();
        br.close();
        bw.close();
        conn.close();
    }
}


