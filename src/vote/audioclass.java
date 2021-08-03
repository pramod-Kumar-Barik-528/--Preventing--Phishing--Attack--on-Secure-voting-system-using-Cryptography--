/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vote;

import jaco.mp3.player.MP3Player;
import java.io.*;

/**
 *
 * @author SRIKANTA JENA
 */
public class audioclass {
    
    //finding the absolute path
      File f = new File("src\\");
        String path = f.getAbsolutePath();
       
    //beep
    
    String beep = (path+"\\vote\\audio\\"+"beep.mp3");
    MP3Player beep1 = new MP3Player(new File(beep));
    
    /*welcome to securing voting with v crypt*/
    String aud1 = (path+"\\vote\\audio\\"+"wc_ssv.mp3");
    MP3Player welcom1 = new MP3Player(new File(aud1));
    
     /*welcome to securing voting system*/
       String aud2 = (path+"\\vote\\audio\\"+"wc_by_ssv.mp3");
    MP3Player welcom2 = new MP3Player(new File(aud2));
    
     /*given id wrong*/
     String aud3 = (path+"\\vote\\audio\\"+"given_id_wrong.mp3");
    MP3Player idwrong = new MP3Player(new File(aud3));  
    
       /* candidate registration*/
    String aud4 = (path+"\\vote\\audio\\"+"c_reg.mp3");
    MP3Player c_reg = new MP3Player(new File(aud4));
    
       /*home page announcement*/
       String aud5 = (path+"\\vote\\audio\\"+"hp_anno.mp3");
    MP3Player hpanno = new MP3Player(new File(aud5));
    
       /*admin page announcement*/
    String aud6 = (path+"\\vote\\audio\\"+"admin_ui.mp3");
    MP3Player adminui = new MP3Player(new File(aud6));
    
       /*voting preference*/
    String aud7 = (path+"\\vote\\audio\\"+"v_pre.mp3");
    MP3Player vpref = new MP3Player(new File(aud7));
    
       /*voter regestration*/
    String aud8 = (path+"\\vote\\audio\\"+"v_reg.mp3");
    MP3Player vreg = new MP3Player(new File(aud8));
    
       /*start voting*/
   String aud9 = (path+"\\vote\\audio\\"+"start_vt.mp3");
    MP3Player stvt = new MP3Player(new File(aud9));
    
      
     /*start button*/
   String aud10 = (path+"\\vote\\audio\\"+"start_btn.mp3");
    MP3Player stbtn = new MP3Player(new File(aud10));
 
         /*start camera*/
    String aud11 = (path+"\\vote\\audio\\"+"click_cam.mp3");
    MP3Player scam = new MP3Player(new File(aud11));
    
         /*look to camera*/
   String aud123 = (path+"\\vote\\audio\\"+"loookcamera.mp3");
    MP3Player lkcamera = new MP3Player(new File(aud123));
    
         /*voter token story*/
      String aud13 = (path+"\\vote\\audio\\"+"voter_reg.mp3");
    MP3Player vregstory = new MP3Player(new File(aud13));
    
        /*retake picture*/
    String aud14 = (path+"\\vote\\audio\\"+"retake.mp3");
    MP3Player rtk = new MP3Player(new File(aud14));
    /*show me token start page of voting*/
    String aud15 = (path+"\\vote\\audio\\"+"show_me_token.mp3");
    MP3Player stk = new MP3Player(new File(aud15));
     /*tkn not processing*/
    String aud16 = (path+"\\vote\\audio\\"+"token_not_processing.mp3");
    MP3Player tknprocess = new MP3Player(new File(aud16));
     /*tkn prntd*/
    String aud17 = (path+"\\vote\\audio\\"+"token_printed.mp3");
    MP3Player tkprntd = new MP3Player(new File(aud17));
   
      /*show token to camera*/
   String aud18 = (path+"\\vote\\audio\\"+"show_tkn_to_cam.mp3");
    MP3Player stkntocam = new MP3Player(new File(aud18));
    
    /*notification 1*/
   String aud19 = (path+"\\vote\\audio\\"+"noti1.mp3");
    MP3Player btncrf = new MP3Player(new File(aud19));
    
}
