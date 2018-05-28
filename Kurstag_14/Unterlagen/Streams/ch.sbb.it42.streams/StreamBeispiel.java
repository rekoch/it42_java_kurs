/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.streams;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

public class StreamBeispiel {

    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("C:\\temp\\mk\\ausgabe_datei.txt");


        fos.write(new byte[]{'h'});
        fos.write(new byte[]{'a'});
        fos.write(new byte[]{'l'});
        fos.write(new byte[]{'l'});
        fos.write(new byte[]{'o'});

        fos.close();
    }


    // Ineffizienz -> BufferedOutputStream verwenden (Wrapping)

    // .flush zeigen

    // PrintStream

    // Socket socket = new Socket("127.0.0.1", 7777);
    // new PrintStream(socket.getOutputStream()));
}
