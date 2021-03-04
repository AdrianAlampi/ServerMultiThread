/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servermultithread;

import java.net.Socket;

/**
 *
 * @author alampi.adrian
 */
public class Thread1 implements Runnable {

    private int risultato, valore;

    public Thread1(int risultato,int valore) {
        this.valore = valore;
    }
 
    public void run() {
        risultato = this.risultato + valore;
    }
    
    
    
}
