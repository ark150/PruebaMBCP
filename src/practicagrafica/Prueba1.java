/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagrafica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ark
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Tuplas> prue = new ArrayList<>();
        prue.add(new Tuplas(1,2));
        prue.add(new Tuplas(2,2));
        for (Tuplas tuplas : prue) {
            System.out.println(tuplas);
        }
    }
    
}
