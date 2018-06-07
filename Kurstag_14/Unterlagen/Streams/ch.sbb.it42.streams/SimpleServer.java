/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(7777);
        System.out.println("Server wartet auf Verbindung auf Port 7777...");

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client hat Verbindung aufgebaut.");
            try {

                InputStream inputStream = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

                while (true) {
                    String zeile = reader.readLine();
                    if (zeile == null) {
                        break;
                    }
                    System.out.println("Empfangener Text: " + zeile);
                }
            } catch (IOException e) {
                System.out.println("Ein Fehler ist aufgetreten: " + e);
            } finally {
                socket.close();
            }
        }
    }
}
