/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author GAME
 */
public class Client {
    
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
        
        try{
            //socket client
            Socket sclient = new Socket(HOST, PORT);
            
            // stream de dades i/o vinculat al socket
            in = new DataInputStream(sclient.getInputStream());
            out = new DataOutputStream(sclient.getOutputStream());
            
            //Envia missatge
            out.writeUTF("missatge enviat des del client");
            
            //Rep missatge
            String missatgerebut = in.readUTF();
            System.out.println("client: em diuen " + missatgerebut);
            
            sclient.close();
            
        }catch (Exception ex){
            
        }
        
    }
    
}
