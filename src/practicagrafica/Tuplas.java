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
    
    private int idProceso;
    private int idNumeroMensaje;

    public Tuplas(int idProceso, int idNumeroMensaje) {
        this.idProceso = idProceso;
        this.idNumeroMensaje = idNumeroMensaje;
    }

    public int getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(int idProceso) {
        this.idProceso = idProceso;
    }

    public int getIdNumeroMensaje() {
        return idNumeroMensaje;
    }

    public void setIdNumeroMensaje(int idNumeroMensaje) {
        this.idNumeroMensaje = idNumeroMensaje;
    }

    @Override
    public String toString() {
        return "(" + idProceso + ", " + idNumeroMensaje + ')';
    }
    
}
