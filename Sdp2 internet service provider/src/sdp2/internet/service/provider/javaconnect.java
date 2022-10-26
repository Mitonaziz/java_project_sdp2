/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdp2.internet.service.provider;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class javaconnect {
public static java.sql.Connection ConnecrDb(){
  try{
     
     return DriverManager.getConnection("jdbc:mysql://localhost/Isp_Internet_service_provider", "root", "");
  } catch(SQLException e){
      
  }
        return null;
}
}
