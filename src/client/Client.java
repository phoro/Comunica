/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GAME
 */
public class Client {
    
    public Client(Socket sclient){
        
    }

    //TODO
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // host servidor i port
        final String HOST = "127.0.0.1";
        final int PORT = 5000;

        // Stream d'entrada i sortida de tipus primitius
        DataInputStream in;
        DataOutputStream out;
        
        Socket sclient;//socket client
        Client cliente = null;

        try {
            //socket client
            sclient = new Socket(HOST, PORT);

            // stream de dades i/o vinculat al socket
            in = new DataInputStream(sclient.getInputStream());
            out = new DataOutputStream(sclient.getOutputStream());

            //Envia missatge
            // clientw.envia("hola");
            /**/
            try {
                //TODO
                //Envia missatge
                out.writeUTF("nola");
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Rep missatge
            String missatgerebut = in.readUTF();
            System.out.println("client: em diuen " + missatgerebut);

            sclient.close();

        } catch (Exception ex) {

        }

    }

    public void llegeix() {
        //TODO
    }

    public void formata() {
        //TODO
    }

    public void envia(String missatge) {
        try {
            //TODO

        } catch (Exception ex) {

        }
    }

}
