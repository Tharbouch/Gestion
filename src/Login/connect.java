/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

/**
 *
 * @author TAHA
 */

import java.sql.*;

public class connect {
    public Connection connect ;
    public PreparedStatement preparedstm ;
    public Statement stm;
    public ResultSet result ;

    /*Connect */
public void connectDb(){
        try{
             connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","taha123");
             System.out.println(" Connecion bien Etablie");
             
    }catch(Exception e){
            System.out.println("Connexion Non Etablie : Exception : "+ e.getMessage());
    }}
/* Desconnect*/
 public void deconnectDb(){
           try{
               connect.close();
               System.out.println(" Connecion bien Ferme");
           }catch(Exception e){
            System.out.println("Connexion Non Fermé : Exception : "+ e.getMessage());
    }
        }}