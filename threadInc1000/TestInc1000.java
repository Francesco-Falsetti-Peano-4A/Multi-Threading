/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestInc1000;

/**
 *
 * @author falsetti.francesco
 */
public class TestInc1000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Inc1000 c1=new Inc1000();
        Inc1000 c2=new Inc1000();
        c1.start();
        c1.join();
        c2.start();
        c2.join();
        System.out.println(Inc1000.count);
    }
    
}
