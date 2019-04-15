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
public class Proceso {
    
    private int id;
    private List<Tuplas> ci;
    private int puerto;
    private String Direccion;
    private int []vector;

    public Proceso(int id) {
        this.id = id;
        this.ci= new ArrayList<Tuplas>();
        this.vector= new int []{0,0,0,0,0,0};
    }

    public Proceso(int id, int puerto, String Direccion) {
        this.id = id;
        this.puerto = puerto;
        this.Direccion = Direccion;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Tuplas> getCi() {
        return ci;
    }

    public void setCi(List<Tuplas> ci) {
        this.ci = ci;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }
    
    public void sumarVector(int id){
        this.vector[id]++;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
    
}
