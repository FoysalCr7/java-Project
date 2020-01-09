
package traintricketsystem;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
class javaTricket {


    
    Connection conn=null;
    public static Connection ConnecrDB()   {
    try{
         Class.forName("org.sqlite.JDBC");
         Connection conn=DriverManager.getConnection("jdbc:sqlite:TrainTricketSystem.sqlite");
         JOptionPane.showMessageDialog(null, "Connected");
         return conn;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Not Connected");
        return null;
           
       }
    
    }
    
}
