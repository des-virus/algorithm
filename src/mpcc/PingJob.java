/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpcc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thuctap02
 */
public class PingJob extends Thread {

    public int TRY_PING = 2;
    public int PING = 0;
    public int PONG = 0;

    @Override
    public void run() {
        while (TRY_PING >= 0) {
            System.out.println("- Ping dang dien ra");
            System.out.println("** Ping | Pong | Try: " + PING + " | " + PONG + " | " + TRY_PING);
            PONG++;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PingJob.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (PING < PONG) {
                 System.out.println("** Ping | Pong | Try: " + PING + " | " + PONG + " | " + TRY_PING);
                TRY_PING--;
            }
        }
        System.out.println("- Client khong co phan hoi --> Go khoi ds online");
    }

}
