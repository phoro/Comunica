/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GAME
 */
public class Servidor {

    //TODO establir connexió al servidor BD (p.e. postgresql)
    public static void main(String[] args) {
        //port del servidor
        final int PORT = 5000;
        ServerSocket servidor = null;//socket servidor
        Socket sclient = null;//socket auxiliar client per rebre clients

        // Stream d'entrada i sortida de tipus primitius
        DataInputStream in;
        DataOutputStream out;

        try {

            //socket del servidor
            servidor = new ServerSocket(PORT);
            System.out.println("Servidor iniciat");

            //Escolta continua
            while (true) {
                connectaBD("con");

                //Espera que es connecti un client
                sclient = servidor.accept();
                System.out.println("Client connectat");

                // stream de dades i/o vinculat al socket client
                in = new DataInputStream(sclient.getInputStream());
                out = new DataOutputStream(sclient.getOutputStream());

                //Llegeix missatge entrant
                String missatge = in.readUTF();

                System.out.println("Servidor ha rebut el següent missatge: " + missatge);

                //Le envio un mensaje
                out.writeUTF("¡Hola món des del servidor!");

                //Desconnecto client
                sclient.close();
                System.out.println("Client desconectat");

            }

        } catch (IOException ex) {

        }
    }

    public static void connectaBD(String missatge) {
        String server = "127.0.0.1";
        int port = 5432;
        String user ="ucomunica";
        String pass = "pcomunica";
        String database="comunica";
       ResultSet resultSet = null;
        try {
            //registra el driver per a la connexió amb al servidor
            Class.forName("org.postgresql.Driver");
            //Estableix connexió
            Connection connexio = DriverManager.getConnection("jdbc:postgresql://localhost:5432/comunica", user, pass);
            
            // Create and execute a SELECT SQL statement.
            Statement statement = connexio.createStatement();
            String selectSql = "SELECT * from caixer";
            resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {

        }
    }

}
