/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servermultithread;
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author alampi.adrian
 */
public class ServerMultiThread {
    /* sviluppare un applicativo client server, che generi tanti Thread quanti dichiarati dall'utente attraverso un Thread a lui dedicato. 
       ogni Thread sommerà a una variabile globale contenuta nel server il proprio valore incrementale assegnatogli dal server, da una a n, dove n è
       il numero dei Thread il server killerà ogni processo dopo che avrà subito solo l'operazione quando tutti i processi saranno killati il server 
       stamperà a console il risultato.
    */

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        try {
            ServerSocket server
                    = new ServerSocket(5500);
            System.out.println("Server è attivo e in ascolto");

            while (true) {
                Socket client = server.accept();
                System.out.println("connessione ricevuta, ora se la smazza il thread");
                Thread Serverino
                        = new Thread(new ServerThread(client));
                Serverino.start();

            }

        } catch (IOException ex) {
            Logger.getLogger(ServerMultiThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}