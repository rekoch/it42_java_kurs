/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class StreamBeispiel {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:\\temp\\mk\\beispiel\\ausgabedatei.txt");
            fos.write(new byte[]{'h'});
            fos.write(new byte[]{'a'});
            fos.write(new byte[]{'l'});
            fos.write(new byte[]{'l'});
            fos.write(new byte[]{'o'});
        } catch (IOException e) {
            throw e;
        } finally {
            if (fos != null) {
                fos.close();
            }
        }
    }


    // Ineffizienz -> BufferedOutputStream verwenden (Wrapping)

    // System.out

    // .flush

    // PrintStream

    // Socket socket = new Socket("127.0.0.1", 7777);
    // new PrintStream(socket.getOutputStream()));
}
