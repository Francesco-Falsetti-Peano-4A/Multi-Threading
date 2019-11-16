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
public class TPS091119 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Parte Hi e Hello
        Hi w1=new Hi();
        Hello w2=new Hello();
        w1.start();
        w2.start();
        //Parte say
        Say w3 = new Say("ciao");
        Say w4 = new Say("ciao1");
        Say w5 = new Say("ciao2");
        w3.start();
        w4.start();
        w5.start();

    }

}
