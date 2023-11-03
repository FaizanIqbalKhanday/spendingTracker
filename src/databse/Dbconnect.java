/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databse;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author faizan iqbal khanday
 */
public class Dbconnect {
    public static Connection c;
    public static Statement st;
    static {
    try{
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb"+"?useSSL=false",
                    "root","Phaixann@121");
        st=c.createStatement();
        
    }
    catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
    }
}
    
    
    
}
