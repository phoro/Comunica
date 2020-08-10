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

    //el constructor assigna la base de dades i la ocnnecta
    public Data(String database) {
        this.database = database;
        connectaBD();

    }

    public void connectaBD() {
        String server = "127.0.0.1";
        int port = 5432;
        String user = "ucomunica";
        String pass = "pcomunica";

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
            //imprimeix
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public void setDatabase(String database) {
        this.database = database;
    }

}
