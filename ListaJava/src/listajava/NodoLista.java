/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listajava;

/**
 *
 * @author Sistemas
 */
public class NodoLista {
    private String datos;
    private NodoLista siguiente;

    public NodoLista() {
        this.datos = null;
        this.siguiente = null;
    }
    public String getDatos() {
        return datos;
    }
    public void setDatos(String datos) {
        this.datos = datos;
    }
    public NodoLista getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
    
}
