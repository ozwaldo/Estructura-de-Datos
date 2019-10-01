/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilajava;

/**
 *
 * @author Sistemas
 */
public class PilaNodo {
    
    private String datos;
    private PilaNodo siguiente;
    
    public PilaNodo (String datos) {
        this.datos = datos;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public PilaNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(PilaNodo siguiente) {
        this.siguiente = siguiente;
    }        
    
}
