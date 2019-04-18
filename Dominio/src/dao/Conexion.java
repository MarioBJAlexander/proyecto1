/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

//import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Iepiadm
 */
public class Conexion {
    public static Connection conectarBD(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/matricula", "root", "123456789");            
            return con;
        } catch (SQLException ex) {
            System.out.println("Problema al conectarse: "+ex);
        }
        return null;
    }
}
