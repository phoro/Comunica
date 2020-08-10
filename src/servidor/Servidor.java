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

/**
 * escolta els clients pel port designat es comunica amb una base de dades
 *
 * @author r0b
 */
public class Servidor {

    //port del servidor
    private final int PORT = 5000;
    private ServerSocket servidor = null;//socket servidor
    private Socket sclient = null;//socket auxiliar client per rebre clients

    // Stream d'entrada i sortida de tipus primitius
    private DataInputStream in;
    private DataOutputStream out;

    // per comunicar-se amb la bd
    private Data data = new Data("comunica");

    public static void main(String[] args) {

        Servidor server = new Servidor();
        server.engega();
    }

    public void engega() {

        try {
            
            data.connectaBD("127.0.0.1", 5432, "ucomunica", "pcomunica");
            //socket del servidor
            servidor = new ServerSocket(PORT);
            System.out.println("Servidor iniciat");

            //Escolta continua de peticions de clients 
            while (true) {

                //Espera que es connecti un client
                sclient = servidor.accept();
                System.out.println("Client connectat");

                // stream de dades i/o vinculat al socket client
                in = new DataInputStream(sclient.getInputStream());
                out = new DataOutputStream(sclient.getOutputStream());

                //Llegeix missatge entrant
                String missatge = in.readUTF();

                System.out.println("Servidor ha rebut el següent missatge: " + missatge);

                //Resposta
                data.taulaAll("caixer");
                out.writeUTF("¡Hola món des del servidor!");

                //Desconnecto client
                sclient.close();
                System.out.println("Client desconectat");

            }

        } catch (IOException ex) {

        }
    }

    
}
