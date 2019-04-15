/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagrafica;

import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ark
 */
public class PracticaGrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UDPServerConHilo udph;
        try {
            udph = new UDPServerConHilo(6789);
            udph.run();
        } catch (SocketException ex) {
            Logger.getLogger(PracticaGrafica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // TODO code application logic here
    }
    
}
