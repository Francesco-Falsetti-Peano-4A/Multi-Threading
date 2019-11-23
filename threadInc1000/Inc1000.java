/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestInc1000;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author falsetti.francesco
 */
public class Inc1000 extends Thread {

    static int count;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            count += 1;
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Inc1000.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
