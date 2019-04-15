/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagrafica;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ark
 */
public class Mensaje implements Serializable{
    
    private int idProceso;
    private int numeroMens;
    private String cad;
    private List<Tuplas>  vector;

    public Mensaje(int idProceso, int numeroMens, String cad, List<Tuplas> vector) {
        this.idProceso = idProceso;
        this.numeroMens = numeroMens;
        this.cad = cad;
        this.vector = vector;
    }

    public int getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(int idProceso) {
        this.idProceso = idProceso;
    }

    public int getNumeroMens() {
        return numeroMens;
    }

    public void setNumeroMens(int numeroMens) {
        this.numeroMens = numeroMens;
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }

    public List<Tuplas> getVector() {
        return vector;
    }

    public void setVector(List<Tuplas> vector) {
        this.vector = vector;
    }

    @Override
    public String toString() {
//        if(vector.size()==0){
//            return "Mensaje{" + idProceso + ", " + numeroMens + ", M=" + cad + ", Hm=" + 0 + '}';
//        }else{
        
        return "Mensaje{" + idProceso + ", " + numeroMens + ", M" + cad + ", Hm= "+vector ;
        //}
    }
    
    
}
