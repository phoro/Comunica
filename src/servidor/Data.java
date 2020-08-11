/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author r0b
 */
public class Data {

    String database;
    Connection connexio;

    //el constructor ocnnect la base de dades  
    public Data(String database) {
        this.database = database;

    }

    public void connectaBD(String server, int port, String user, String pass) {

        try {
            //registra el driver per a la connexió amb al servidor
            Class.forName("org.postgresql.Driver");
            //Estableix connexió
            connexio = DriverManager.getConnection("jdbc:postgresql://" + server + ":" + port + "/" + database, user, pass);

        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {

        }

    }

    public void taulaAll(String taula) {
        ResultSet resultSet = null;
        // Create and execute a SELECT SQL statement.
        Statement statement;
        try {
            statement = connexio.createStatement();
            String selectSql = "SELECT * from caixer";
            resultSet = statement.executeQuery(selectSql);
            /*
            //imprimeix
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
            }
             */
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    //comprova si existeix l'usuari
    // Torna saldo si el troba
    //
    public String nomipass(String nomipass) {
        String saldo = "res";
        ResultSet resultSet = null;
        // Create and execute a SELECT SQL statement.
        Statement statement;
        try {
            statement = connexio.createStatement();
            String selectSql = "SELECT saldo FROM caixer WHERE nom = " + "\'" + nomipass + "\'";
            resultSet = statement.executeQuery(selectSql);
            
            if (!resultSet.next()) {//si dona fals, no hi ha resultats
                saldo = "Sense resultats";
                
            } else{
                saldo = resultSet.getString(1);
                //System.out.println(resultSet.getString(1));
            }

            /*
            //imprimeix tots els resultats
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
            */
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);

        }

        return saldo;

    }

    public void setDatabase(String database) {
        this.database = database;
    }

}
