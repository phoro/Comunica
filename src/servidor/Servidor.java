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
 * @author GAME
 */
public class Servidor {

    public static void main(String[] args) {
        //port del servidor
        final int PORT = 5000;
        ServerSocket servidor = null;//socket servidor
        Socket sclient = null;//socket auxiliar client per rebre clients

        // Stream d'entrada i sortida de tipus primitius
        DataInputStream in;
        DataOutputStream out;

        // Connexió amb la base de dades
        Data data = null;

        try {

            //socket del servidor
            servidor = new ServerSocket(PORT);
            System.out.println("Servidor iniciat");

            //Escolta continua
            while (true) {
                data.connectaBD();

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
                out.writeUTF("¡Hola món des del servidor!");

                //Desconnecto client
                sclient.close();
                System.out.println("Client desconectat");

            }

        } catch (IOException ex) {

        }
    }

}
