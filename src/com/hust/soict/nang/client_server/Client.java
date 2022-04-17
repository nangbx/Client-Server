package com.hust.soict.nang.client_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class Client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 9898);
        Scanner scanner = new Scanner(System.in);

        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            System.out.println(in.readLine());
            while(true){
                String message = scanner.nextLine();
                System.out.println(message);
                if(message == null || message.isEmpty())
                    break;
                out.println(message);
                System.out.println(in.readLine());
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        } finally {
            try{
                socket.close();
                scanner.close();
            } catch (IOException e) {};
        }


    }


}
