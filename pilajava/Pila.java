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
public class Pila implements PilaInterface{
    
    private PilaNodo top;

    @Override
    public void push(String datos) {
        PilaNodo nodo = new PilaNodo(datos);
        if (top == null) {
            top = nodo;
        } else {
            nodo.setSiguiente(top);
            top = nodo;
        }
    }

    @Override
    public String pop() {
        PilaNodo aux = top;
        top = top.getSiguiente();
        return aux.getDatos();
    }

    @Override
    public String peek() {
        if (top != null) {
            return top.getDatos();
        } else {
            return "La pila esta vacía.";
        }
    }

    @Override
    public boolean vacia() {
        if (top != null) {
            return false;
        } else {
            return true;
        }          
    }

    @Override
    public int size()   {
        int tam = 0;
        PilaNodo aux = top;
        while (aux != null) {            
            tam++;
            aux = aux.getSiguiente();
        }
        return tam;
    }
    
    
    
}
