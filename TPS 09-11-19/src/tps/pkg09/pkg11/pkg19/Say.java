/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tps.pkg09.pkg11.pkg19;

/**
 *
 * @author falsetti.francesco-iannone.stefano
 */
public class Say extends Thread {

    String cosaDire;

    public Say(String cosaDire) {
        this.cosaDire = cosaDire;
    }

    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println(cosaDire);
        }
    }

}
