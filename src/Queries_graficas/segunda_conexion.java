/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queries_graficas;
import java.sql.*;
/**
 *
 * @author biosh
 */
public class segunda_conexion {
    
    public static Connection getConnection(){ /*LAPTOP-V0J5NPNQ\MSSQLSERVER01*/
            String conexionUrl= "jdbc:sqlserver://LAPTOP-V0J5NPNQ\\MSSQLSERVER01:1433;"
                    + "database=Proyecto;"
                    + "user=conexion;"
                    + "password=Proyecto_Bases:);"
                    + "loginTimeout=30";
            try{
                Connection con = DriverManager.getConnection(conexionUrl);
                return con;
            }catch(SQLException ex){
                System.out.println(ex.toString());
                return null;
            }
            
    }
    public static void main(String[] args) {
        segunda_conexion nuevo=new segunda_conexion();
        nuevo.getConnection();
        
    }
}
