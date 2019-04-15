/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagrafica;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ark
 */
public class UDPServerConHilo implements Runnable{
    
    private int puerto;
    DatagramSocket aSocket;

    public UDPServerConHilo(int puerto) throws SocketException {
        this.puerto = puerto;
        int puertod=this.puerto;
        this.aSocket = new DatagramSocket(puertod);
    }
    
    @Override
    public void run() {
        try{
            // se crea el datagrama para recibir el mensaje
            
            //vector del objeto entrante
            byte [] incoming = new byte[1024];
            Thread miHilo = Thread.currentThread();
            while(true){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(UDPServerConHilo.class.getName()).log(Level.SEVERE, null, ex);
                }
                // se recibe el  datagrama del objeto
                DatagramPacket incomingPackte = new DatagramPacket(incoming, incoming.length);
                aSocket.receive(incomingPackte);
//                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
//                aSocket.receive(request);
                //se combierte el mensaje recibido a bytes
                byte[] data = incomingPackte.getData();
                //objetos para obtener el objeto en el mensaje
                ByteArrayInputStream in = new ByteArrayInputStream(data);
                ObjectInputStream is = new ObjectInputStream(in);
                Mensaje mensaje;
                try {
                    //se obtiene el objeto del mensaje
                    mensaje = (Mensaje) is.readObject();
                    //se obytienen valores del mensaje
                    int idProc = mensaje.getIdProceso();
                    int numeroMen = mensaje.getNumeroMens();
                    String cadena = mensaje.getCad();
                    List<Tuplas> vector = mensaje.getVector();
                    System.out.println("mensaje recibido: "+ idProc+", "+numeroMen+", "+cadena+", "+vector);
                    //condicion de prueba para mostrar mensaje
//                    if(vector==vectorProceso+1){
//                        
//                        vectorProceso++;
//                    }else{
//                        System.out.println("mensaje almacenado");
//                    }
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(UDPServer.class.getName()).log(Level.SEVERE, null, ex);
                }
                //envio de la confirmacion de recepcion del mensaje
                InetAddress ipAddress = incomingPackte.getAddress();
                int port = incomingPackte.getPort();
                String reply = "Thank you for the message";
                byte[] replyBytea = reply.getBytes();
                DatagramPacket replyPacket
                        = new DatagramPacket(replyBytea, replyBytea.length, ipAddress, port);
                aSocket.send(replyPacket);
                
//                DatagramPacket reply = new DatagramPacket(request.getData(),
//                        request.getLength(),request.getAddress(),request.getPort());
//                aSocket.send(reply);
            }
            }catch(SocketException e){System.out.println("Socekt: "+e.getMessage());
            }catch(IOException e){System.out.println("IO: "+e.getMessage());
        }
    }
    
}
