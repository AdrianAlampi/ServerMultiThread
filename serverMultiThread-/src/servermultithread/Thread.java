/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servermultithread;

/**
 *
 * @author adrya
 */
public class Thread implements Runnable {

    private int n, r = 0;

    public Thread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        somma();

    }

    public void somma() {
        r = r + n;
    }

}
