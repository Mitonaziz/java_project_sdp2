/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdp2.internet.service.provider;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;


public class javaconnect {
        Connection conn;
public static java.sql.Connection ConnecrDb(){
  try{
     
     java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/isp", "root", "");
     return conn;
  } catch(Exception e){
      
  }
        return null;
}
}
