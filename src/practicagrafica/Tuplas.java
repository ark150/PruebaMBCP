/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagrafica;

import java.io.Serializable;

/**
 *
 * @author ark
 */
public class Tuplas implements Serializable{
    
    private final int idProceso;
    private final int idNumeroMensaje;

    public Tuplas(int idProceso, int idNumeroMensaje) {
        this.idProceso = idProceso;
        this.idNumeroMensaje = idNumeroMensaje;
    }

    public int getIdProceso() {
        return idProceso;
    }

    public int getIdNumeroMensaje() {
        return idNumeroMensaje;
    }

    @Override
    public String toString() {
        return "(" + idProceso + ", " + idNumeroMensaje + ')';
    }
    
}
