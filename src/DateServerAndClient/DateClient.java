package DateServerAndClient;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class DateClient {
    public static void main(String[] args) throws IOException {
        var socket = new Socket("localhost", 59090);
        var in = new Scanner(socket.getInputStream());
        System.out.println("Server response: " + in.nextLine());
    }
}
