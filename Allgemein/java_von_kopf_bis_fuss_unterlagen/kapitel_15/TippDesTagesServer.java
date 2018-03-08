/*
 * Created on 17.12.2005
 */

package kapitel_15;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TippDesTagesServer {

  String[] tippListe = {"Nehmen Sie kleinere Bissen zu sich.", "Holen Sie sich die engen Jeans. Nein, Sie sehen darin NICHT dick aus.", "Mit einem Wort: unmöglich!", "Seien Sie ehrlich, nur heute mal. Sagen Sie Ihrem Boss, was Sie *wirklich* denken.", "Vielleicht wollen Sie doch noch mal über diesen Haarschnitt nachdenken."};

  public void los() {

  try {
    ServerSocket serverSock = new ServerSocket(4242);
  
  
  
    while(true) {
      Socket sock = serverSock.accept();
      PrintWriter writer = new PrintWriter(sock.getOutputStream());
      String tipp = getTipp();
      writer.println(tipp);
      writer.close();
      System.out.println(tipp);
    }
    
    } catch(IOException ex) {
      ex.printStackTrace();
    }
  } // los() schließen
  
  private String getTipp() {
    int random = (int) (Math.random() * tippListe.length);
    return tippListe[random];
  }
  
  public static void main(String[] args) {
    TippDesTagesServer server = new TippDesTagesServer();
    server.los();
  }
}

