/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vote;

/**
 *
 * @author SRIKANTA JENA
 */
public class tsleep extends Thread {

    @Override
    public void run()
    {
        try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
    }
    
}
