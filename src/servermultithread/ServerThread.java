/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servermultithread;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alampi.adrian
 */
public class ServerThread implements Runnable {

    private Socket clientSocket;
    private static int risultato=0;

    public ServerThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        System.out.println("Serverino  partito: "
                + clientSocket.getInetAddress());
        try {

            PrintWriter out
                    = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            String richiesta = "";
            while (!richiesta.equals("exit")) {
                String a4=in.readLine();
                int n= Integer.parseInt(a4);
                out.println("caratteri: " + n);
                for (int b = 0; b > n; b++) {
                    int a1=1;
                    Thread1 t1 = new Thread1(risultato,a1);
                    
                }
            }
            out.println("caratteri: " + risultato);
            out.close();
            clientSocket.close();

            System.out.println("chiusura connessione effettuata");

        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
