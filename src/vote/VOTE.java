/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vote;

import com.github.sarxos.webcam.Webcam;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SRIKANTA JENA
 */
public class VOTE {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        // TODO code application logic here
   
            audioclass ac2 = new audioclass();
            ac2.beep1.play();
ac2.welcom2.play();
 index Splash= new index();
        Splash.setVisible(true);
      
try{ 
int i=0;
      
for(i = 1; i<20; i++)
        {
              Thread.sleep(100);
        Splash.titl.setText("Creating required directory`s...."); 
         Splash.loadingnumber.setText(Integer.toString(i)+"%");
        Splash.loadingbar.setValue(i);    
               
        }     
        Thread.sleep(2000);
        //*********************************folder creation:::
        
                          
                           System.out.println("******** @author SRIKANTA JENA ******** \n ************************************* \n this code will generate the projects assest folder automatically.");
                             System.out.println("creating the directory for secure voting system");  
        Thread.sleep(3000);
                              //createing dir automatically
                               String svs = "C:\\SVS1.0\\";
                             File fsvs = new File(svs);
                                 boolean boolsvs = fsvs.mkdir();
                            if(boolsvs)
                               {
                               System.out.println("SVS 1.0 success");
                                }
                                 else
                                 {
                            System.out.println("failed to create ...already available");
                               }
//creating require directory .....with loading status                      
         String data = "C:\\SVS1.0\\data\\";
        File fdata = new File(data);
        boolean boold = fdata.mkdir();
        if(boold)
        {
        System.out.println("success");
        }
        else
        {
        System.out.println("failed to create ...already available");
        }
       
         String admin = "C:\\SVS1.0\\data\\admin\\";
        File fad = new File(admin);
        boolean boolad = fad.mkdir();
        if(boolad)
        {
        System.out.println("success");
        }
        else
        {
        System.out.println("failed to create ...already available");
        }
        
         String voter = "C:\\SVS1.0\\data\\voter\\";
        File fvt = new File(voter);
        boolean boolvtr = fvt.mkdir();
        if(boolvtr)
        {
        System.out.println("success");
        }
        else
        {
        System.out.println("failed to create ...already available");
        }
        
         String photo = "C:\\SVS1.0\\data\\admin\\photo\\";
        File f = new File(photo);
        boolean bool = f.mkdir();
        if(bool)
        {
        System.out.println("success");
        }
        else
        {
        System.out.println("failed to create ...already available");
        }
              
        String qrcode = "C:\\SVS1.0\\data\\admin\\qrcode\\";
        File f1 = new File(qrcode);
        boolean bool2 = f1.mkdir();
        if(bool2)
        {
        System.out.println("success");
        }
        else
        {
        System.out.println("failed to create ...already available");
        }
        
              
        String textdata = "C:\\SVS1.0\\data\\admin\\textdata\\";
        File f3 = new File(textdata);
        boolean bool3 = f3.mkdir();
        if(bool3)
        {
        System.out.println("success");
        }
        else
        {
        System.out.println("failed to create ...already available");
        }
        
            String token = "C:\\SVS1.0\\data\\admin\\token\\";
        File f4 = new File(token);
        boolean bool4 = f4.mkdir();
        if(bool4)
        {
        System.out.println("success");
        }
        else
        {
        System.out.println("failed to create ...already available");
        }
        
        
        
        
        
         String vphoto = "C:\\SVS1.0\\data\\voter\\photo\\";
        File f5 = new File(vphoto);
        boolean bool5 = f5.mkdir();
        if(bool5)
        {
        System.out.println("success");
        }
        else
        {
        System.out.println("failed to create ...already available");
        }
        
              
        String vqrcode = "C:\\SVS1.0\\data\\voter\\qrcode\\";
        File f7 = new File(vqrcode);
        boolean bool7 = f7.mkdir();
        if(bool7)
        {
        System.out.println("success");
        }
        else
        {
        System.out.println("failed to create ...already available");
        }
        
              
        String vtextdata = "C:\\SVS1.0\\data\\voter\\textdata\\";
        File f8 = new File(vtextdata);
        boolean bool8 = f8.mkdir();
        if(bool8)
        {
        System.out.println("success");
        }
        else
        {
        System.out.println("failed to create ...already available");
        }
        
            String vtoken = "C:\\SVS1.0\\data\\voter\\token\\";
        File f6 = new File(vtoken);
        boolean bool6 = f6.mkdir();
        if(bool6)
        {
        System.out.println("success");
        }
        else
        {
        System.out.println("failed to create ...already available");
        }
        
        
                                 String vgarbage = "C:\\SVS1.0\\data\\voter\\garbage\\";
                                File f9 = new File(vgarbage);
                                 boolean bool9 = f9.mkdir();
                                if(bool9)
                                {
                              System.out.println("success");
                              }
                                else
                              {
                              System.out.println("failed to create ...already available");
                              }
        
                              System.out.println("now check your D; drive their is SVS1.0 is available !!!"); 
    
    
                
                              
for(i = 20; i<=50; i++)
        {
              Thread.sleep(100);
    Splash.titl.setText("Checking database connection...");
                 Splash.loadingnumber.setText(Integer.toString(i)+"%");
        Splash.loadingbar.setValue(i);  
                
         }
                                //checking database connection...with load bar 
        
               
            Connection conn;
       try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","srikanta45");
	if(conn!=null)
	{
	System.out.println("connected...........");
         Splash.titl.setText("Database connected..."); 
	}
	}catch(ClassNotFoundException | SQLException e){ Splash.titl.setText("Database not found !!!"); }
         
    
Thread.sleep(3000);
  
  
for(i = 50; i<=70; i++)
        {
              Thread.sleep(100);
  Splash.titl.setText("Installing library files...");
                 Splash.loadingnumber.setText(Integer.toString(i)+"%");
        Splash.loadingbar.setValue(i);  
        
     }
                
for(i = 70; i<=80; i++)
                    {
              Thread.sleep(100);
                Splash.titl.setText("Loading interface...");
                 Splash.loadingnumber.setText(Integer.toString(i)+"%");
                    Splash.loadingbar.setValue(i);       
      
                  } 
Splash.titl.setText("Checking for default camera...");
Webcam webcam = Webcam.getDefault();
               webcam.open();
              if(webcam.open())
              {
              Thread.sleep(2000);
              }
              else{ Splash.titl.setText("Camera not found !!"); }
              webcam.close();

for(i = 80; i<=90; i++)
                    {
              Thread.sleep(100);
                Splash.titl.setText("Loading interface...");
                 Splash.loadingnumber.setText(Integer.toString(i)+"%");
                      Splash.loadingbar.setValue(i);     
             
                  }
              
for(i = 90; i<=100; i++)
                    {
              Thread.sleep(100);
                Splash.titl.setText("Opening Secure voting...");
                 Splash.loadingnumber.setText(Integer.toString(i)+"%");
                     Splash.loadingbar.setValue(i);      
                  }
i=100;
  Splash.titl.setText("Opening Secure voting...");
                 Splash.loadingnumber.setText(Integer.toString(i)+"%");             
        
}catch(Exception e){}    

    
       
          star start = new star();
        Splash.dispose();
        start.setVisible(true);

        
       
      }
 
    }

