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
 * @author r0b
 */
public class Client {

    //Servidor host i port
    final String HOST = "127.0.0.1";
    final int PORT = 5000;

    // Stream d'entrada i sortida de tipus primitius
    DataInputStream in;
    DataOutputStream out;

    //Socket client
    Socket sclient;

    //missatge a  enviar
    public static String missatge = "buit";

    Vclient vclient = new Vclient(this);

    //Constructor
    public Client() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // host servidor i port
        Client cliente = new Client();
        cliente.engega();

    }

    public void engega() {
        try {
            //UI
            vclient.setVisible(true);
            //socket client
            sclient = new Socket(HOST, PORT);

            // stream de dades i/o vinculat al socket
            in = new DataInputStream(sclient.getInputStream());
            out = new DataOutputStream(sclient.getOutputStream());

            //Envia missatge
            envia(missatge);

            //Llegeix missatge
            llegeix();

            atura();

        } catch (Exception ex) {

        }

    }

    public void llegeix() {

        String missatgerebut;
        try {
            missatgerebut = in.readUTF();
            if (missatgerebut.equals("¡Hola món des del servidor!")){
                System.out.println("client: em diuen " + missatgerebut);
                vclient.infotext(missatgerebut + "\n");
            } else {
                vclient.jTextFieldsaldo.setText(missatgerebut);
            }
            

        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void atura() {
        try {
            //TODO
            sclient.close();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void formata() {
        //TODO
    }

    public void envia(String missatge) {
        try {

            out.writeUTF(missatge);

        } catch (IOException ex) {

        }
    }

    public String getMissatge() {
        return missatge;
    }

}
