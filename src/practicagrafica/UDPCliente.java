/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagrafica;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ark
 */
public class UDPCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            DatagramSocket aSocket = new DatagramSocket();
            String cad= "Hola";
            //modificacion para mandar objeto
            List<Tuplas> ci = new ArrayList<Tuplas>();
            Mensaje me = new Mensaje(1,1,"Hola",ci);
            byte[] incoming= new byte[1024];
            ByteArrayOutputStream outputstream = new ByteArrayOutputStream();
            ObjectOutputStream os = new ObjectOutputStream(outputstream);
            os.writeObject(me);
            byte[] data = outputstream.toByteArray();
            
            //byte [] m = cad.getBytes();
            InetAddress aHost= InetAddress.getByName("localhost");
            int serverPort = 6789;
            //envio del objecto
            DatagramPacket sendPacket = new DatagramPacket(data, data.length,aHost, serverPort);
            
            //DatagramPacket request = new DatagramPacket(m,cad.length(),
            //        aHost,serverPort);
            aSocket.send(sendPacket);
//            byte [] buffer = new byte[1000];
//            DatagramPacket reply = new DatagramPacket(buffer, 
//                    buffer.length);
            
            //Modificacion recepcion del objeto
            DatagramPacket incomingPacket = new DatagramPacket(incoming, incoming.length);
            
            aSocket.receive(incomingPacket);
            String response = new String(incomingPacket.getData());
            System.out.println("Reply: "+new String(response));
            aSocket.close();
        }catch(SocketException e){System.out.println("Socket: "+e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(UDPCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
