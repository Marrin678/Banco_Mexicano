/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2_banco;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    public Conexion getConnection() {
      Connection con = null;  
      String base = "bancobd";
      String url = "jdbc:mysql://localhost:3306/"+base;
      String user = "root";
      String password = "";
      
      try{
          Class.forName("com.mysql.jbdc.Driver");
          con = (Connection) DriverManager.getConnection(url, user, password);
      } catch (Exception e){ 
       System.err.println(e);   
      }
      return (Conexion) con;
    }
    
}
